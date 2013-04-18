package org.consoli.customlexerexample.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.consoli.customlexerexample.services.AttributesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAttributesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "RULE_PROPERTY_VALUE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=9;
    public static final int RULE_STRING=11;
    public static final int RULE_ANY_OTHER=15;
    public static final int KEYWORD_1=4;
    public static final int RULE_INT=10;
    public static final int KEYWORD_4=7;
    public static final int KEYWORD_3=6;
    public static final int KEYWORD_2=5;
    public static final int RULE_PROPERTY_VALUE=8;
    public static final int RULE_WS=14;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;

    // delegates
    // delegators


        public InternalAttributesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAttributesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAttributesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g"; }


     
     	private AttributesGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("KEYWORD_1", "','");
    		tokenNameToValue.put("KEYWORD_2", "'='");
    		tokenNameToValue.put("KEYWORD_3", "'['");
    		tokenNameToValue.put("KEYWORD_4", "']'");
     	}
     	
        public void setGrammarAccess(AttributesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleModel"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:67:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:68:1: ( ruleModel EOF )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:69:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel54);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel61); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:76:1: ruleModel : ( ( rule__Model__AttributesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:80:5: ( ( ( rule__Model__AttributesAssignment )* ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:81:1: ( ( rule__Model__AttributesAssignment )* )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:81:1: ( ( rule__Model__AttributesAssignment )* )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:82:1: ( rule__Model__AttributesAssignment )*
            {
             before(grammarAccess.getModelAccess().getAttributesAssignment()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:83:1: ( rule__Model__AttributesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:83:2: rule__Model__AttributesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__AttributesAssignment_in_ruleModel91);
            	    rule__Model__AttributesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAttributesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAttribute"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:95:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:96:1: ( ruleAttribute EOF )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:97:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute119);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute126); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:104:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:108:5: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:109:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:109:1: ( ( rule__Attribute__Alternatives ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:110:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:111:1: ( rule__Attribute__Alternatives )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:111:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute156);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleSimpleAttribute"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:123:1: entryRuleSimpleAttribute : ruleSimpleAttribute EOF ;
    public final void entryRuleSimpleAttribute() throws RecognitionException {
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:124:1: ( ruleSimpleAttribute EOF )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:125:1: ruleSimpleAttribute EOF
            {
             before(grammarAccess.getSimpleAttributeRule()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute183);
            ruleSimpleAttribute();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAttribute190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleAttribute"


    // $ANTLR start "ruleSimpleAttribute"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:132:1: ruleSimpleAttribute : ( ( rule__SimpleAttribute__Group__0 ) ) ;
    public final void ruleSimpleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:136:5: ( ( ( rule__SimpleAttribute__Group__0 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:137:1: ( ( rule__SimpleAttribute__Group__0 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:137:1: ( ( rule__SimpleAttribute__Group__0 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:138:1: ( rule__SimpleAttribute__Group__0 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getGroup()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:139:1: ( rule__SimpleAttribute__Group__0 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:139:2: rule__SimpleAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__0_in_ruleSimpleAttribute220);
            rule__SimpleAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleAttribute"


    // $ANTLR start "entryRuleArrayAttribute"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:151:1: entryRuleArrayAttribute : ruleArrayAttribute EOF ;
    public final void entryRuleArrayAttribute() throws RecognitionException {
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:152:1: ( ruleArrayAttribute EOF )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:153:1: ruleArrayAttribute EOF
            {
             before(grammarAccess.getArrayAttributeRule()); 
            pushFollow(FOLLOW_ruleArrayAttribute_in_entryRuleArrayAttribute247);
            ruleArrayAttribute();

            state._fsp--;

             after(grammarAccess.getArrayAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayAttribute254); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayAttribute"


    // $ANTLR start "ruleArrayAttribute"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:160:1: ruleArrayAttribute : ( ( rule__ArrayAttribute__Group__0 ) ) ;
    public final void ruleArrayAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:164:5: ( ( ( rule__ArrayAttribute__Group__0 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:165:1: ( ( rule__ArrayAttribute__Group__0 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:165:1: ( ( rule__ArrayAttribute__Group__0 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:166:1: ( rule__ArrayAttribute__Group__0 )
            {
             before(grammarAccess.getArrayAttributeAccess().getGroup()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:167:1: ( rule__ArrayAttribute__Group__0 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:167:2: rule__ArrayAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__0_in_ruleArrayAttribute284);
            rule__ArrayAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayAttribute"


    // $ANTLR start "rule__Attribute__Alternatives"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:179:1: rule__Attribute__Alternatives : ( ( ruleSimpleAttribute ) | ( ruleArrayAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:183:1: ( ( ruleSimpleAttribute ) | ( ruleArrayAttribute ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==KEYWORD_3) ) {
                    alt2=2;
                }
                else if ( (LA2_1==KEYWORD_2) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:184:1: ( ruleSimpleAttribute )
                    {
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:184:1: ( ruleSimpleAttribute )
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:185:1: ruleSimpleAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives320);
                    ruleSimpleAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:190:6: ( ruleArrayAttribute )
                    {
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:190:6: ( ruleArrayAttribute )
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:191:1: ruleArrayAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getArrayAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArrayAttribute_in_rule__Attribute__Alternatives337);
                    ruleArrayAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getArrayAttributeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__SimpleAttribute__Group__0"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:203:1: rule__SimpleAttribute__Group__0 : rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1 ;
    public final void rule__SimpleAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:207:1: ( rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:208:2: rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__0__Impl_in_rule__SimpleAttribute__Group__0367);
            rule__SimpleAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAttribute__Group__1_in_rule__SimpleAttribute__Group__0370);
            rule__SimpleAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__0"


    // $ANTLR start "rule__SimpleAttribute__Group__0__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:215:1: rule__SimpleAttribute__Group__0__Impl : ( ( rule__SimpleAttribute__NameAssignment_0 ) ) ;
    public final void rule__SimpleAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:219:1: ( ( ( rule__SimpleAttribute__NameAssignment_0 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:220:1: ( ( rule__SimpleAttribute__NameAssignment_0 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:220:1: ( ( rule__SimpleAttribute__NameAssignment_0 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:221:1: ( rule__SimpleAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getNameAssignment_0()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:222:1: ( rule__SimpleAttribute__NameAssignment_0 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:222:2: rule__SimpleAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__NameAssignment_0_in_rule__SimpleAttribute__Group__0__Impl397);
            rule__SimpleAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__0__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__1"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:232:1: rule__SimpleAttribute__Group__1 : rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2 ;
    public final void rule__SimpleAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:236:1: ( rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:237:2: rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__1__Impl_in_rule__SimpleAttribute__Group__1427);
            rule__SimpleAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAttribute__Group__2_in_rule__SimpleAttribute__Group__1430);
            rule__SimpleAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__1"


    // $ANTLR start "rule__SimpleAttribute__Group__1__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:244:1: rule__SimpleAttribute__Group__1__Impl : ( KEYWORD_2 ) ;
    public final void rule__SimpleAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:248:1: ( ( KEYWORD_2 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:249:1: ( KEYWORD_2 )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:249:1: ( KEYWORD_2 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:250:1: KEYWORD_2
            {
             before(grammarAccess.getSimpleAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SimpleAttribute__Group__1__Impl458); 
             after(grammarAccess.getSimpleAttributeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__1__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__2"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:263:1: rule__SimpleAttribute__Group__2 : rule__SimpleAttribute__Group__2__Impl ;
    public final void rule__SimpleAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:267:1: ( rule__SimpleAttribute__Group__2__Impl )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:268:2: rule__SimpleAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__2__Impl_in_rule__SimpleAttribute__Group__2489);
            rule__SimpleAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__2"


    // $ANTLR start "rule__SimpleAttribute__Group__2__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:274:1: rule__SimpleAttribute__Group__2__Impl : ( ( rule__SimpleAttribute__ValueAssignment_2 ) ) ;
    public final void rule__SimpleAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:278:1: ( ( ( rule__SimpleAttribute__ValueAssignment_2 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:279:1: ( ( rule__SimpleAttribute__ValueAssignment_2 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:279:1: ( ( rule__SimpleAttribute__ValueAssignment_2 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:280:1: ( rule__SimpleAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getValueAssignment_2()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:281:1: ( rule__SimpleAttribute__ValueAssignment_2 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:281:2: rule__SimpleAttribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__ValueAssignment_2_in_rule__SimpleAttribute__Group__2__Impl516);
            rule__SimpleAttribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__2__Impl"


    // $ANTLR start "rule__ArrayAttribute__Group__0"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:297:1: rule__ArrayAttribute__Group__0 : rule__ArrayAttribute__Group__0__Impl rule__ArrayAttribute__Group__1 ;
    public final void rule__ArrayAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:301:1: ( rule__ArrayAttribute__Group__0__Impl rule__ArrayAttribute__Group__1 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:302:2: rule__ArrayAttribute__Group__0__Impl rule__ArrayAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__0__Impl_in_rule__ArrayAttribute__Group__0552);
            rule__ArrayAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group__1_in_rule__ArrayAttribute__Group__0555);
            rule__ArrayAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__0"


    // $ANTLR start "rule__ArrayAttribute__Group__0__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:309:1: rule__ArrayAttribute__Group__0__Impl : ( ( rule__ArrayAttribute__NameAssignment_0 ) ) ;
    public final void rule__ArrayAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:313:1: ( ( ( rule__ArrayAttribute__NameAssignment_0 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:314:1: ( ( rule__ArrayAttribute__NameAssignment_0 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:314:1: ( ( rule__ArrayAttribute__NameAssignment_0 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:315:1: ( rule__ArrayAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getArrayAttributeAccess().getNameAssignment_0()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:316:1: ( rule__ArrayAttribute__NameAssignment_0 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:316:2: rule__ArrayAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__NameAssignment_0_in_rule__ArrayAttribute__Group__0__Impl582);
            rule__ArrayAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__0__Impl"


    // $ANTLR start "rule__ArrayAttribute__Group__1"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:326:1: rule__ArrayAttribute__Group__1 : rule__ArrayAttribute__Group__1__Impl rule__ArrayAttribute__Group__2 ;
    public final void rule__ArrayAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:330:1: ( rule__ArrayAttribute__Group__1__Impl rule__ArrayAttribute__Group__2 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:331:2: rule__ArrayAttribute__Group__1__Impl rule__ArrayAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__1__Impl_in_rule__ArrayAttribute__Group__1612);
            rule__ArrayAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group__2_in_rule__ArrayAttribute__Group__1615);
            rule__ArrayAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__1"


    // $ANTLR start "rule__ArrayAttribute__Group__1__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:338:1: rule__ArrayAttribute__Group__1__Impl : ( KEYWORD_3 ) ;
    public final void rule__ArrayAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:342:1: ( ( KEYWORD_3 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:343:1: ( KEYWORD_3 )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:343:1: ( KEYWORD_3 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:344:1: KEYWORD_3
            {
             before(grammarAccess.getArrayAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__ArrayAttribute__Group__1__Impl643); 
             after(grammarAccess.getArrayAttributeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__1__Impl"


    // $ANTLR start "rule__ArrayAttribute__Group__2"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:357:1: rule__ArrayAttribute__Group__2 : rule__ArrayAttribute__Group__2__Impl rule__ArrayAttribute__Group__3 ;
    public final void rule__ArrayAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:361:1: ( rule__ArrayAttribute__Group__2__Impl rule__ArrayAttribute__Group__3 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:362:2: rule__ArrayAttribute__Group__2__Impl rule__ArrayAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__2__Impl_in_rule__ArrayAttribute__Group__2674);
            rule__ArrayAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group__3_in_rule__ArrayAttribute__Group__2677);
            rule__ArrayAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__2"


    // $ANTLR start "rule__ArrayAttribute__Group__2__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:369:1: rule__ArrayAttribute__Group__2__Impl : ( KEYWORD_4 ) ;
    public final void rule__ArrayAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:373:1: ( ( KEYWORD_4 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:374:1: ( KEYWORD_4 )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:374:1: ( KEYWORD_4 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:375:1: KEYWORD_4
            {
             before(grammarAccess.getArrayAttributeAccess().getRightSquareBracketKeyword_2()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__ArrayAttribute__Group__2__Impl705); 
             after(grammarAccess.getArrayAttributeAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__2__Impl"


    // $ANTLR start "rule__ArrayAttribute__Group__3"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:388:1: rule__ArrayAttribute__Group__3 : rule__ArrayAttribute__Group__3__Impl rule__ArrayAttribute__Group__4 ;
    public final void rule__ArrayAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:392:1: ( rule__ArrayAttribute__Group__3__Impl rule__ArrayAttribute__Group__4 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:393:2: rule__ArrayAttribute__Group__3__Impl rule__ArrayAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__3__Impl_in_rule__ArrayAttribute__Group__3736);
            rule__ArrayAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group__4_in_rule__ArrayAttribute__Group__3739);
            rule__ArrayAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__3"


    // $ANTLR start "rule__ArrayAttribute__Group__3__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:400:1: rule__ArrayAttribute__Group__3__Impl : ( KEYWORD_2 ) ;
    public final void rule__ArrayAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:404:1: ( ( KEYWORD_2 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:405:1: ( KEYWORD_2 )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:405:1: ( KEYWORD_2 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:406:1: KEYWORD_2
            {
             before(grammarAccess.getArrayAttributeAccess().getEqualsSignKeyword_3()); 
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__ArrayAttribute__Group__3__Impl767); 
             after(grammarAccess.getArrayAttributeAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__3__Impl"


    // $ANTLR start "rule__ArrayAttribute__Group__4"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:419:1: rule__ArrayAttribute__Group__4 : rule__ArrayAttribute__Group__4__Impl rule__ArrayAttribute__Group__5 ;
    public final void rule__ArrayAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:423:1: ( rule__ArrayAttribute__Group__4__Impl rule__ArrayAttribute__Group__5 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:424:2: rule__ArrayAttribute__Group__4__Impl rule__ArrayAttribute__Group__5
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__4__Impl_in_rule__ArrayAttribute__Group__4798);
            rule__ArrayAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group__5_in_rule__ArrayAttribute__Group__4801);
            rule__ArrayAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__4"


    // $ANTLR start "rule__ArrayAttribute__Group__4__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:431:1: rule__ArrayAttribute__Group__4__Impl : ( ( rule__ArrayAttribute__ItemsAssignment_4 )? ) ;
    public final void rule__ArrayAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:435:1: ( ( ( rule__ArrayAttribute__ItemsAssignment_4 )? ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:436:1: ( ( rule__ArrayAttribute__ItemsAssignment_4 )? )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:436:1: ( ( rule__ArrayAttribute__ItemsAssignment_4 )? )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:437:1: ( rule__ArrayAttribute__ItemsAssignment_4 )?
            {
             before(grammarAccess.getArrayAttributeAccess().getItemsAssignment_4()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:438:1: ( rule__ArrayAttribute__ItemsAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:438:2: rule__ArrayAttribute__ItemsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ArrayAttribute__ItemsAssignment_4_in_rule__ArrayAttribute__Group__4__Impl828);
                    rule__ArrayAttribute__ItemsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAttributeAccess().getItemsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__4__Impl"


    // $ANTLR start "rule__ArrayAttribute__Group__5"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:448:1: rule__ArrayAttribute__Group__5 : rule__ArrayAttribute__Group__5__Impl ;
    public final void rule__ArrayAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:452:1: ( rule__ArrayAttribute__Group__5__Impl )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:453:2: rule__ArrayAttribute__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__5__Impl_in_rule__ArrayAttribute__Group__5859);
            rule__ArrayAttribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__5"


    // $ANTLR start "rule__ArrayAttribute__Group__5__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:459:1: rule__ArrayAttribute__Group__5__Impl : ( ( rule__ArrayAttribute__Group_5__0 )* ) ;
    public final void rule__ArrayAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:463:1: ( ( ( rule__ArrayAttribute__Group_5__0 )* ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:464:1: ( ( rule__ArrayAttribute__Group_5__0 )* )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:464:1: ( ( rule__ArrayAttribute__Group_5__0 )* )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:465:1: ( rule__ArrayAttribute__Group_5__0 )*
            {
             before(grammarAccess.getArrayAttributeAccess().getGroup_5()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:466:1: ( rule__ArrayAttribute__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==KEYWORD_1) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:466:2: rule__ArrayAttribute__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayAttribute__Group_5__0_in_rule__ArrayAttribute__Group__5__Impl886);
            	    rule__ArrayAttribute__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getArrayAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group__5__Impl"


    // $ANTLR start "rule__ArrayAttribute__Group_5__0"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:488:1: rule__ArrayAttribute__Group_5__0 : rule__ArrayAttribute__Group_5__0__Impl rule__ArrayAttribute__Group_5__1 ;
    public final void rule__ArrayAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:492:1: ( rule__ArrayAttribute__Group_5__0__Impl rule__ArrayAttribute__Group_5__1 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:493:2: rule__ArrayAttribute__Group_5__0__Impl rule__ArrayAttribute__Group_5__1
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group_5__0__Impl_in_rule__ArrayAttribute__Group_5__0929);
            rule__ArrayAttribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group_5__1_in_rule__ArrayAttribute__Group_5__0932);
            rule__ArrayAttribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group_5__0"


    // $ANTLR start "rule__ArrayAttribute__Group_5__0__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:500:1: rule__ArrayAttribute__Group_5__0__Impl : ( KEYWORD_1 ) ;
    public final void rule__ArrayAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:504:1: ( ( KEYWORD_1 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:505:1: ( KEYWORD_1 )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:505:1: ( KEYWORD_1 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:506:1: KEYWORD_1
            {
             before(grammarAccess.getArrayAttributeAccess().getCommaKeyword_5_0()); 
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__ArrayAttribute__Group_5__0__Impl960); 
             after(grammarAccess.getArrayAttributeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group_5__0__Impl"


    // $ANTLR start "rule__ArrayAttribute__Group_5__1"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:519:1: rule__ArrayAttribute__Group_5__1 : rule__ArrayAttribute__Group_5__1__Impl ;
    public final void rule__ArrayAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:523:1: ( rule__ArrayAttribute__Group_5__1__Impl )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:524:2: rule__ArrayAttribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group_5__1__Impl_in_rule__ArrayAttribute__Group_5__1991);
            rule__ArrayAttribute__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group_5__1"


    // $ANTLR start "rule__ArrayAttribute__Group_5__1__Impl"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:530:1: rule__ArrayAttribute__Group_5__1__Impl : ( ( rule__ArrayAttribute__ItemsAssignment_5_1 ) ) ;
    public final void rule__ArrayAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:534:1: ( ( ( rule__ArrayAttribute__ItemsAssignment_5_1 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:535:1: ( ( rule__ArrayAttribute__ItemsAssignment_5_1 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:535:1: ( ( rule__ArrayAttribute__ItemsAssignment_5_1 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:536:1: ( rule__ArrayAttribute__ItemsAssignment_5_1 )
            {
             before(grammarAccess.getArrayAttributeAccess().getItemsAssignment_5_1()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:537:1: ( rule__ArrayAttribute__ItemsAssignment_5_1 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:537:2: rule__ArrayAttribute__ItemsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__ItemsAssignment_5_1_in_rule__ArrayAttribute__Group_5__1__Impl1018);
            rule__ArrayAttribute__ItemsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAttributeAccess().getItemsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__Group_5__1__Impl"


    // $ANTLR start "rule__Model__AttributesAssignment"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:552:1: rule__Model__AttributesAssignment : ( ruleAttribute ) ;
    public final void rule__Model__AttributesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:556:1: ( ( ruleAttribute ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:557:1: ( ruleAttribute )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:557:1: ( ruleAttribute )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:558:1: ruleAttribute
            {
             before(grammarAccess.getModelAccess().getAttributesAttributeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Model__AttributesAssignment1057);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAttributesAttributeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AttributesAssignment"


    // $ANTLR start "rule__SimpleAttribute__NameAssignment_0"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:567:1: rule__SimpleAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:571:1: ( ( RULE_ID ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:572:1: ( RULE_ID )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:572:1: ( RULE_ID )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:573:1: RULE_ID
            {
             before(grammarAccess.getSimpleAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleAttribute__NameAssignment_01088); 
             after(grammarAccess.getSimpleAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__NameAssignment_0"


    // $ANTLR start "rule__SimpleAttribute__ValueAssignment_2"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:582:1: rule__SimpleAttribute__ValueAssignment_2 : ( RULE_PROPERTY_VALUE ) ;
    public final void rule__SimpleAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:586:1: ( ( RULE_PROPERTY_VALUE ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:587:1: ( RULE_PROPERTY_VALUE )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:587:1: ( RULE_PROPERTY_VALUE )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:588:1: RULE_PROPERTY_VALUE
            {
             before(grammarAccess.getSimpleAttributeAccess().getValuePROPERTY_VALUETerminalRuleCall_2_0()); 
            match(input,RULE_PROPERTY_VALUE,FOLLOW_RULE_PROPERTY_VALUE_in_rule__SimpleAttribute__ValueAssignment_21119); 
             after(grammarAccess.getSimpleAttributeAccess().getValuePROPERTY_VALUETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__ValueAssignment_2"


    // $ANTLR start "rule__ArrayAttribute__NameAssignment_0"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:597:1: rule__ArrayAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ArrayAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:601:1: ( ( RULE_ID ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:602:1: ( RULE_ID )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:602:1: ( RULE_ID )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:603:1: RULE_ID
            {
             before(grammarAccess.getArrayAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArrayAttribute__NameAssignment_01150); 
             after(grammarAccess.getArrayAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__NameAssignment_0"


    // $ANTLR start "rule__ArrayAttribute__ItemsAssignment_4"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:612:1: rule__ArrayAttribute__ItemsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ArrayAttribute__ItemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:616:1: ( ( RULE_STRING ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:617:1: ( RULE_STRING )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:617:1: ( RULE_STRING )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:618:1: RULE_STRING
            {
             before(grammarAccess.getArrayAttributeAccess().getItemsSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ArrayAttribute__ItemsAssignment_41181); 
             after(grammarAccess.getArrayAttributeAccess().getItemsSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__ItemsAssignment_4"


    // $ANTLR start "rule__ArrayAttribute__ItemsAssignment_5_1"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:627:1: rule__ArrayAttribute__ItemsAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ArrayAttribute__ItemsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:631:1: ( ( RULE_STRING ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:632:1: ( RULE_STRING )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:632:1: ( RULE_STRING )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributesParser.g:633:1: RULE_STRING
            {
             before(grammarAccess.getArrayAttributeAccess().getItemsSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ArrayAttribute__ItemsAssignment_5_11212); 
             after(grammarAccess.getArrayAttributeAccess().getItemsSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayAttribute__ItemsAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AttributesAssignment_in_ruleModel91 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__0_in_ruleSimpleAttribute220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayAttribute_in_entryRuleArrayAttribute247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayAttribute254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__0_in_ruleArrayAttribute284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayAttribute_in_rule__Attribute__Alternatives337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__0__Impl_in_rule__SimpleAttribute__Group__0367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__1_in_rule__SimpleAttribute__Group__0370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__NameAssignment_0_in_rule__SimpleAttribute__Group__0__Impl397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__1__Impl_in_rule__SimpleAttribute__Group__1427 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__2_in_rule__SimpleAttribute__Group__1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SimpleAttribute__Group__1__Impl458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__2__Impl_in_rule__SimpleAttribute__Group__2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__ValueAssignment_2_in_rule__SimpleAttribute__Group__2__Impl516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__0__Impl_in_rule__ArrayAttribute__Group__0552 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__1_in_rule__ArrayAttribute__Group__0555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__NameAssignment_0_in_rule__ArrayAttribute__Group__0__Impl582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__1__Impl_in_rule__ArrayAttribute__Group__1612 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__2_in_rule__ArrayAttribute__Group__1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__ArrayAttribute__Group__1__Impl643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__2__Impl_in_rule__ArrayAttribute__Group__2674 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__3_in_rule__ArrayAttribute__Group__2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__ArrayAttribute__Group__2__Impl705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__3__Impl_in_rule__ArrayAttribute__Group__3736 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__4_in_rule__ArrayAttribute__Group__3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__ArrayAttribute__Group__3__Impl767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__4__Impl_in_rule__ArrayAttribute__Group__4798 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__5_in_rule__ArrayAttribute__Group__4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__ItemsAssignment_4_in_rule__ArrayAttribute__Group__4__Impl828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__5__Impl_in_rule__ArrayAttribute__Group__5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group_5__0_in_rule__ArrayAttribute__Group__5__Impl886 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group_5__0__Impl_in_rule__ArrayAttribute__Group_5__0929 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group_5__1_in_rule__ArrayAttribute__Group_5__0932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__ArrayAttribute__Group_5__0__Impl960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group_5__1__Impl_in_rule__ArrayAttribute__Group_5__1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__ItemsAssignment_5_1_in_rule__ArrayAttribute__Group_5__1__Impl1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Model__AttributesAssignment1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleAttribute__NameAssignment_01088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROPERTY_VALUE_in_rule__SimpleAttribute__ValueAssignment_21119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArrayAttribute__NameAssignment_01150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ArrayAttribute__ItemsAssignment_41181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ArrayAttribute__ItemsAssignment_5_11212 = new BitSet(new long[]{0x0000000000000002L});

}