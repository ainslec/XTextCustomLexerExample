package org.consoli.customlexerexample.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.consoli.customlexerexample.services.AttributesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAttributesParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g"; }




    	private AttributesGrammarAccess grammarAccess;
    	 	
    	public InternalAttributesParser(TokenStream input, AttributesGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Model";	
    	} 
    	   	   	
    	@Override
    	protected AttributesGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleModel"
    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:61:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:62:2: (iv_ruleModel= ruleModel EOF )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:63:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel77); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:70:1: ruleModel returns [EObject current=null] : ( (lv_attributes_0_0= ruleAttribute ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:73:28: ( ( (lv_attributes_0_0= ruleAttribute ) )* )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:74:1: ( (lv_attributes_0_0= ruleAttribute ) )*
            {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:74:1: ( (lv_attributes_0_0= ruleAttribute ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:75:1: (lv_attributes_0_0= ruleAttribute )
            	    {
            	    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:75:1: (lv_attributes_0_0= ruleAttribute )
            	    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:76:3: lv_attributes_0_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getAttributesAttributeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleModel122);
            	    lv_attributes_0_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_0_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAttribute"
    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:100:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:101:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:102:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute157);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute167); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:109:1: ruleAttribute returns [EObject current=null] : (this_SimpleAttribute_0= ruleSimpleAttribute | this_ArrayAttribute_1= ruleArrayAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAttribute_0 = null;

        EObject this_ArrayAttribute_1 = null;


         enterRule(); 
            
        try {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:112:28: ( (this_SimpleAttribute_0= ruleSimpleAttribute | this_ArrayAttribute_1= ruleArrayAttribute ) )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:113:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_ArrayAttribute_1= ruleArrayAttribute )
            {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:113:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_ArrayAttribute_1= ruleArrayAttribute )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==KEYWORD_3) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_PROPERTY_VALUE) ) {
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
                    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:114:5: this_SimpleAttribute_0= ruleSimpleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleAttribute_in_ruleAttribute214);
                    this_SimpleAttribute_0=ruleSimpleAttribute();

                    state._fsp--;


                            current = this_SimpleAttribute_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:124:5: this_ArrayAttribute_1= ruleArrayAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getArrayAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArrayAttribute_in_ruleAttribute241);
                    this_ArrayAttribute_1=ruleArrayAttribute();

                    state._fsp--;


                            current = this_ArrayAttribute_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleSimpleAttribute"
    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:140:1: entryRuleSimpleAttribute returns [EObject current=null] : iv_ruleSimpleAttribute= ruleSimpleAttribute EOF ;
    public final EObject entryRuleSimpleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttribute = null;


        try {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:141:2: (iv_ruleSimpleAttribute= ruleSimpleAttribute EOF )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:142:2: iv_ruleSimpleAttribute= ruleSimpleAttribute EOF
            {
             newCompositeNode(grammarAccess.getSimpleAttributeRule()); 
            pushFollow(FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute275);
            iv_ruleSimpleAttribute=ruleSimpleAttribute();

            state._fsp--;

             current =iv_ruleSimpleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleAttribute285); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleAttribute"


    // $ANTLR start "ruleSimpleAttribute"
    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:149:1: ruleSimpleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_PROPERTY_VALUE ) ) ) ;
    public final EObject ruleSimpleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:152:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_PROPERTY_VALUE ) ) ) )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:153:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_PROPERTY_VALUE ) ) )
            {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:153:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_PROPERTY_VALUE ) ) )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:153:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_PROPERTY_VALUE ) )
            {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:153:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:154:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:154:1: (lv_name_0_0= RULE_ID )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:155:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleAttribute327); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSimpleAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:171:2: ( (lv_value_1_0= RULE_PROPERTY_VALUE ) )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:172:1: (lv_value_1_0= RULE_PROPERTY_VALUE )
            {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:172:1: (lv_value_1_0= RULE_PROPERTY_VALUE )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:173:3: lv_value_1_0= RULE_PROPERTY_VALUE
            {
            lv_value_1_0=(Token)match(input,RULE_PROPERTY_VALUE,FOLLOW_RULE_PROPERTY_VALUE_in_ruleSimpleAttribute349); 

            			newLeafNode(lv_value_1_0, grammarAccess.getSimpleAttributeAccess().getValuePROPERTY_VALUETerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"PROPERTY_VALUE");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleAttribute"


    // $ANTLR start "entryRuleArrayAttribute"
    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:197:1: entryRuleArrayAttribute returns [EObject current=null] : iv_ruleArrayAttribute= ruleArrayAttribute EOF ;
    public final EObject entryRuleArrayAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayAttribute = null;


        try {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:198:2: (iv_ruleArrayAttribute= ruleArrayAttribute EOF )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:199:2: iv_ruleArrayAttribute= ruleArrayAttribute EOF
            {
             newCompositeNode(grammarAccess.getArrayAttributeRule()); 
            pushFollow(FOLLOW_ruleArrayAttribute_in_entryRuleArrayAttribute389);
            iv_ruleArrayAttribute=ruleArrayAttribute();

            state._fsp--;

             current =iv_ruleArrayAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayAttribute399); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayAttribute"


    // $ANTLR start "ruleArrayAttribute"
    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:206:1: ruleArrayAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_3 otherlv_2= KEYWORD_4 otherlv_3= KEYWORD_2 ( (lv_items_4_0= RULE_STRING ) )? (otherlv_5= KEYWORD_1 ( (lv_items_6_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleArrayAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_items_4_0=null;
        Token otherlv_5=null;
        Token lv_items_6_0=null;

         enterRule(); 
            
        try {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:209:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_3 otherlv_2= KEYWORD_4 otherlv_3= KEYWORD_2 ( (lv_items_4_0= RULE_STRING ) )? (otherlv_5= KEYWORD_1 ( (lv_items_6_0= RULE_STRING ) ) )* ) )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:210:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_3 otherlv_2= KEYWORD_4 otherlv_3= KEYWORD_2 ( (lv_items_4_0= RULE_STRING ) )? (otherlv_5= KEYWORD_1 ( (lv_items_6_0= RULE_STRING ) ) )* )
            {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:210:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_3 otherlv_2= KEYWORD_4 otherlv_3= KEYWORD_2 ( (lv_items_4_0= RULE_STRING ) )? (otherlv_5= KEYWORD_1 ( (lv_items_6_0= RULE_STRING ) ) )* )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:210:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_3 otherlv_2= KEYWORD_4 otherlv_3= KEYWORD_2 ( (lv_items_4_0= RULE_STRING ) )? (otherlv_5= KEYWORD_1 ( (lv_items_6_0= RULE_STRING ) ) )*
            {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:210:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:211:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:211:1: (lv_name_0_0= RULE_ID )
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:212:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArrayAttribute441); 

            			newLeafNode(lv_name_0_0, grammarAccess.getArrayAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArrayAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleArrayAttribute459); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayAttributeAccess().getLeftSquareBracketKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleArrayAttribute471); 

                	newLeafNode(otherlv_2, grammarAccess.getArrayAttributeAccess().getRightSquareBracketKeyword_2());
                
            otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleArrayAttribute483); 

                	newLeafNode(otherlv_3, grammarAccess.getArrayAttributeAccess().getEqualsSignKeyword_3());
                
            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:243:1: ( (lv_items_4_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:244:1: (lv_items_4_0= RULE_STRING )
                    {
                    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:244:1: (lv_items_4_0= RULE_STRING )
                    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:245:3: lv_items_4_0= RULE_STRING
                    {
                    lv_items_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArrayAttribute499); 

                    			newLeafNode(lv_items_4_0, grammarAccess.getArrayAttributeAccess().getItemsSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrayAttributeRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"items",
                            		lv_items_4_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:261:3: (otherlv_5= KEYWORD_1 ( (lv_items_6_0= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==KEYWORD_1) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:262:2: otherlv_5= KEYWORD_1 ( (lv_items_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleArrayAttribute519); 

            	        	newLeafNode(otherlv_5, grammarAccess.getArrayAttributeAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:266:1: ( (lv_items_6_0= RULE_STRING ) )
            	    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:267:1: (lv_items_6_0= RULE_STRING )
            	    {
            	    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:267:1: (lv_items_6_0= RULE_STRING )
            	    // ../org.consoli.attributes/src-gen/org/consoli/customlexerexample/parser/antlr/internal/InternalAttributesParser.g:268:3: lv_items_6_0= RULE_STRING
            	    {
            	    lv_items_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArrayAttribute535); 

            	    			newLeafNode(lv_items_6_0, grammarAccess.getArrayAttributeAccess().getItemsSTRINGTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getArrayAttributeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"items",
            	            		lv_items_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleModel122 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_ruleAttribute214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayAttribute_in_ruleAttribute241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleAttribute327 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PROPERTY_VALUE_in_ruleSimpleAttribute349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayAttribute_in_entryRuleArrayAttribute389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayAttribute399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArrayAttribute441 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleArrayAttribute459 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleArrayAttribute471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleArrayAttribute483 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArrayAttribute499 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleArrayAttribute519 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArrayAttribute535 = new BitSet(new long[]{0x0000000000000012L});

}