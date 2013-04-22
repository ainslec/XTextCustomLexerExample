package org.consoli.xtext.generator.parser.antlr.ex;

import static org.eclipse.xtext.util.Files.readFileIntoString;
import static org.eclipse.xtext.util.Files.writeStringIntoFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.CompositeGeneratorFragment;
import org.eclipse.xtext.generator.DefaultGeneratorFragment;
import org.eclipse.xtext.generator.Generator;
import org.eclipse.xtext.generator.parser.antlr.AntlrOptions;
import org.eclipse.xtext.generator.parser.antlr.AntlrToolFacade;
import org.eclipse.xtext.generator.parser.antlr.ex.ExternalAntlrLexerFragment;
import org.eclipse.xtext.generator.parser.antlr.postProcessing.SuppressWarningsProcessor;
import org.eclipse.xtext.parser.antlr.Lexer;

import com.google.common.collect.Lists;


/**
 * Generates 3 separate custom lexers (runtime, content assist, highlighting).<br/>
 * 
 * <br/> This is configured primarily through convention. A file with the name [[languagename]]Lexer.g is required in the same 
 * package as the package with the non-ui runtime module (under the src folder, not the src-gen folder) then it will generate a custom 
 * lexer for the runtime, content assist, highlighting subsystems.
 * <br/><br/>
 * The lexer file must initially be copied from <i>&quot;src-gen/[mydslpackage]/antlr/lexer/Internal[DslName]Lexer.g&quot;</i> to
 * <i>&quot;src/[mydslpackage]/[DslName]Lexer.g&quot;</i>, and upon any further structural changes (changes to the terminals or data type
 * rules in the .xtext file), the custom lexer must be updated (this is a manual task).
 * 
 * <br/><br/>
 * This fragment will register all the generated lexers, and will automatically take care of merging in the correct module names
 * and package names for the various generated assets, so there is no need to set the grammar name or package names manually in the .g file.
 * 
 * <br/><br/>
 * <b>Requirements:</b>
 * 
 * <ol>
 * <li><b>languageName : </b>The name of the current grammar langauge (mandatory). Typically starts with a capital letter. e.g. &quot;Entity&quot;</li>
 * <li><b>grammarPackage : </b>The location of the main grammar package. This tends to be the package where the main mwe2 file and .xtext files reside. This field should be in the format &quot;com.mycompany.mydsl&quot; (mandatory)</li>
 * <li><b>antlrOptions : </b>{@link AntlrOptions} (optional)</li>
 * 
 * <li><b>lexerFileEncoding : </b>The name of the current grammar langauge (optional)</li>
 * </ol>
 * @author Chris Ainsley
 *
 */
public class CustomLexerFragment extends CompositeGeneratorFragment {
	
	private static final Logger log = Logger.getLogger(CustomLexerFragment.class);

	private static final String DEFAULT_LEXER_COPY_ENCODING = "UTF8";
	private static final String LEXER_SUFFIX = ".g";
	private static final String RUNTIME_LEXER_SUPERCLASS = org.eclipse.xtext.parser.antlr.Lexer.class.getName();
	// We can't access this via the .class variable without creating a dependency on the xtext UI package
	private static final String CONTEXT_ASSIST_LEXER_SUPERCLASS = "org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer";
	
	private AntlrOptions antlrOptions;
	private String grammarPackage;
	private String languageName;
	private String lexerFileEncoding = DEFAULT_LEXER_COPY_ENCODING;
	private boolean injectedChildren = false;
	private boolean generateCustomLexers = true;


	@Override
	public void checkConfiguration(Issues issues) {
		super.checkConfiguration(issues);
		
		if (grammarPackage == null || grammarPackage.trim().length() == 0) {
			issues.addError("Invalid grammarPackage : " + grammarPackage + " --> should be the package containing the RuntimeModule class.");
		}
		
		if (languageName == null || languageName.trim().length() == 0) {
			issues.addError("Invalid languageName : " + languageName + ", The language name of the current lexer (this generally relates to the name of the main xtext file stripped of its suffix)");
		}
		
		if (antlrOptions == null) {
			issues.addError("Must provide a non-null 'options' parameter.");
		}
	}

