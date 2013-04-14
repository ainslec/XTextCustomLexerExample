package org.consoli.customlexerexample.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CustomAttributesLexer extends Lexer {
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


    // delegates
    // delegators

    public CustomAttributesLexer() {;} 
    public CustomAttributesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CustomAttributesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g"; }

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:18:11: ( ',' )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:18:13: ','
            {
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
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:20:11: ( '=' )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:20:13: '='
            {
            match('='); 

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
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:22:11: ( '[' )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:22:13: '['
            {
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
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:24:11: ( ']' )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:24:13: ']'
            {
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
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:28:21: ({...}? => '=' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:28:23: {...}? => '=' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            if ( !((!isArray)) ) {
                throw new FailedPredicateException(input, "RULE_PROPERTY_VALUE", "!isArray");
            }
            match('='); 
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:28:41: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:28:41: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:28:57: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:28:58: ( '\\r' )? '\\n'
                    {
                    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:28:58: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:28:58: '\\r'
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
    // $ANTLR end "RULE_PROPERTY_VALUE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:30:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:30:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:30:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:30:11: '^'
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

            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:30:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:
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
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:32:10: ( ( '0' .. '9' )+ )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:32:12: ( '0' .. '9' )+
            {
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:32:12: ( '0' .. '9' )+
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
            	    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:32:13: '0' .. '9'
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
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:34:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:36:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:36:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:36:24: ( options {greedy=false; } : . )*
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
            	    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:36:52: .
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
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:38:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:38:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:38:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:38:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:38:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:38:41: ( '\\r' )? '\\n'
                    {
                    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:38:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:38:41: '\\r'
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
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:40:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:40:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:40:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:
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
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:42:16: ( . )
            // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:42:18: .
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
        // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:8: ( KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | RULE_PROPERTY_VALUE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=12;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:10: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 2 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:20: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 3 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:30: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 4 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:40: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 5 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:50: RULE_PROPERTY_VALUE
                {
                mRULE_PROPERTY_VALUE(); 

                }
                break;
            case 6 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:70: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:78: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:87: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:99: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:115: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:131: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../org.consoli.attributes/src/org/consoli/customlexerexample/lexer/CustomAttributesLexer.g:1:139: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\2\uffff\1\17\2\uffff\1\14\2\uffff\3\14\15\uffff";
    static final String DFA15_eofS =
        "\30\uffff";
    static final String DFA15_minS =
        "\1\0\1\uffff\1\0\2\uffff\1\101\2\uffff\2\0\1\52\15\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\uffff\1\uffff\2\uffff\1\172\2\uffff\2\uffff\1\57\15"+
        "\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\uffff\1\6\1\7\3\uffff\1\13\1\14"+
        "\1\1\1\5\1\2\1\3\1\4\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA15_specialS =
        "\1\3\1\uffff\1\1\5\uffff\1\0\1\2\16\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\14\2\13\2\14\1\13\22\14\1\13\1\14\1\10\4\14\1\11\4\14\1"+
            "\1\2\14\1\12\12\7\3\14\1\2\3\14\32\6\1\3\1\14\1\4\1\5\1\6\1"+
            "\14\32\6\uff85\14",
            "",
            "\0\16",
            "",
            "",
            "\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "",
            "\0\24",
            "\0\24",
            "\1\25\4\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
                        int LA15_8 = input.LA(1);

                        s = -1;
                        if ( ((LA15_8>='\u0000' && LA15_8<='\uFFFF')) ) {s = 20;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA15_2>='\u0000' && LA15_2<='\uFFFF')) && ((!isArray))) {s = 14;}

                        else s = 15;

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_9 = input.LA(1);

                        s = -1;
                        if ( ((LA15_9>='\u0000' && LA15_9<='\uFFFF')) ) {s = 20;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0==',') ) {s = 1;}

                        else if ( (LA15_0=='=') ) {s = 2;}

                        else if ( (LA15_0=='[') ) {s = 3;}

                        else if ( (LA15_0==']') ) {s = 4;}

                        else if ( (LA15_0=='^') ) {s = 5;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {s = 6;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 7;}

                        else if ( (LA15_0=='\"') ) {s = 8;}

                        else if ( (LA15_0=='\'') ) {s = 9;}

                        else if ( (LA15_0=='/') ) {s = 10;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 11;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||(LA15_0>=':' && LA15_0<='<')||(LA15_0>='>' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 12;}

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