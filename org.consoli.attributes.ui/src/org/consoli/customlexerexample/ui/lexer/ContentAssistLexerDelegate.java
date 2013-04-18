package org.consoli.customlexerexample.ui.lexer;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;

import org.apache.log4j.Logger;
public class ContentAssistLexerDelegate extends org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer {
	
	private static final Logger logger = Logger.getLogger(ContentAssistLexerDelegate.class);
	org.consoli.customlexerexample.lexer.CustomAttributesLexer delegate = null;
	
	public ContentAssistLexerDelegate() {
		super();
		delegate = new org.consoli.customlexerexample.lexer.CustomAttributesLexer();
	}
	
    public ContentAssistLexerDelegate(CharStream input) {
    	this(input, new RecognizerSharedState());
    }
    public ContentAssistLexerDelegate(CharStream input, RecognizerSharedState state) {
    	super(input, state);
    	delegate = new org.consoli.customlexerexample.lexer.CustomAttributesLexer(input,state);

    }
	@Override
	public void mTokens() throws RecognitionException {
		delegate.mTokens();
	}
	
	
	@Override
	public void emitErrorMessage(String msg) {
		if(logger.isTraceEnabled())
			logger.trace(msg);
	}

	@Override
	public void reset() {
		delegate.reset();
	}

	@Override
	public Token nextToken() {
		Token nextToken = super.nextToken();
		System.out.println("DebugToken : " + nextToken.getType() + " : " + nextToken.getText());
		return nextToken;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.Lexer#setCharStream(org.antlr.runtime.CharStream)
	 */
	@Override
	public void setCharStream(CharStream input) {
		super.setCharStream(input);
		delegate.setCharStream(input);
	}
	
	@Override
	public String getGrammarFileName() {
		return "../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g";
	}
}
