package org.consoli.customlexerexample.ui.contentassist.antlr.internal; 

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PROPERTY_VALUE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'='", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_PROPERTY_VALUE=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalAttributesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAttributesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAttributesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g"; }


     
     	private AttributesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AttributesGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:61:1: ( ruleModel EOF )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:69:1: ruleModel : ( ( rule__Model__AttributesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:73:2: ( ( ( rule__Model__AttributesAssignment )* ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:74:1: ( ( rule__Model__AttributesAssignment )* )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:74:1: ( ( rule__Model__AttributesAssignment )* )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:75:1: ( rule__Model__AttributesAssignment )*
            {
             before(grammarAccess.getModelAccess().getAttributesAssignment()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:76:1: ( rule__Model__AttributesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:76:2: rule__Model__AttributesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__AttributesAssignment_in_ruleModel94);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:88:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:89:1: ( ruleAttribute EOF )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:90:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute122);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute129); 

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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:97:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:101:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:102:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:102:1: ( ( rule__Attribute__Alternatives ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:103:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:104:1: ( rule__Attribute__Alternatives )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:104:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute155);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:116:1: entryRuleSimpleAttribute : ruleSimpleAttribute EOF ;
    public final void entryRuleSimpleAttribute() throws RecognitionException {
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:117:1: ( ruleSimpleAttribute EOF )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:118:1: ruleSimpleAttribute EOF
            {
             before(grammarAccess.getSimpleAttributeRule()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute182);
            ruleSimpleAttribute();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAttribute189); 

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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:125:1: ruleSimpleAttribute : ( ( rule__SimpleAttribute__Group__0 ) ) ;
    public final void ruleSimpleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:129:2: ( ( ( rule__SimpleAttribute__Group__0 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:130:1: ( ( rule__SimpleAttribute__Group__0 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:130:1: ( ( rule__SimpleAttribute__Group__0 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:131:1: ( rule__SimpleAttribute__Group__0 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getGroup()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:132:1: ( rule__SimpleAttribute__Group__0 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:132:2: rule__SimpleAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__0_in_ruleSimpleAttribute215);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:144:1: entryRuleArrayAttribute : ruleArrayAttribute EOF ;
    public final void entryRuleArrayAttribute() throws RecognitionException {
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:145:1: ( ruleArrayAttribute EOF )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:146:1: ruleArrayAttribute EOF
            {
             before(grammarAccess.getArrayAttributeRule()); 
            pushFollow(FOLLOW_ruleArrayAttribute_in_entryRuleArrayAttribute242);
            ruleArrayAttribute();

            state._fsp--;

             after(grammarAccess.getArrayAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayAttribute249); 

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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:153:1: ruleArrayAttribute : ( ( rule__ArrayAttribute__Group__0 ) ) ;
    public final void ruleArrayAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:157:2: ( ( ( rule__ArrayAttribute__Group__0 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:158:1: ( ( rule__ArrayAttribute__Group__0 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:158:1: ( ( rule__ArrayAttribute__Group__0 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:159:1: ( rule__ArrayAttribute__Group__0 )
            {
             before(grammarAccess.getArrayAttributeAccess().getGroup()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:160:1: ( rule__ArrayAttribute__Group__0 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:160:2: rule__ArrayAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__0_in_ruleArrayAttribute275);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:172:1: rule__Attribute__Alternatives : ( ( ruleSimpleAttribute ) | ( ruleArrayAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:176:1: ( ( ruleSimpleAttribute ) | ( ruleArrayAttribute ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_PROPERTY_VALUE) ) {
                    alt2=1;
                }
                else if ( (LA2_1==12) ) {
                    alt2=2;
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
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:177:1: ( ruleSimpleAttribute )
                    {
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:177:1: ( ruleSimpleAttribute )
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:178:1: ruleSimpleAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives311);
                    ruleSimpleAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:183:6: ( ruleArrayAttribute )
                    {
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:183:6: ( ruleArrayAttribute )
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:184:1: ruleArrayAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getArrayAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArrayAttribute_in_rule__Attribute__Alternatives328);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:196:1: rule__SimpleAttribute__Group__0 : rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1 ;
    public final void rule__SimpleAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:200:1: ( rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:201:2: rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__0__Impl_in_rule__SimpleAttribute__Group__0358);
            rule__SimpleAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleAttribute__Group__1_in_rule__SimpleAttribute__Group__0361);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:208:1: rule__SimpleAttribute__Group__0__Impl : ( ( rule__SimpleAttribute__NameAssignment_0 ) ) ;
    public final void rule__SimpleAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:212:1: ( ( ( rule__SimpleAttribute__NameAssignment_0 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:213:1: ( ( rule__SimpleAttribute__NameAssignment_0 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:213:1: ( ( rule__SimpleAttribute__NameAssignment_0 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:214:1: ( rule__SimpleAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getNameAssignment_0()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:215:1: ( rule__SimpleAttribute__NameAssignment_0 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:215:2: rule__SimpleAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__NameAssignment_0_in_rule__SimpleAttribute__Group__0__Impl388);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:225:1: rule__SimpleAttribute__Group__1 : rule__SimpleAttribute__Group__1__Impl ;
    public final void rule__SimpleAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:229:1: ( rule__SimpleAttribute__Group__1__Impl )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:230:2: rule__SimpleAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__Group__1__Impl_in_rule__SimpleAttribute__Group__1418);
            rule__SimpleAttribute__Group__1__Impl();

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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:236:1: rule__SimpleAttribute__Group__1__Impl : ( ( rule__SimpleAttribute__ValueAssignment_1 ) ) ;
    public final void rule__SimpleAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:240:1: ( ( ( rule__SimpleAttribute__ValueAssignment_1 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:241:1: ( ( rule__SimpleAttribute__ValueAssignment_1 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:241:1: ( ( rule__SimpleAttribute__ValueAssignment_1 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:242:1: ( rule__SimpleAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getValueAssignment_1()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:243:1: ( rule__SimpleAttribute__ValueAssignment_1 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:243:2: rule__SimpleAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleAttribute__ValueAssignment_1_in_rule__SimpleAttribute__Group__1__Impl445);
            rule__SimpleAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getValueAssignment_1()); 

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


    // $ANTLR start "rule__ArrayAttribute__Group__0"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:257:1: rule__ArrayAttribute__Group__0 : rule__ArrayAttribute__Group__0__Impl rule__ArrayAttribute__Group__1 ;
    public final void rule__ArrayAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:261:1: ( rule__ArrayAttribute__Group__0__Impl rule__ArrayAttribute__Group__1 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:262:2: rule__ArrayAttribute__Group__0__Impl rule__ArrayAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__0__Impl_in_rule__ArrayAttribute__Group__0479);
            rule__ArrayAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group__1_in_rule__ArrayAttribute__Group__0482);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:269:1: rule__ArrayAttribute__Group__0__Impl : ( ( rule__ArrayAttribute__NameAssignment_0 ) ) ;
    public final void rule__ArrayAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:273:1: ( ( ( rule__ArrayAttribute__NameAssignment_0 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:274:1: ( ( rule__ArrayAttribute__NameAssignment_0 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:274:1: ( ( rule__ArrayAttribute__NameAssignment_0 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:275:1: ( rule__ArrayAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getArrayAttributeAccess().getNameAssignment_0()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:276:1: ( rule__ArrayAttribute__NameAssignment_0 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:276:2: rule__ArrayAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__NameAssignment_0_in_rule__ArrayAttribute__Group__0__Impl509);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:286:1: rule__ArrayAttribute__Group__1 : rule__ArrayAttribute__Group__1__Impl rule__ArrayAttribute__Group__2 ;
    public final void rule__ArrayAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:290:1: ( rule__ArrayAttribute__Group__1__Impl rule__ArrayAttribute__Group__2 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:291:2: rule__ArrayAttribute__Group__1__Impl rule__ArrayAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__1__Impl_in_rule__ArrayAttribute__Group__1539);
            rule__ArrayAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group__2_in_rule__ArrayAttribute__Group__1542);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:298:1: rule__ArrayAttribute__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:302:1: ( ( '[' ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:303:1: ( '[' )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:303:1: ( '[' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:304:1: '['
            {
             before(grammarAccess.getArrayAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__ArrayAttribute__Group__1__Impl570); 
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:317:1: rule__ArrayAttribute__Group__2 : rule__ArrayAttribute__Group__2__Impl rule__ArrayAttribute__Group__3 ;
    public final void rule__ArrayAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:321:1: ( rule__ArrayAttribute__Group__2__Impl rule__ArrayAttribute__Group__3 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:322:2: rule__ArrayAttribute__Group__2__Impl rule__ArrayAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__2__Impl_in_rule__ArrayAttribute__Group__2601);
            rule__ArrayAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group__3_in_rule__ArrayAttribute__Group__2604);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:329:1: rule__ArrayAttribute__Group__2__Impl : ( ']' ) ;
    public final void rule__ArrayAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:333:1: ( ( ']' ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:334:1: ( ']' )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:334:1: ( ']' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:335:1: ']'
            {
             before(grammarAccess.getArrayAttributeAccess().getRightSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__ArrayAttribute__Group__2__Impl632); 
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:348:1: rule__ArrayAttribute__Group__3 : rule__ArrayAttribute__Group__3__Impl rule__ArrayAttribute__Group__4 ;
    public final void rule__ArrayAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:352:1: ( rule__ArrayAttribute__Group__3__Impl rule__ArrayAttribute__Group__4 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:353:2: rule__ArrayAttribute__Group__3__Impl rule__ArrayAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__3__Impl_in_rule__ArrayAttribute__Group__3663);
            rule__ArrayAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group__4_in_rule__ArrayAttribute__Group__3666);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:360:1: rule__ArrayAttribute__Group__3__Impl : ( '=' ) ;
    public final void rule__ArrayAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:364:1: ( ( '=' ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:365:1: ( '=' )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:365:1: ( '=' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:366:1: '='
            {
             before(grammarAccess.getArrayAttributeAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ArrayAttribute__Group__3__Impl694); 
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:379:1: rule__ArrayAttribute__Group__4 : rule__ArrayAttribute__Group__4__Impl rule__ArrayAttribute__Group__5 ;
    public final void rule__ArrayAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:383:1: ( rule__ArrayAttribute__Group__4__Impl rule__ArrayAttribute__Group__5 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:384:2: rule__ArrayAttribute__Group__4__Impl rule__ArrayAttribute__Group__5
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__4__Impl_in_rule__ArrayAttribute__Group__4725);
            rule__ArrayAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group__5_in_rule__ArrayAttribute__Group__4728);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:391:1: rule__ArrayAttribute__Group__4__Impl : ( ( rule__ArrayAttribute__ItemsAssignment_4 )? ) ;
    public final void rule__ArrayAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:395:1: ( ( ( rule__ArrayAttribute__ItemsAssignment_4 )? ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:396:1: ( ( rule__ArrayAttribute__ItemsAssignment_4 )? )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:396:1: ( ( rule__ArrayAttribute__ItemsAssignment_4 )? )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:397:1: ( rule__ArrayAttribute__ItemsAssignment_4 )?
            {
             before(grammarAccess.getArrayAttributeAccess().getItemsAssignment_4()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:398:1: ( rule__ArrayAttribute__ItemsAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:398:2: rule__ArrayAttribute__ItemsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ArrayAttribute__ItemsAssignment_4_in_rule__ArrayAttribute__Group__4__Impl755);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:408:1: rule__ArrayAttribute__Group__5 : rule__ArrayAttribute__Group__5__Impl ;
    public final void rule__ArrayAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:412:1: ( rule__ArrayAttribute__Group__5__Impl )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:413:2: rule__ArrayAttribute__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group__5__Impl_in_rule__ArrayAttribute__Group__5786);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:419:1: rule__ArrayAttribute__Group__5__Impl : ( ( rule__ArrayAttribute__Group_5__0 )* ) ;
    public final void rule__ArrayAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:423:1: ( ( ( rule__ArrayAttribute__Group_5__0 )* ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:424:1: ( ( rule__ArrayAttribute__Group_5__0 )* )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:424:1: ( ( rule__ArrayAttribute__Group_5__0 )* )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:425:1: ( rule__ArrayAttribute__Group_5__0 )*
            {
             before(grammarAccess.getArrayAttributeAccess().getGroup_5()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:426:1: ( rule__ArrayAttribute__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:426:2: rule__ArrayAttribute__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayAttribute__Group_5__0_in_rule__ArrayAttribute__Group__5__Impl813);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:448:1: rule__ArrayAttribute__Group_5__0 : rule__ArrayAttribute__Group_5__0__Impl rule__ArrayAttribute__Group_5__1 ;
    public final void rule__ArrayAttribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:452:1: ( rule__ArrayAttribute__Group_5__0__Impl rule__ArrayAttribute__Group_5__1 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:453:2: rule__ArrayAttribute__Group_5__0__Impl rule__ArrayAttribute__Group_5__1
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group_5__0__Impl_in_rule__ArrayAttribute__Group_5__0856);
            rule__ArrayAttribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayAttribute__Group_5__1_in_rule__ArrayAttribute__Group_5__0859);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:460:1: rule__ArrayAttribute__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ArrayAttribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:464:1: ( ( ',' ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:465:1: ( ',' )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:465:1: ( ',' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:466:1: ','
            {
             before(grammarAccess.getArrayAttributeAccess().getCommaKeyword_5_0()); 
            match(input,15,FOLLOW_15_in_rule__ArrayAttribute__Group_5__0__Impl887); 
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:479:1: rule__ArrayAttribute__Group_5__1 : rule__ArrayAttribute__Group_5__1__Impl ;
    public final void rule__ArrayAttribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:483:1: ( rule__ArrayAttribute__Group_5__1__Impl )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:484:2: rule__ArrayAttribute__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__Group_5__1__Impl_in_rule__ArrayAttribute__Group_5__1918);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:490:1: rule__ArrayAttribute__Group_5__1__Impl : ( ( rule__ArrayAttribute__ItemsAssignment_5_1 ) ) ;
    public final void rule__ArrayAttribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:494:1: ( ( ( rule__ArrayAttribute__ItemsAssignment_5_1 ) ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:495:1: ( ( rule__ArrayAttribute__ItemsAssignment_5_1 ) )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:495:1: ( ( rule__ArrayAttribute__ItemsAssignment_5_1 ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:496:1: ( rule__ArrayAttribute__ItemsAssignment_5_1 )
            {
             before(grammarAccess.getArrayAttributeAccess().getItemsAssignment_5_1()); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:497:1: ( rule__ArrayAttribute__ItemsAssignment_5_1 )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:497:2: rule__ArrayAttribute__ItemsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ArrayAttribute__ItemsAssignment_5_1_in_rule__ArrayAttribute__Group_5__1__Impl945);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:512:1: rule__Model__AttributesAssignment : ( ruleAttribute ) ;
    public final void rule__Model__AttributesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:516:1: ( ( ruleAttribute ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:517:1: ( ruleAttribute )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:517:1: ( ruleAttribute )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:518:1: ruleAttribute
            {
             before(grammarAccess.getModelAccess().getAttributesAttributeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Model__AttributesAssignment984);
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:527:1: rule__SimpleAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:531:1: ( ( RULE_ID ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:532:1: ( RULE_ID )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:532:1: ( RULE_ID )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:533:1: RULE_ID
            {
             before(grammarAccess.getSimpleAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleAttribute__NameAssignment_01015); 
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


    // $ANTLR start "rule__SimpleAttribute__ValueAssignment_1"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:542:1: rule__SimpleAttribute__ValueAssignment_1 : ( RULE_PROPERTY_VALUE ) ;
    public final void rule__SimpleAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:546:1: ( ( RULE_PROPERTY_VALUE ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:547:1: ( RULE_PROPERTY_VALUE )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:547:1: ( RULE_PROPERTY_VALUE )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:548:1: RULE_PROPERTY_VALUE
            {
             before(grammarAccess.getSimpleAttributeAccess().getValuePROPERTY_VALUETerminalRuleCall_1_0()); 
            match(input,RULE_PROPERTY_VALUE,FOLLOW_RULE_PROPERTY_VALUE_in_rule__SimpleAttribute__ValueAssignment_11046); 
             after(grammarAccess.getSimpleAttributeAccess().getValuePROPERTY_VALUETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SimpleAttribute__ValueAssignment_1"


    // $ANTLR start "rule__ArrayAttribute__NameAssignment_0"
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:557:1: rule__ArrayAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ArrayAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:561:1: ( ( RULE_ID ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:562:1: ( RULE_ID )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:562:1: ( RULE_ID )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:563:1: RULE_ID
            {
             before(grammarAccess.getArrayAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArrayAttribute__NameAssignment_01077); 
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:572:1: rule__ArrayAttribute__ItemsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ArrayAttribute__ItemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:576:1: ( ( RULE_STRING ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:577:1: ( RULE_STRING )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:577:1: ( RULE_STRING )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:578:1: RULE_STRING
            {
             before(grammarAccess.getArrayAttributeAccess().getItemsSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ArrayAttribute__ItemsAssignment_41108); 
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
    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:587:1: rule__ArrayAttribute__ItemsAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__ArrayAttribute__ItemsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:591:1: ( ( RULE_STRING ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:592:1: ( RULE_STRING )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:592:1: ( RULE_STRING )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:593:1: RULE_STRING
            {
             before(grammarAccess.getArrayAttributeAccess().getItemsSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ArrayAttribute__ItemsAssignment_5_11139); 
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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AttributesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__0_in_ruleSimpleAttribute215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayAttribute_in_entryRuleArrayAttribute242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayAttribute249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__0_in_ruleArrayAttribute275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayAttribute_in_rule__Attribute__Alternatives328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__0__Impl_in_rule__SimpleAttribute__Group__0358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__1_in_rule__SimpleAttribute__Group__0361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__NameAssignment_0_in_rule__SimpleAttribute__Group__0__Impl388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__Group__1__Impl_in_rule__SimpleAttribute__Group__1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleAttribute__ValueAssignment_1_in_rule__SimpleAttribute__Group__1__Impl445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__0__Impl_in_rule__ArrayAttribute__Group__0479 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__1_in_rule__ArrayAttribute__Group__0482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__NameAssignment_0_in_rule__ArrayAttribute__Group__0__Impl509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__1__Impl_in_rule__ArrayAttribute__Group__1539 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__2_in_rule__ArrayAttribute__Group__1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ArrayAttribute__Group__1__Impl570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__2__Impl_in_rule__ArrayAttribute__Group__2601 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__3_in_rule__ArrayAttribute__Group__2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ArrayAttribute__Group__2__Impl632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__3__Impl_in_rule__ArrayAttribute__Group__3663 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__4_in_rule__ArrayAttribute__Group__3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ArrayAttribute__Group__3__Impl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__4__Impl_in_rule__ArrayAttribute__Group__4725 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__5_in_rule__ArrayAttribute__Group__4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__ItemsAssignment_4_in_rule__ArrayAttribute__Group__4__Impl755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group__5__Impl_in_rule__ArrayAttribute__Group__5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group_5__0_in_rule__ArrayAttribute__Group__5__Impl813 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group_5__0__Impl_in_rule__ArrayAttribute__Group_5__0856 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group_5__1_in_rule__ArrayAttribute__Group_5__0859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ArrayAttribute__Group_5__0__Impl887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__Group_5__1__Impl_in_rule__ArrayAttribute__Group_5__1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayAttribute__ItemsAssignment_5_1_in_rule__ArrayAttribute__Group_5__1__Impl945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Model__AttributesAssignment984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleAttribute__NameAssignment_01015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROPERTY_VALUE_in_rule__SimpleAttribute__ValueAssignment_11046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArrayAttribute__NameAssignment_01077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ArrayAttribute__ItemsAssignment_41108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ArrayAttribute__ItemsAssignment_5_11139 = new BitSet(new long[]{0x0000000000000002L});

}