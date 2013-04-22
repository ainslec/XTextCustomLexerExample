package org.consoli.customlexerexample.ui.contentassist;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CustomAttributesContentAssistLexer extends Lexer {
    public static final int RULE_ID=9;
    public static final int RULE_STRING=11;
    public static final int RULE_ANY_OTHER=15;
    public static final int KEYWORD_1=4;
    public static final int RULE_INT=10;
    public static final int KEYWORD_4=7;
    public static final int KEYWORD_3=6;
    public static final int KEYWORD_2=5;
    public static final int RULE_WS=14;
    public static final int RULE_PROPERTY_VALUE=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;

      private boolean isArray = false;
      private boolean isAttributeValue = false;


    // delegates
    // delegators

    public CustomAttributesContentAssistLexer() {;} 
    public CustomAttributesContentAssistLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CustomAttributesContentAssistLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g"; }

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:16:11: ({...}? => ',' )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:16:13: {...}? => ','
            {
            if ( !((!isAttributeValue)) ) {
                throw new FailedPredicateException(input, "KEYWORD_1", "!isAttributeValue");
            }
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:17:11: ({...}? => '=' )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:17:13: {...}? => '='
            {
            if ( !((!isAttributeValue)) ) {
                throw new FailedPredicateException(input, "KEYWORD_2", "!isAttributeValue");
            }
            match('='); 
             if (!isArray) {isAttributeValue = true;} 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:18:11: ({...}? => '[' )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:18:13: {...}? => '['
            {
            if ( !((!isAttributeValue)) ) {
                throw new FailedPredicateException(input, "KEYWORD_3", "!isAttributeValue");
            }
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:19:11: ({...}? => ']' )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:19:13: {...}? => ']'
            {
            if ( !((!isAttributeValue)) ) {
                throw new FailedPredicateException(input, "KEYWORD_4", "!isAttributeValue");
            }
            match(']'); 
             isArray = true; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "RULE_PROPERTY_VALUE"
    public final void mRULE_PROPERTY_VALUE() throws RecognitionException {
        try {
            int _type = RULE_PROPERTY_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:21:21: ({...}? => (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:21:23: {...}? => (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            if ( !((isAttributeValue)) ) {
                throw new FailedPredicateException(input, "RULE_PROPERTY_VALUE", "isAttributeValue");
            }
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:21:45: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:21:45: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:21:61: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:21:62: ( '\\r' )? '\\n'
                    {
                    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:21:62: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:21:62: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }

            isAttributeValue = false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROPERTY_VALUE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:22:9: ({...}? => ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:22:11: {...}? => ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( !((!isAttributeValue)) ) {
                throw new FailedPredicateException(input, "RULE_ID", "!isAttributeValue");
            }
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:22:34: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:22:34: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:22:63: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             isArray = false; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:23:10: ({...}? => ( '0' .. '9' )+ )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:23:12: {...}? => ( '0' .. '9' )+
            {
            if ( !((!isAttributeValue)) ) {
                throw new FailedPredicateException(input, "RULE_INT", "!isAttributeValue");
            }
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:23:35: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:23:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:13: ({...}? => ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:15: {...}? => ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            if ( !((!isAttributeValue)) ) {
                throw new FailedPredicateException(input, "RULE_STRING", "!isAttributeValue");
            }
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:38: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:39: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:43: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:44: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:89: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:109: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:114: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:115: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:24:160: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:25:17: ({...}? => '/*' ( options {greedy=false; } : . )* '*/' )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:25:19: {...}? => '/*' ( options {greedy=false; } : . )* '*/'
            {
            if ( !((!isAttributeValue)) ) {
                throw new FailedPredicateException(input, "RULE_ML_COMMENT", "!isAttributeValue");
            }
            match("/*"); 

            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:25:47: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:25:75: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:26:17: ({...}? => '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:26:19: {...}? => '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            if ( !((!isAttributeValue)) ) {
                throw new FailedPredicateException(input, "RULE_SL_COMMENT", "!isAttributeValue");
            }
            match("//"); 

            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:26:47: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:26:47: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:26:63: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:26:64: ( '\\r' )? '\\n'
                    {
                    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:26:64: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:26:64: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:27:9: ({...}? => ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:27:11: {...}? => ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            if ( !((!isAttributeValue)) ) {
                throw new FailedPredicateException(input, "RULE_WS", "!isAttributeValue");
            }
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:27:34: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:28:16: ( . )
            // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:28:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:8: ( KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | RULE_PROPERTY_VALUE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=12;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:10: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 2 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:20: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 3 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:30: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 4 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:40: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 5 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:50: RULE_PROPERTY_VALUE
                {
                mRULE_PROPERTY_VALUE(); 

                }
                break;
            case 6 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:70: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:78: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:87: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:99: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:115: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:131: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // D:\\projects\\public\\XTextCustomLexerExample\\org.consoli.attributes\\..\\org.consoli.attributes.ui\\src-gen\\org\\consoli\\customlexerexample\\ui\\contentassist\\CustomAttributesContentAssistLexer.g:1:139: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\10\1\20\1\21\1\22\1\23\1\25\1\27\1\31\1\uffff\1\32\1\34\3\25"+
        "\1\31\1\25\4\uffff\1\61\1\uffff\1\62\4\uffff\1\61\1\uffff\1\65\1"+
        "\10\1\uffff\1\70\3\10\1\uffff\1\70\3\10\1\101\1\30\1\62\12\uffff"+
        "\1\10\2\uffff\2\10\1\uffff\2\10\1\101\1\uffff\1\101\1\uffff\1\105"+
        "\3\uffff";
    static final String DFA15_eofS =
        "\106\uffff";
    static final String DFA15_minS =
        "\6\0\2\11\1\uffff\15\0\1\11\1\0\1\uffff\5\0\1\42\4\0\1\42\6\0\1"+
        "\12\1\0\5\uffff\2\0\2\uffff\2\0\1\uffff\7\0\1\12\3\0\2\uffff\1\0";
    static final String DFA15_maxS =
        "\6\uffff\2\40\1\uffff\7\uffff\4\0\1\uffff\1\0\1\40\1\0\1\uffff"+
        "\2\0\1\uffff\1\0\1\uffff\1\165\4\uffff\1\165\6\uffff\1\12\1\uffff"+
        "\5\uffff\2\0\2\uffff\1\0\1\uffff\1\uffff\1\0\6\uffff\1\12\2\0\1"+
        "\uffff\2\uffff\1\0";
    static final String DFA15_acceptS =
        "\10\uffff\1\5\17\uffff\1\13\23\uffff\1\1\1\14\1\2\1\3\1\4\2\uffff"+
        "\1\6\1\7\2\uffff\1\10\13\uffff\1\11\1\12\1\uffff";
    static final String DFA15_specialS =
        "\1\66\1\67\1\10\1\14\1\63\1\23\1\20\1\37\1\uffff\1\51\1\2\1\34"+
        "\1\43\1\60\1\7\1\1\1\41\1\42\1\45\1\46\1\5\1\24\1\6\1\17\1\uffff"+
        "\1\27\1\44\1\71\1\31\1\21\1\33\1\50\1\26\1\40\1\64\1\70\1\15\1\52"+
        "\1\35\1\4\1\61\1\11\1\12\1\47\5\uffff\1\62\1\22\2\uffff\1\54\1\53"+
        "\1\uffff\1\55\1\0\1\36\1\13\1\3\1\32\1\25\1\16\1\30\1\57\1\65\2"+
        "\uffff\1\56}>";
    static final String[] DFA15_transitionS = {
            "\11\17\1\16\1\7\2\17\1\6\22\17\1\16\1\17\1\13\4\17\1\14\4\17"+
            "\1\1\2\17\1\15\12\12\3\17\1\2\3\17\32\11\1\3\1\17\1\4\1\5\1"+
            "\11\1\17\32\11\uff85\17",
            "\0\10",
            "\0\10",
            "\0\10",
            "\0\10",
            "\101\10\32\24\4\10\1\24\1\10\32\24\uff85\10",
            "\1\30\1\26\2\uffff\1\30\22\uffff\1\30",
            "\2\30\2\uffff\1\30\22\uffff\1\30",
            "",
            "\60\10\12\33\7\10\32\33\4\10\1\33\1\10\32\33\uff85\10",
            "\60\10\12\35\uffc6\10",
            "\12\42\1\41\2\42\1\37\24\42\1\40\71\42\1\36\uffa3\42",
            "\12\47\1\46\2\47\1\44\31\47\1\45\64\47\1\43\uffa3\47",
            "\52\10\1\50\4\10\1\51\uffd0\10",
            "\11\10\1\53\1\26\2\10\1\52\22\10\1\53\uffdf\10",
            "\0\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\60\10\12\33\7\10\32\33\4\10\1\33\1\10\32\33\uff85\10",
            "\1\uffff",
            "\2\30\2\uffff\1\30\22\uffff\1\30",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\60\10\12\33\7\10\32\33\4\10\1\33\1\10\32\33\uff85\10",
            "\1\uffff",
            "\60\10\12\35\uffc6\10",
            "\1\66\4\uffff\1\66\64\uffff\1\66\5\uffff\1\66\3\uffff\1\66"+
            "\7\uffff\1\66\3\uffff\1\66\1\uffff\2\66",
            "\12\67\1\41\ufff5\67",
            "\0\10",
            "\0\67",
            "\12\42\1\41\2\42\1\37\24\42\1\40\71\42\1\36\uffa3\42",
            "\1\71\4\uffff\1\71\64\uffff\1\71\5\uffff\1\71\3\uffff\1\71"+
            "\7\uffff\1\71\3\uffff\1\71\1\uffff\2\71",
            "\12\67\1\46\ufff5\67",
            "\0\10",
            "\0\67",
            "\12\47\1\46\2\47\1\44\31\47\1\45\64\47\1\43\uffa3\47",
            "\12\75\1\74\2\75\1\73\34\75\1\72\uffd5\75",
            "\12\76\1\100\2\76\1\77\ufff2\76",
            "\1\26",
            "\11\10\1\53\1\26\2\10\1\52\22\10\1\53\uffdf\10",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\12\42\1\41\2\42\1\37\24\42\1\40\71\42\1\36\uffa3\42",
            "",
            "\1\uffff",
            "\12\47\1\46\2\47\1\44\31\47\1\45\64\47\1\43\uffa3\47",
            "\12\75\1\74\2\75\1\73\34\75\1\72\4\75\1\102\uffd0\75",
            "\12\103\1\74\ufff5\103",
            "\0\103",
            "\12\75\1\74\2\75\1\73\34\75\1\72\uffd5\75",
            "\12\76\1\100\2\76\1\77\ufff2\76",
            "\1\100",
            "\1\uffff",
            "\1\uffff",
            "\12\75\1\74\2\75\1\73\34\75\1\72\uffd5\75",
            "",
            "",
            "\1\uffff"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | RULE_PROPERTY_VALUE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_57 = input.LA(1);

                         
                        int index15_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_57=='\'') && (((!isAttributeValue)||(isAttributeValue)))) {s = 37;}

                        else if ( (LA15_57=='\\') && (((!isAttributeValue)||(isAttributeValue)))) {s = 35;}

                        else if ( (LA15_57=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 36;}

                        else if ( (LA15_57=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 38;}

                        else if ( ((LA15_57>='\u0000' && LA15_57<='\t')||(LA15_57>='\u000B' && LA15_57<='\f')||(LA15_57>='\u000E' && LA15_57<='&')||(LA15_57>='(' && LA15_57<='[')||(LA15_57>=']' && LA15_57<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 39;}

                        else s = 8;

                         
                        input.seek(index15_57);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_15 = input.LA(1);

                         
                        int index15_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_15>='\u0000' && LA15_15<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 21;

                         
                        input.seek(index15_15);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_10>='0' && LA15_10<='9')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 29;}

                        else if ( ((LA15_10>='\u0000' && LA15_10<='/')||(LA15_10>=':' && LA15_10<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 28;

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_60 = input.LA(1);

                         
                        int index15_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_60>='\u0000' && LA15_60<='\uFFFF')) && ((!isAttributeValue))) {s = 67;}

                        else s = 8;

                         
                        input.seek(index15_60);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_39 = input.LA(1);

                         
                        int index15_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_39=='\'') && (((!isAttributeValue)||(isAttributeValue)))) {s = 37;}

                        else if ( (LA15_39=='\\') && (((!isAttributeValue)||(isAttributeValue)))) {s = 35;}

                        else if ( (LA15_39=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 36;}

                        else if ( (LA15_39=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 38;}

                        else if ( ((LA15_39>='\u0000' && LA15_39<='\t')||(LA15_39>='\u000B' && LA15_39<='\f')||(LA15_39>='\u000E' && LA15_39<='&')||(LA15_39>='(' && LA15_39<='[')||(LA15_39>=']' && LA15_39<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 39;}

                        else s = 8;

                         
                        input.seek(index15_39);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_20 = input.LA(1);

                         
                        int index15_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_20>='0' && LA15_20<='9')||(LA15_20>='A' && LA15_20<='Z')||LA15_20=='_'||(LA15_20>='a' && LA15_20<='z')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 27;}

                        else if ( ((LA15_20>='\u0000' && LA15_20<='/')||(LA15_20>=':' && LA15_20<='@')||(LA15_20>='[' && LA15_20<='^')||LA15_20=='`'||(LA15_20>='{' && LA15_20<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 49;

                         
                        input.seek(index15_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_22 = input.LA(1);

                         
                        int index15_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_22>='\t' && LA15_22<='\n')||LA15_22=='\r'||LA15_22==' ') && ((!isAttributeValue))) {s = 24;}

                        else s = 50;

                         
                        input.seek(index15_22);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_14 = input.LA(1);

                         
                        int index15_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_14=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 42;}

                        else if ( (LA15_14=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 22;}

                        else if ( (LA15_14=='\t'||LA15_14==' ') && (((!isAttributeValue)||(isAttributeValue)))) {s = 43;}

                        else if ( ((LA15_14>='\u0000' && LA15_14<='\b')||(LA15_14>='\u000B' && LA15_14<='\f')||(LA15_14>='\u000E' && LA15_14<='\u001F')||(LA15_14>='!' && LA15_14<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 25;

                         
                        input.seek(index15_14);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_2>='\u0000' && LA15_2<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 17;

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_41 = input.LA(1);

                         
                        int index15_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_41>='\u0000' && LA15_41<='\t')||(LA15_41>='\u000B' && LA15_41<='\f')||(LA15_41>='\u000E' && LA15_41<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 62;}

                        else if ( (LA15_41=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 63;}

                        else if ( (LA15_41=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 64;}

                        else s = 65;

                         
                        input.seek(index15_41);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_42 = input.LA(1);

                         
                        int index15_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_42=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 22;}

                        else s = 24;

                         
                        input.seek(index15_42);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_59 = input.LA(1);

                         
                        int index15_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_59=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 60;}

                        else if ( ((LA15_59>='\u0000' && LA15_59<='\t')||(LA15_59>='\u000B' && LA15_59<='\uFFFF')) && ((!isAttributeValue))) {s = 67;}

                         
                        input.seek(index15_59);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_3>='\u0000' && LA15_3<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 18;

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA15_36 = input.LA(1);

                         
                        int index15_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_36=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 38;}

                        else if ( ((LA15_36>='\u0000' && LA15_36<='\t')||(LA15_36>='\u000B' && LA15_36<='\uFFFF')) && ((!isAttributeValue))) {s = 55;}

                         
                        input.seek(index15_36);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA15_63 = input.LA(1);

                         
                        int index15_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_63=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 64;}

                         
                        input.seek(index15_63);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA15_23 = input.LA(1);

                         
                        int index15_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!isAttributeValue)) ) {s = 24;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index15_23);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_6=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 22;}

                        else if ( (LA15_6=='\t'||LA15_6=='\r'||LA15_6==' ') && ((!isAttributeValue))) {s = 24;}

                        else s = 23;

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA15_29 = input.LA(1);

                         
                        int index15_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_29>='0' && LA15_29<='9')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 29;}

                        else if ( ((LA15_29>='\u0000' && LA15_29<='/')||(LA15_29>=':' && LA15_29<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 53;

                         
                        input.seek(index15_29);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA15_50 = input.LA(1);

                         
                        int index15_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( ((!isAttributeValue)) ) {s = 24;}

                         
                        input.seek(index15_50);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA15_5 = input.LA(1);

                         
                        int index15_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_5>='A' && LA15_5<='Z')||LA15_5=='_'||(LA15_5>='a' && LA15_5<='z')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 20;}

                        else if ( ((LA15_5>='\u0000' && LA15_5<='@')||(LA15_5>='[' && LA15_5<='^')||LA15_5=='`'||(LA15_5>='{' && LA15_5<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 21;

                         
                        input.seek(index15_5);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA15_21 = input.LA(1);

                         
                        int index15_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index15_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA15_62 = input.LA(1);

                         
                        int index15_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_62=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 63;}

                        else if ( (LA15_62=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 64;}

                        else if ( ((LA15_62>='\u0000' && LA15_62<='\t')||(LA15_62>='\u000B' && LA15_62<='\f')||(LA15_62>='\u000E' && LA15_62<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 62;}

                        else s = 65;

                         
                        input.seek(index15_62);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA15_32 = input.LA(1);

                         
                        int index15_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_32>='\u0000' && LA15_32<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 56;

                         
                        input.seek(index15_32);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA15_25 = input.LA(1);

                         
                        int index15_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( ((!isAttributeValue)) ) {s = 24;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index15_25);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA15_64 = input.LA(1);

                         
                        int index15_64 = input.index();
                        input.rewind();
                        s = -1;
                        s = 65;

                         
                        input.seek(index15_64);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA15_28 = input.LA(1);

                         
                        int index15_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( ((!isAttributeValue)) ) {s = 52;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index15_28);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA15_61 = input.LA(1);

                         
                        int index15_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_61=='*') && (((!isAttributeValue)||(isAttributeValue)))) {s = 58;}

                        else if ( (LA15_61=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 59;}

                        else if ( (LA15_61=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 60;}

                        else if ( ((LA15_61>='\u0000' && LA15_61<='\t')||(LA15_61>='\u000B' && LA15_61<='\f')||(LA15_61>='\u000E' && LA15_61<=')')||(LA15_61>='+' && LA15_61<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 61;}

                        else s = 8;

                         
                        input.seek(index15_61);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA15_30 = input.LA(1);

                         
                        int index15_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_30=='\"'||LA15_30=='\''||LA15_30=='\\'||LA15_30=='b'||LA15_30=='f'||LA15_30=='n'||LA15_30=='r'||(LA15_30>='t' && LA15_30<='u')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 54;}

                        else s = 8;

                         
                        input.seek(index15_30);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_11=='\\') && (((!isAttributeValue)||(isAttributeValue)))) {s = 30;}

                        else if ( (LA15_11=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 31;}

                        else if ( (LA15_11=='\"') && (((!isAttributeValue)||(isAttributeValue)))) {s = 32;}

                        else if ( (LA15_11=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 33;}

                        else if ( ((LA15_11>='\u0000' && LA15_11<='\t')||(LA15_11>='\u000B' && LA15_11<='\f')||(LA15_11>='\u000E' && LA15_11<='!')||(LA15_11>='#' && LA15_11<='[')||(LA15_11>=']' && LA15_11<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 34;}

                        else s = 21;

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA15_38 = input.LA(1);

                         
                        int index15_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_38>='\u0000' && LA15_38<='\uFFFF')) && ((!isAttributeValue))) {s = 55;}

                        else s = 8;

                         
                        input.seek(index15_38);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA15_58 = input.LA(1);

                         
                        int index15_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_58=='/') && (((!isAttributeValue)||(isAttributeValue)))) {s = 66;}

                        else if ( (LA15_58=='*') && (((!isAttributeValue)||(isAttributeValue)))) {s = 58;}

                        else if ( (LA15_58=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 59;}

                        else if ( (LA15_58=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 60;}

                        else if ( ((LA15_58>='\u0000' && LA15_58<='\t')||(LA15_58>='\u000B' && LA15_58<='\f')||(LA15_58>='\u000E' && LA15_58<=')')||(LA15_58>='+' && LA15_58<='.')||(LA15_58>='0' && LA15_58<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 61;}

                        else s = 8;

                         
                        input.seek(index15_58);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_7>='\t' && LA15_7<='\n')||LA15_7=='\r'||LA15_7==' ') && ((!isAttributeValue))) {s = 24;}

                        else s = 25;

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA15_33 = input.LA(1);

                         
                        int index15_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_33>='\u0000' && LA15_33<='\uFFFF')) && ((!isAttributeValue))) {s = 55;}

                        else s = 8;

                         
                        input.seek(index15_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA15_16 = input.LA(1);

                         
                        int index15_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!isAttributeValue)) ) {s = 44;}

                        else if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index15_16);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA15_17 = input.LA(1);

                         
                        int index15_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!isAttributeValue)) ) {s = 46;}

                        else if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index15_17);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA15_12 = input.LA(1);

                         
                        int index15_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_12=='\\') && (((!isAttributeValue)||(isAttributeValue)))) {s = 35;}

                        else if ( (LA15_12=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 36;}

                        else if ( (LA15_12=='\'') && (((!isAttributeValue)||(isAttributeValue)))) {s = 37;}

                        else if ( (LA15_12=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 38;}

                        else if ( ((LA15_12>='\u0000' && LA15_12<='\t')||(LA15_12>='\u000B' && LA15_12<='\f')||(LA15_12>='\u000E' && LA15_12<='&')||(LA15_12>='(' && LA15_12<='[')||(LA15_12>=']' && LA15_12<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 39;}

                        else s = 21;

                         
                        input.seek(index15_12);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA15_26 = input.LA(1);

                         
                        int index15_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( ((!isAttributeValue)) ) {s = 51;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index15_26);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA15_18 = input.LA(1);

                         
                        int index15_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!isAttributeValue)) ) {s = 47;}

                        else if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index15_18);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA15_19 = input.LA(1);

                         
                        int index15_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!isAttributeValue)) ) {s = 48;}

                        else if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index15_19);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA15_43 = input.LA(1);

                         
                        int index15_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_43=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 42;}

                        else if ( (LA15_43=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 22;}

                        else if ( (LA15_43=='\t'||LA15_43==' ') && (((!isAttributeValue)||(isAttributeValue)))) {s = 43;}

                        else if ( ((LA15_43>='\u0000' && LA15_43<='\b')||(LA15_43>='\u000B' && LA15_43<='\f')||(LA15_43>='\u000E' && LA15_43<='\u001F')||(LA15_43>='!' && LA15_43<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 50;

                         
                        input.seek(index15_43);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA15_31 = input.LA(1);

                         
                        int index15_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_31=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 33;}

                        else if ( ((LA15_31>='\u0000' && LA15_31<='\t')||(LA15_31>='\u000B' && LA15_31<='\uFFFF')) && ((!isAttributeValue))) {s = 55;}

                         
                        input.seek(index15_31);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_9>='0' && LA15_9<='9')||(LA15_9>='A' && LA15_9<='Z')||LA15_9=='_'||(LA15_9>='a' && LA15_9<='z')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 27;}

                        else if ( ((LA15_9>='\u0000' && LA15_9<='/')||(LA15_9>=':' && LA15_9<='@')||(LA15_9>='[' && LA15_9<='^')||LA15_9=='`'||(LA15_9>='{' && LA15_9<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 26;

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA15_37 = input.LA(1);

                         
                        int index15_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_37>='\u0000' && LA15_37<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 56;

                         
                        input.seek(index15_37);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA15_54 = input.LA(1);

                         
                        int index15_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_54=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 31;}

                        else if ( (LA15_54=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 33;}

                        else if ( (LA15_54=='\"') && (((!isAttributeValue)||(isAttributeValue)))) {s = 32;}

                        else if ( (LA15_54=='\\') && (((!isAttributeValue)||(isAttributeValue)))) {s = 30;}

                        else if ( ((LA15_54>='\u0000' && LA15_54<='\t')||(LA15_54>='\u000B' && LA15_54<='\f')||(LA15_54>='\u000E' && LA15_54<='!')||(LA15_54>='#' && LA15_54<='[')||(LA15_54>=']' && LA15_54<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 34;}

                        else s = 8;

                         
                        input.seek(index15_54);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA15_53 = input.LA(1);

                         
                        int index15_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( ((!isAttributeValue)) ) {s = 52;}

                         
                        input.seek(index15_53);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA15_56 = input.LA(1);

                         
                        int index15_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( ((!isAttributeValue)) ) {s = 55;}

                         
                        input.seek(index15_56);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA15_69 = input.LA(1);

                         
                        int index15_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( ((!isAttributeValue)) ) {s = 67;}

                         
                        input.seek(index15_69);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA15_65 = input.LA(1);

                         
                        int index15_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( ((!isAttributeValue)) ) {s = 68;}

                         
                        input.seek(index15_65);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA15_13 = input.LA(1);

                         
                        int index15_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_13=='*') && (((!isAttributeValue)||(isAttributeValue)))) {s = 40;}

                        else if ( (LA15_13=='/') && (((!isAttributeValue)||(isAttributeValue)))) {s = 41;}

                        else if ( ((LA15_13>='\u0000' && LA15_13<=')')||(LA15_13>='+' && LA15_13<='.')||(LA15_13>='0' && LA15_13<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 21;

                         
                        input.seek(index15_13);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA15_40 = input.LA(1);

                         
                        int index15_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_40=='*') && (((!isAttributeValue)||(isAttributeValue)))) {s = 58;}

                        else if ( (LA15_40=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 59;}

                        else if ( (LA15_40=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 60;}

                        else if ( ((LA15_40>='\u0000' && LA15_40<='\t')||(LA15_40>='\u000B' && LA15_40<='\f')||(LA15_40>='\u000E' && LA15_40<=')')||(LA15_40>='+' && LA15_40<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 61;}

                        else s = 8;

                         
                        input.seek(index15_40);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA15_49 = input.LA(1);

                         
                        int index15_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((isAttributeValue)) ) {s = 8;}

                        else if ( ((!isAttributeValue)) ) {s = 51;}

                         
                        input.seek(index15_49);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA15_4 = input.LA(1);

                         
                        int index15_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_4>='\u0000' && LA15_4<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 19;

                         
                        input.seek(index15_4);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA15_34 = input.LA(1);

                         
                        int index15_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_34=='\"') && (((!isAttributeValue)||(isAttributeValue)))) {s = 32;}

                        else if ( (LA15_34=='\\') && (((!isAttributeValue)||(isAttributeValue)))) {s = 30;}

                        else if ( (LA15_34=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 31;}

                        else if ( (LA15_34=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 33;}

                        else if ( ((LA15_34>='\u0000' && LA15_34<='\t')||(LA15_34>='\u000B' && LA15_34<='\f')||(LA15_34>='\u000E' && LA15_34<='!')||(LA15_34>='#' && LA15_34<='[')||(LA15_34>=']' && LA15_34<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 34;}

                        else s = 8;

                         
                        input.seek(index15_34);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA15_66 = input.LA(1);

                         
                        int index15_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_66=='*') && (((!isAttributeValue)||(isAttributeValue)))) {s = 58;}

                        else if ( (LA15_66=='\r') && (((!isAttributeValue)||(isAttributeValue)))) {s = 59;}

                        else if ( (LA15_66=='\n') && (((!isAttributeValue)||(isAttributeValue)))) {s = 60;}

                        else if ( ((LA15_66>='\u0000' && LA15_66<='\t')||(LA15_66>='\u000B' && LA15_66<='\f')||(LA15_66>='\u000E' && LA15_66<=')')||(LA15_66>='+' && LA15_66<='\uFFFF')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 61;}

                        else s = 69;

                         
                        input.seek(index15_66);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_0==',') ) {s = 1;}

                        else if ( (LA15_0=='=') ) {s = 2;}

                        else if ( (LA15_0=='[') ) {s = 3;}

                        else if ( (LA15_0==']') ) {s = 4;}

                        else if ( (LA15_0=='^') ) {s = 5;}

                        else if ( (LA15_0=='\r') ) {s = 6;}

                        else if ( (LA15_0=='\n') ) {s = 7;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {s = 9;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 10;}

                        else if ( (LA15_0=='\"') ) {s = 11;}

                        else if ( (LA15_0=='\'') ) {s = 12;}

                        else if ( (LA15_0=='/') ) {s = 13;}

                        else if ( (LA15_0=='\t'||LA15_0==' ') ) {s = 14;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||(LA15_0>=':' && LA15_0<='<')||(LA15_0>='>' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 15;}

                        else s = 8;

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_1>='\u0000' && LA15_1<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 16;

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA15_35 = input.LA(1);

                         
                        int index15_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_35=='\"'||LA15_35=='\''||LA15_35=='\\'||LA15_35=='b'||LA15_35=='f'||LA15_35=='n'||LA15_35=='r'||(LA15_35>='t' && LA15_35<='u')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 57;}

                        else s = 8;

                         
                        input.seek(index15_35);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA15_27 = input.LA(1);

                         
                        int index15_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_27>='0' && LA15_27<='9')||(LA15_27>='A' && LA15_27<='Z')||LA15_27=='_'||(LA15_27>='a' && LA15_27<='z')) && (((!isAttributeValue)||(isAttributeValue)))) {s = 27;}

                        else if ( ((LA15_27>='\u0000' && LA15_27<='/')||(LA15_27>=':' && LA15_27<='@')||(LA15_27>='[' && LA15_27<='^')||LA15_27=='`'||(LA15_27>='{' && LA15_27<='\uFFFF')) && ((isAttributeValue))) {s = 8;}

                        else s = 49;

                         
                        input.seek(index15_27);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}