	private void injectChildren(Grammar grammar, XpandExecutionContext ctx) {
		if (!injectedChildren) {
			addFragments(ctx);
			injectedChildren = true;
		}
	}

	private void addFragments(XpandExecutionContext ctx) {
		/**
		 *  Generate a split runtime parser/lexer ( src-gen/.../antlr/Internal?????Parser.g &amp rc-gen/.../antlr/lexer/Internal?????Lexer.g ) + associated java files
		 */
		org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment fragment = new org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment();
		fragment.setOptions(antlrOptions);
		addFragment(fragment);
		addFragment(new org.eclipse.xtext.generator.parser.antlr.ex.ca.ContentAssistParserGeneratorFragment());

		
		if (generateCustomLexers) {
		
			File customLexerSourceFile = new File(ctx.getOutput().getOutlet(Generator.SRC).getPath() + "/" + grammarPackage.replace(".", "/") + "/" + languageName + "Lexer" + LEXER_SUFFIX);
			
			// Create the runtime lexer
			{
				String runtimeGrammarId = languageName + "Lexer";
				String srcGenPrefix = ctx.getOutput().getOutlet(Generator.SRC_GEN).getPath() + "/";
				String lexerPackage = grammarPackage + ".lexer";
				String destinationFolder = srcGenPrefix + lexerPackage.replace(".", "/");
				CopyCustomLexerWithMutationFragment copyRuntimeLex = new CopyCustomLexerWithMutationFragment();
				
				copyRuntimeLex.setInputFile(customLexerSourceFile);
				File postFilteredGrammarFile = new File(destinationFolder + "/" + runtimeGrammarId + LEXER_SUFFIX);
				copyRuntimeLex.setOutputFile(postFilteredGrammarFile);
				copyRuntimeLex.setGrammarId(runtimeGrammarId);
				copyRuntimeLex.setLexerPackage(lexerPackage);
				copyRuntimeLex.setLexerFileEncoding(lexerFileEncoding);
				copyRuntimeLex.setLexerImportPath(RUNTIME_LEXER_SUPERCLASS);
				
				addFragment(copyRuntimeLex);
				
				ExternalAntlrLexerFragment2 runtimeCustomLexGen = new ExternalAntlrLexerFragment2();
				runtimeCustomLexGen.setRuntime(true);
				runtimeCustomLexGen.setDestinationPackage(lexerPackage);
				runtimeCustomLexGen.setClassName(runtimeGrammarId);
				runtimeCustomLexGen.setSrcGrammarPath(postFilteredGrammarFile.getAbsolutePath());
				runtimeCustomLexGen.setGenToFolder(destinationFolder );
				runtimeCustomLexGen.addAntlrParam("-lib");
				runtimeCustomLexGen.addAntlrParam(destinationFolder);
				addFragment(runtimeCustomLexGen);
			}
			
			// Create the highlighting Lexer
			{
				String runtimeGrammarId = languageName + "HighlightingLexer";
				String srcGenPrefix = ctx.getOutput().getOutlet(Generator.SRC_GEN_UI).getPath() + "/";
				
				String lexerPackage = grammarPackage + ".ui.highlighting";
				String destinationFolder = srcGenPrefix + lexerPackage.replace(".", "/");
				
				CopyCustomLexerWithMutationFragment copyHighlightingLex = new CopyCustomLexerWithMutationFragment();
				copyHighlightingLex.setInputFile(customLexerSourceFile);
				
				File postFilteredGrammarFile = new File(destinationFolder + "/" + runtimeGrammarId + LEXER_SUFFIX);
				copyHighlightingLex.setOutputFile(postFilteredGrammarFile);
				copyHighlightingLex.setGrammarId(runtimeGrammarId);
				copyHighlightingLex.setLexerPackage(lexerPackage);
				copyHighlightingLex.setLexerFileEncoding(lexerFileEncoding);
				copyHighlightingLex.setLexerImportPath(RUNTIME_LEXER_SUPERCLASS);
				
				addFragment(copyHighlightingLex);
				
				ExternalAntlrLexerFragment2 runtimeHighlightingLexGen = new ExternalAntlrLexerFragment2();
				runtimeHighlightingLexGen.setHighlighting(true);
				runtimeHighlightingLexGen.setDestinationPackage(lexerPackage);
				runtimeHighlightingLexGen.setClassName(runtimeGrammarId);
				runtimeHighlightingLexGen.setSrcGrammarPath(postFilteredGrammarFile.getAbsolutePath());
				runtimeHighlightingLexGen.setGenToFolder(destinationFolder );
				addFragment(runtimeHighlightingLexGen);
			}
			
			// Create the content assist Lexer
			{
				String runtimeGrammarId = languageName + "ContentAssistLexer";
				String srcGenPrefix = ctx.getOutput().getOutlet(Generator.SRC_GEN_UI).getPath() + "/";
				
				String lexerPackage = grammarPackage + ".ui.contentassist";
				String destinationFolder = srcGenPrefix + lexerPackage.replace(".", "/");
				
				CopyCustomLexerWithMutationFragment copyContentAssistLex = new CopyCustomLexerWithMutationFragment();
				copyContentAssistLex.setInputFile(customLexerSourceFile);
				
				File postFilteredGrammarFile = new File(destinationFolder + "/" + runtimeGrammarId + LEXER_SUFFIX);
				copyContentAssistLex.setOutputFile(postFilteredGrammarFile);
				copyContentAssistLex.setGrammarId(runtimeGrammarId);
				copyContentAssistLex.setLexerPackage(lexerPackage);
				copyContentAssistLex.setLexerFileEncoding(lexerFileEncoding);
				
				copyContentAssistLex.setLexerImportPath(CONTEXT_ASSIST_LEXER_SUPERCLASS);
				
				addFragment(copyContentAssistLex);
				
				ExternalAntlrLexerFragment2 runtimeContentAssistLexGen = new ExternalAntlrLexerFragment2();
				runtimeContentAssistLexGen.setContentAssist(true);
				runtimeContentAssistLexGen.setDestinationPackage(lexerPackage);
				runtimeContentAssistLexGen.setClassName(runtimeGrammarId);
				runtimeContentAssistLexGen.setSrcGrammarPath(postFilteredGrammarFile.getAbsolutePath());
				runtimeContentAssistLexGen.setGenToFolder(destinationFolder );
				runtimeContentAssistLexGen.addAntlrParam("-lib");
				runtimeContentAssistLexGen.addAntlrParam(destinationFolder + "/antlr/lexer");
				addFragment(runtimeContentAssistLexGen);

			}
		}
	}
	
	@Override
	public void generate(Grammar grammar, XpandExecutionContext ctx) {

		injectChildren(grammar, ctx);
		
		IssuesImpl i = new IssuesImpl();
		checkConfiguration(i);
		if (i.hasErrors()) {
			log.error(i.toString());
			return;
		}
		
		super.generate(grammar, ctx);
	}

	
	/**
	 * This fragment is used to copy the primary custom lexer to other locations but
	 * will also change a few header fields that are required for minor differences between the runtime, content assist
	 * and highlighting lexer.<br/><br/>
	 * The alternative is to maintain 3 custom lexers per dsl which is suboptimal.
	 * @author Chris Ainsley
	 *
	 */
	public class CopyCustomLexerWithMutationFragment extends DefaultGeneratorFragment {
		
		private static final int LINESTATE__ANTICIPATING_LINE____LEXAR_GRAMAR = 0;
		private static final int LINESTATE__ANTICIPATING_LINE____PACKAGE_DECLARATION = 1;
		private static final int LINESTATE__ANTICIPATING_LINE____IMPORT_LEXER = 2;
		private static final int LINESTATE__FINISHED_SUBSTITUTIONS = 3;

		private String lexerFileEncoding = "UTF8";
		
		File inputFile;
		File outputFile;
		String grammarId;
		String lexerPackage;
		String lexerImportPath;

		@Override
		public void generate(Grammar grammar, XpandExecutionContext ctx) {
			
			BufferedReader lineReader =  null;
			BufferedWriter lineWriter = null;
			
			if (inputFile == null || outputFile == null) {
				log.error("Either input file or output file was not supplied.");
				return;
			}
			
			if (!inputFile.isFile()) {
				log.error("Could not find file : " + inputFile.getAbsolutePath());
				return;
			}
			
			if (outputFile.exists()) {
				if (outputFile.isDirectory()) {
					log.error("Output file cannot be a directory : " + outputFile.getAbsolutePath());
					return;
				} else {
					if (!outputFile.getAbsolutePath().contains("src-gen")) {
						log.error("Can only output to files somewhere underneath a 'src=gen' folder, invalid output folder : " + outputFile.getAbsolutePath());
						return;
					}
				}
			} else {
				if (outputFile.getParentFile().exists()) {
					if (!outputFile.getParentFile().isDirectory()) {
						log.error("Invalid output file : " + outputFile.getAbsolutePath());
						return;
					}
				} else {
					boolean createdFolder = outputFile.getParentFile().mkdirs();
					if (!createdFolder) {
						log.error("Could not create folder : " + outputFile.getParentFile().getAbsolutePath());
						return;
					}
				}
			}
			
			try {
				Charset charset = Charset.forName(lexerFileEncoding);
				
				InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(inputFile),charset);
				OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(outputFile), charset);
				
				lineReader = new BufferedReader( inputStreamReader);
				lineWriter = new BufferedWriter(outputStreamWriter);

				String line = null;

				lineWriter.write("// This file is generated and should not be modified.");
				lineWriter.write("\n");
				lineWriter.write("// Source of file : " + inputFile.getCanonicalPath());
				lineWriter.write("\n");
				lineWriter.write("\n");
				
				int mode = LINESTATE__ANTICIPATING_LINE____LEXAR_GRAMAR;
				
				while ( (line = lineReader.readLine()) != null  ) {

					if (mode == LINESTATE__ANTICIPATING_LINE____LEXAR_GRAMAR) {
						if (isLexarGrammarLine(line)) {
							lineWriter.write("lexer grammar " + grammarId + ";");
							lineWriter.write("\n");
							mode = LINESTATE__ANTICIPATING_LINE____PACKAGE_DECLARATION;
							continue;
						}
					} else if (mode == LINESTATE__ANTICIPATING_LINE____PACKAGE_DECLARATION) {
						if (isPackageDeclaration(line)) {
							lineWriter.write("package " + lexerPackage + ";");
							lineWriter.write("\n");
							mode = LINESTATE__ANTICIPATING_LINE____IMPORT_LEXER;
							continue;
						}
					} else if (mode == LINESTATE__ANTICIPATING_LINE____IMPORT_LEXER) {
						if (isImportLexerLine(line)) {
							lineWriter.write("import " + lexerImportPath + ";");
							lineWriter.write("\n");
							mode = LINESTATE__FINISHED_SUBSTITUTIONS;
							continue;
						}
					} 
					
					lineWriter.write(line);
					lineWriter.write("\n"); // It seems that ANTLR only uses \n for its lexer .g files
				}

				// If we haven't performed all the substitutions at the end, then something is not right (possibly the generated lexer changed format).
				// Let's catch it here. It won't stop execution but it will flag the error.
				if (mode != LINESTATE__FINISHED_SUBSTITUTIONS) {
					throw new RuntimeException("Input lexer \"" + inputFile.getAbsolutePath() + "\" was not in the expected format as we could not perform all the expected substitutions. Please check generated lexer : " + outputFile.getAbsolutePath());
				}
			
			} catch (Exception e) {
				log.error(e, e);
			} finally {
				if (lineReader != null) {
					try {lineReader.close();} catch (Exception e) {}
				}

				if (lineWriter != null) {
					try {lineWriter.flush();} catch (Exception e) {}
					try {lineWriter.close();} catch (Exception e) {}
				}				
			}
		}

		Pattern PATTERN__LEXER_GRAMMAR_LINE = Pattern.compile("(\\s)*lexer grammar (.*?);");
		Pattern PATTERN__PACKAGE_DECLARATION_LINE = Pattern.compile("(\\s)*package (.*?);");
		Pattern PATTERN__IMPORT_LEXER_LINE = Pattern.compile("(\\s)*import (.*?)Lexer;");
		
		
		private boolean isImportLexerLine(String line) {
			return PATTERN__IMPORT_LEXER_LINE.matcher(line).matches();
		}

		private boolean isPackageDeclaration(String line) {
			return PATTERN__PACKAGE_DECLARATION_LINE.matcher(line).matches();
		}

		private boolean isLexarGrammarLine(String line) {
			return PATTERN__LEXER_GRAMMAR_LINE.matcher(line).matches();
		}

		public void setGrammarId(String grammarId) {
			this.grammarId = grammarId;
		}

		public void setLexerPackage(String lexerPackage) {
			this.lexerPackage = lexerPackage;
		}

		public void setLexerImportPath(String lexerImportPath) {
			this.lexerImportPath = lexerImportPath;
		}


		public void setInputFile(File inputFile) {
			this.inputFile = inputFile;
		}


		public void setOutputFile(File outputFile) {
			this.outputFile = outputFile;
		}


		public void setLexerFileEncoding(String lexerFileEncoding) {
			this.lexerFileEncoding = lexerFileEncoding;
		}
	}
	
	/**
	 * Modified version of {@link ExternalAntlrLexerFragment}
	 * 
	 * @author Sebastian Zarnekow - Initial contribution and API
	 * @author Chris Ainsley -- Due to the paths being calculated inside the generator itself, I couldn't subclass {@link ExternalAntlrLexerFragment} so I copied and modified it here... will raise an issue to add additional configuration items to this class so we don;t require this workaround.
	 */
	public class ExternalAntlrLexerFragment2 extends DefaultGeneratorFragment {


		private boolean highlighting;
		private boolean runtime;
		private boolean contentAssist;

		private String srcGrammarPath;
		private String destinationPackage;
		private String genToFolder;
		private String className;
		
		private List<String> antlrParams = Lists.newArrayList();

		public void addAntlrParam(String param) {
			antlrParams.add(param);
		}

		public String[] getAntlrParams() {
			String[] result = antlrParams.toArray(new String[antlrParams.size()]);
			return result;
		}

		private AntlrToolFacade antlrTool = new AntlrToolFacade();

		public void setAntlrTool(AntlrToolFacade facade) {
			this.antlrTool = facade;
		}

		public AntlrToolFacade getAntlrTool() {
			return antlrTool;
		}
		
		
		/**
		 * The full filepath of a .g file that corresponds to a runtime lexer for the current grammar (typically copied from the &quot;.../src-gen/.../.../antlr/internal&quot; folder) 
		 * @param srcGrammarPath The full filepath of a .g file that corresponds to a runtime lexer for the current grammar (typically copied from the &quot;.../src-gen/.../.../antlr/internal&quot; folder)
		 */
		public void setSrcGrammarPath(String srcGrammarPath) {
			this.srcGrammarPath = srcGrammarPath;
		}

		/**
		 * A package in the format &quot;com.java.mypackage&quot;
		 * @param destinationPackage A package in the format &quot;com.java.mypackage&quot;
		 */
		public void setDestinationPackage(String destinationPackage) {
			this.destinationPackage = destinationPackage;
		}

		/**
		 * The full path of the folder where the lexer files will be generated, this is generally somewhere underneath a src-gen folder 
		 * @param genToFolder The full path of the folder where the lexer files will be generated, this is generally somewhere underneath a src-gen folder
		 */
		public void setGenToFolder(String genToFolder) {
			this.genToFolder = genToFolder;
		}

		/**
		 * The class name of the Lexer to be created in the package supplied (separately). This typically matches the name of the file
		 * supplied in the {@link #setSrcGrammarPath(String)} field (minus the filesystem information and the .g suffix)
		 * @param className The class name of the Lexer to be created in the package supplied (separately). This typically matches the name of the file supplied in the {@link #setSrcGrammarPath(String)} field (minus the filesystem information and the .g suffix)
		 */
		public void setClassName(String className) {
			this.className = className;
		}


		@Override
		public void generate(Grammar grammar, XpandExecutionContext ctx) {
			super.generate(grammar, ctx);
			String generateTo = genToFolder;
			addAntlrParam("-fo");
			addAntlrParam(generateTo);
			String[] params = getAntlrParams();
			getAntlrTool().runWithParams(srcGrammarPath /* Should be the fullpath of the .g file */, params);
			String javaFile = genToFolder+"/"+className+".java";
			suppressWarningsImpl(javaFile);
		}

		protected void suppressWarningsImpl(String javaFile) {
			String content = readFileIntoString(javaFile);
			content = new SuppressWarningsProcessor().process(content);
			writeStringIntoFile(javaFile, content);
		}

		@Override
		public void checkConfiguration(Issues issues) {
			if (contentAssist && highlighting || runtime && highlighting || contentAssist && runtime) {
				issues.addError("Only one of those flags is allowed: contentAssist, runtime, highlighting flag");
			}
		}

		@Override
		public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
			if (runtime)
				return new BindFactory()
					.addConfiguredBinding("RuntimeLexer",
							"binder.bind(" + Lexer.class.getName() + ".class)"+
							".annotatedWith(com.google.inject.name.Names.named(" +
							"org.eclipse.xtext.parser.antlr.LexerBindings.RUNTIME" +
							")).to(" + destinationPackage + "." + className +".class)")
					.getBindings();
			return Collections.emptySet();
		}

		@Override
		public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
			if (highlighting) {
				return new BindFactory()
					.addConfiguredBinding("HighlightingLexer",
							"binder.bind(" + Lexer.class.getName() + ".class)"+
							".annotatedWith(com.google.inject.name.Names.named(" +
							"org.eclipse.xtext.ui.LexerUIBindings.HIGHLIGHTING" +
							")).to(" + destinationPackage + "." + className +".class)")
					.getBindings();
			}
			
			if (contentAssist) {
				return new BindFactory()
					.addConfiguredBinding("ContentAssistLexer",
							"binder.bind(org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer.class)"+
							".annotatedWith(com.google.inject.name.Names.named(" +
							"org.eclipse.xtext.ui.LexerUIBindings.CONTENT_ASSIST" +
							")).to(" + destinationPackage + "." + className +".class)")
					.getBindings();
			}
			return Collections.emptySet();
		}

		
		/**
		 * If this mutually exclusive field (runtime, contentAssist and Highlighting) is selected, then
		 * the generated lexer is automatically bound via Guice in the base class for the appropriate module (runtime or ui). This does
		 * not affect the generation of the lexer itself (that is handled via {@link CopyCustomLexerWithMutationFragment})
		 * @param highlighting If this mutually  exclusive field (runtime, contentAssist and Highlighting) is selected, then the generated lexer is automatically bound via Guice in the base class for the appropriate module (runtime or ui). This does not affect the generation of the lexer itself (that is handled via {@link CopyCustomLexerWithMutationFragment})

		 */
		public void setHighlighting(boolean highlighting) {
			this.highlighting = highlighting;
		}

		public boolean isHighlighting() {
			return highlighting;
		}

		/**
		 * If this mutually exclusive field (runtime, contentAssist and Highlighting) is selected, then
		 * the generated lexer is automatically bound via Guice in the base class for the appropriate module (runtime or ui). This does
		 * not affect the generation of the lexer itself (that is handled via {@link CopyCustomLexerWithMutationFragment})
		 * @param runtime If this mutually  exclusive field (runtime, contentAssist and Highlighting) is selected, then the generated lexer is automatically bound via Guice in the base class for the appropriate module (runtime or ui). This does not affect the generation of the lexer itself (that is handled via {@link CopyCustomLexerWithMutationFragment})

		 */
		public void setRuntime(boolean runtime) {
			this.runtime = runtime;
		}

		public boolean isRuntime() {
			return runtime;
		}

		/**
		 * If this mutually exclusive field (runtime, contentAssist and Highlighting) is selected, then
		 * the generated lexer is automatically bound via Guice in the base class for the appropriate module (runtime or ui). This does
		 * not affect the generation of the lexer itself (that is handled via {@link CopyCustomLexerWithMutationFragment})
		 * @param contentAssist If this mutually  exclusive field (runtime, contentAssist and Highlighting) is selected, then the generated lexer is automatically bound via Guice in the base class for the appropriate module (runtime or ui). This does not affect the generation of the lexer itself (that is handled via {@link CopyCustomLexerWithMutationFragment})

		 */
		public void setContentAssist(boolean contentAssist) {
			this.contentAssist = contentAssist;
		}

		public boolean isContentAssist() {
			return contentAssist;
		}

	}

	/**
	 * The language name of the current lexer (this generally relates to the name of the main xtext file stripped of its suffix)
	 * @param languageName The language name of the current lexer (this generally relates to the name of the main xtext file stripped of its suffix)
	 */

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}


	/**
	 * The file encoding to be used when copying the template lexer file (default UTF8)
	 * @param lexerFileEncoding The file encoding to be used when copying the template lexer file (default UTF8)
	 */
	public void setLexerFileEncoding(String lexerFileEncoding) {
		this.lexerFileEncoding = lexerFileEncoding;
	}


	/**
	 * The location of the main grammar package. This tends to be the package where the main mwe2 file and .xtext files reside. This field should be in the format &quot;com.mycompany.mydsl&quot;
	 * @param grammarPackage The location of the main grammar package. This tends to be the package where the main mwe2 file and .xtext files reside. This field should be in the format &quot;com.mycompany.mydsl&quot;
	 */
	public void setGrammarPackage(String grammarPackage) {
		this.grammarPackage = grammarPackage;
	}
	
	/**
	 * Optional Antlr options to be used when generating the lexers. 
	 * @param antlrOptions Optional Antlr options to be used when generating the lexers.
	 */
	public void setOptions(AntlrOptions antlrOptions) {
		this.antlrOptions = antlrOptions;
	}
	
	/**
	 * If not set, this defaults to true.<br/><br/> If set to false, this will flag that the user does not wish to generate the custom lexers, which is useful as this generator can be used to generate the separate initial internal lexer (to be copied and pasted into src/[dslpackage]).
	 * @param generateCustomLexers If not set, this defaults to true.<br/><br/> If set to false, this will flag that the user does not wish to generate the custom lexers, which is useful as this generator can be used to generate the separate initial internal lexer (to be copied and pasted into src/[dslpackage]).
	 */
	public void setGenerateCustomLexers(boolean generateCustomLexers) {
		this.generateCustomLexers = generateCustomLexers;
	}
	
}

