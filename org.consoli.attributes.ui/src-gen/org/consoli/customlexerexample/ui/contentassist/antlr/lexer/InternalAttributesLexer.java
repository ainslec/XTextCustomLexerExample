package org.consoli.customlexerexample.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAttributesLexer extends Lexer {
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

    // delegates
    // delegators

    public InternalAttributesLexer() {;} 
    public InternalAttributesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAttributesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g"; }

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:19:11: ( ',' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:19:13: ','
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:21:11: ( '=' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:21:13: '='
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:23:11: ( '[' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:23:13: '['
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:25:11: ( ']' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:25:13: ']'
            {
            match(']'); 

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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:29:21: ( (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:29:23: (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:29:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:29:23: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:29:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:29:40: ( '\\r' )? '\\n'
                    {
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:29:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:29:40: '\\r'
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:31:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:31:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:31:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:31:11: '^'
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

            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:31:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:33:10: ( ( '0' .. '9' )+ )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:33:12: ( '0' .. '9' )+
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:33:12: ( '0' .. '9' )+
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
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:33:13: '0' .. '9'
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:35:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:37:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:37:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:37:24: ( options {greedy=false; } : . )*
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
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:37:52: .
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:39:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:39:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:39:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:39:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:39:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:39:41: ( '\\r' )? '\\n'
                    {
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:39:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:39:41: '\\r'
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:41:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:41:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:41:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:43:16: ( . )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:43:18: .
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
        // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:8: ( KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | RULE_PROPERTY_VALUE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=12;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:10: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 2 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:20: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 3 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:30: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 4 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:40: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 5 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:50: RULE_PROPERTY_VALUE
                {
                mRULE_PROPERTY_VALUE(); 

                }
                break;
            case 6 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:70: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:78: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:87: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:99: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:115: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:131: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/lexer/InternalAttributesLexer.g:1:139: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\10\1\20\1\21\1\22\1\23\1\10\1\25\1\10\1\uffff\6\10\5\uffff\1"+
        "\10\1\uffff\4\10\2\uffff\3\10\2\uffff\4\10\1\25\2\10\1\uffff\1\10"+
        "\1\uffff\4\10\3\uffff\1\10";
    static final String DFA15_eofS =
        "\63\uffff";
    static final String DFA15_minS =
        "\5\0\1\101\1\12\1\11\1\uffff\2\60\2\0\1\52\1\11\5\uffff\1\60\1"+
        "\uffff\1\11\2\60\1\42\1\0\1\uffff\2\0\1\42\1\0\1\uffff\4\0\1\12"+
        "\1\11\1\0\1\uffff\6\0\1\12\2\uffff\1\0";
    static final String DFA15_maxS =
        "\5\uffff\1\172\1\12\1\40\1\uffff\1\172\1\71\2\uffff\1\57\1\40\5"+
        "\uffff\1\172\1\uffff\1\40\1\172\1\71\1\165\1\uffff\1\uffff\2\uffff"+
        "\1\165\1\uffff\1\uffff\4\uffff\1\12\1\40\1\uffff\1\uffff\6\uffff"+
        "\1\12\2\uffff\1\uffff";
    static final String DFA15_acceptS =
        "\10\uffff\1\5\6\uffff\1\5\1\1\1\2\1\3\1\4\1\uffff\1\13\5\uffff"+
        "\1\5\4\uffff\1\5\7\uffff\1\10\7\uffff\1\5\1\11\1\uffff";
    static final String DFA15_specialS =
        "\1\26\1\5\1\20\1\13\1\15\6\uffff\1\6\1\25\15\uffff\1\4\1\uffff"+
        "\1\2\1\22\1\uffff\1\3\1\uffff\1\0\1\11\1\12\1\7\2\uffff\1\17\1\uffff"+
        "\1\14\1\10\1\1\1\21\1\16\1\24\3\uffff\1\23}>";
    static final String[] DFA15_transitionS = {
            "\11\17\1\16\1\7\2\17\1\6\22\17\1\16\1\17\1\13\4\17\1\14\4\17"+
            "\1\1\2\17\1\15\12\12\3\17\1\2\3\17\32\11\1\3\1\17\1\4\1\5\1"+
            "\11\1\17\32\11\uff85\17",
            "\0\10",
            "\0\10",
            "\0\10",
            "\0\10",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\26",
            "\2\25\2\uffff\1\25\22\uffff\1\25",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\30",
            "\12\35\1\34\2\35\1\32\24\35\1\33\71\35\1\31\uffa3\35",
            "\12\42\1\41\2\42\1\37\31\42\1\40\64\42\1\36\uffa3\42",
            "\1\43\4\uffff\1\44",
            "\1\46\1\26\2\uffff\1\45\22\uffff\1\46",
            "",
            "",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\2\25\2\uffff\1\25\22\uffff\1\25",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\30",
            "\1\47\4\uffff\1\47\64\uffff\1\47\5\uffff\1\47\3\uffff\1\47"+
            "\7\uffff\1\47\3\uffff\1\47\1\uffff\2\47",
            "\12\50\1\34\ufff5\50",
            "",
            "\0\50",
            "\12\35\1\34\2\35\1\32\24\35\1\33\71\35\1\31\uffa3\35",
            "\1\51\4\uffff\1\51\64\uffff\1\51\5\uffff\1\51\3\uffff\1\51"+
            "\7\uffff\1\51\3\uffff\1\51\1\uffff\2\51",
            "\12\50\1\41\ufff5\50",
            "",
            "\0\50",
            "\12\42\1\41\2\42\1\37\31\42\1\40\64\42\1\36\uffa3\42",
            "\12\55\1\53\2\55\1\52\34\55\1\54\uffd5\55",
            "\12\56\1\60\2\56\1\57\ufff2\56",
            "\1\26",
            "\1\46\1\26\2\uffff\1\45\22\uffff\1\46",
            "\12\35\1\34\2\35\1\32\24\35\1\33\71\35\1\31\uffa3\35",
            "",
            "\12\42\1\41\2\42\1\37\31\42\1\40\64\42\1\36\uffa3\42",
            "\12\61\1\53\ufff5\61",
            "\0\61",
            "\12\55\1\53\2\55\1\52\34\55\1\54\4\55\1\62\uffd0\55",
            "\12\55\1\53\2\55\1\52\34\55\1\54\uffd5\55",
            "\12\56\1\60\2\56\1\57\ufff2\56",
            "\1\60",
            "",
            "",
            "\12\55\1\53\2\55\1\52\34\55\1\54\uffd5\55"
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
                        int LA15_33 = input.LA(1);

                        s = -1;
                        if ( ((LA15_33>='\u0000' && LA15_33<='\uFFFF')) ) {s = 40;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_43 = input.LA(1);

                        s = -1;
                        if ( ((LA15_43>='\u0000' && LA15_43<='\uFFFF')) ) {s = 49;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_28 = input.LA(1);

                        s = -1;
                        if ( ((LA15_28>='\u0000' && LA15_28<='\uFFFF')) ) {s = 40;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_31 = input.LA(1);

                        s = -1;
                        if ( (LA15_31=='\n') ) {s = 33;}

                        else if ( ((LA15_31>='\u0000' && LA15_31<='\t')||(LA15_31>='\u000B' && LA15_31<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_26 = input.LA(1);

                        s = -1;
                        if ( (LA15_26=='\n') ) {s = 28;}

                        else if ( ((LA15_26>='\u0000' && LA15_26<='\t')||(LA15_26>='\u000B' && LA15_26<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_1 = input.LA(1);

                        s = -1;
                        if ( ((LA15_1>='\u0000' && LA15_1<='\uFFFF')) ) {s = 8;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_11 = input.LA(1);

                        s = -1;
                        if ( (LA15_11=='\\') ) {s = 25;}

                        else if ( (LA15_11=='\r') ) {s = 26;}

                        else if ( (LA15_11=='\"') ) {s = 27;}

                        else if ( (LA15_11=='\n') ) {s = 28;}

                        else if ( ((LA15_11>='\u0000' && LA15_11<='\t')||(LA15_11>='\u000B' && LA15_11<='\f')||(LA15_11>='\u000E' && LA15_11<='!')||(LA15_11>='#' && LA15_11<='[')||(LA15_11>=']' && LA15_11<='\uFFFF')) ) {s = 29;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_36 = input.LA(1);

                        s = -1;
                        if ( ((LA15_36>='\u0000' && LA15_36<='\t')||(LA15_36>='\u000B' && LA15_36<='\f')||(LA15_36>='\u000E' && LA15_36<='\uFFFF')) ) {s = 46;}

                        else if ( (LA15_36=='\r') ) {s = 47;}

                        else if ( (LA15_36=='\n') ) {s = 48;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_42 = input.LA(1);

                        s = -1;
                        if ( ((LA15_42>='\u0000' && LA15_42<='\t')||(LA15_42>='\u000B' && LA15_42<='\uFFFF')) ) {s = 49;}

                        else if ( (LA15_42=='\n') ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_34 = input.LA(1);

                        s = -1;
                        if ( (LA15_34=='\'') ) {s = 32;}

                        else if ( (LA15_34=='\\') ) {s = 30;}

                        else if ( (LA15_34=='\r') ) {s = 31;}

                        else if ( (LA15_34=='\n') ) {s = 33;}

                        else if ( ((LA15_34>='\u0000' && LA15_34<='\t')||(LA15_34>='\u000B' && LA15_34<='\f')||(LA15_34>='\u000E' && LA15_34<='&')||(LA15_34>='(' && LA15_34<='[')||(LA15_34>=']' && LA15_34<='\uFFFF')) ) {s = 34;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_35 = input.LA(1);

                        s = -1;
                        if ( (LA15_35=='\r') ) {s = 42;}

                        else if ( (LA15_35=='\n') ) {s = 43;}

                        else if ( (LA15_35=='*') ) {s = 44;}

                        else if ( ((LA15_35>='\u0000' && LA15_35<='\t')||(LA15_35>='\u000B' && LA15_35<='\f')||(LA15_35>='\u000E' && LA15_35<=')')||(LA15_35>='+' && LA15_35<='\uFFFF')) ) {s = 45;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_3 = input.LA(1);

                        s = -1;
                        if ( ((LA15_3>='\u0000' && LA15_3<='\uFFFF')) ) {s = 8;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_41 = input.LA(1);

                        s = -1;
                        if ( (LA15_41=='\'') ) {s = 32;}

                        else if ( (LA15_41=='\\') ) {s = 30;}

                        else if ( (LA15_41=='\r') ) {s = 31;}

                        else if ( (LA15_41=='\n') ) {s = 33;}

                        else if ( ((LA15_41>='\u0000' && LA15_41<='\t')||(LA15_41>='\u000B' && LA15_41<='\f')||(LA15_41>='\u000E' && LA15_41<='&')||(LA15_41>='(' && LA15_41<='[')||(LA15_41>=']' && LA15_41<='\uFFFF')) ) {s = 34;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA15_4 = input.LA(1);

                        s = -1;
                        if ( ((LA15_4>='\u0000' && LA15_4<='\uFFFF')) ) {s = 8;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA15_45 = input.LA(1);

                        s = -1;
                        if ( (LA15_45=='*') ) {s = 44;}

                        else if ( (LA15_45=='\r') ) {s = 42;}

                        else if ( (LA15_45=='\n') ) {s = 43;}

                        else if ( ((LA15_45>='\u0000' && LA15_45<='\t')||(LA15_45>='\u000B' && LA15_45<='\f')||(LA15_45>='\u000E' && LA15_45<=')')||(LA15_45>='+' && LA15_45<='\uFFFF')) ) {s = 45;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA15_39 = input.LA(1);

                        s = -1;
                        if ( (LA15_39=='\"') ) {s = 27;}

                        else if ( (LA15_39=='\\') ) {s = 25;}

                        else if ( (LA15_39=='\r') ) {s = 26;}

                        else if ( (LA15_39=='\n') ) {s = 28;}

                        else if ( ((LA15_39>='\u0000' && LA15_39<='\t')||(LA15_39>='\u000B' && LA15_39<='\f')||(LA15_39>='\u000E' && LA15_39<='!')||(LA15_39>='#' && LA15_39<='[')||(LA15_39>=']' && LA15_39<='\uFFFF')) ) {s = 29;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA15_2 = input.LA(1);

                        s = -1;
                        if ( ((LA15_2>='\u0000' && LA15_2<='\uFFFF')) ) {s = 8;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA15_44 = input.LA(1);

                        s = -1;
                        if ( (LA15_44=='/') ) {s = 50;}

                        else if ( (LA15_44=='*') ) {s = 44;}

                        else if ( (LA15_44=='\r') ) {s = 42;}

                        else if ( (LA15_44=='\n') ) {s = 43;}

                        else if ( ((LA15_44>='\u0000' && LA15_44<='\t')||(LA15_44>='\u000B' && LA15_44<='\f')||(LA15_44>='\u000E' && LA15_44<=')')||(LA15_44>='+' && LA15_44<='.')||(LA15_44>='0' && LA15_44<='\uFFFF')) ) {s = 45;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA15_29 = input.LA(1);

                        s = -1;
                        if ( (LA15_29=='\"') ) {s = 27;}

                        else if ( (LA15_29=='\\') ) {s = 25;}

                        else if ( (LA15_29=='\r') ) {s = 26;}

                        else if ( (LA15_29=='\n') ) {s = 28;}

                        else if ( ((LA15_29>='\u0000' && LA15_29<='\t')||(LA15_29>='\u000B' && LA15_29<='\f')||(LA15_29>='\u000E' && LA15_29<='!')||(LA15_29>='#' && LA15_29<='[')||(LA15_29>=']' && LA15_29<='\uFFFF')) ) {s = 29;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA15_50 = input.LA(1);

                        s = -1;
                        if ( (LA15_50=='*') ) {s = 44;}

                        else if ( (LA15_50=='\r') ) {s = 42;}

                        else if ( (LA15_50=='\n') ) {s = 43;}

                        else if ( ((LA15_50>='\u0000' && LA15_50<='\t')||(LA15_50>='\u000B' && LA15_50<='\f')||(LA15_50>='\u000E' && LA15_50<=')')||(LA15_50>='+' && LA15_50<='\uFFFF')) ) {s = 45;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA15_46 = input.LA(1);

                        s = -1;
                        if ( (LA15_46=='\r') ) {s = 47;}

                        else if ( (LA15_46=='\n') ) {s = 48;}

                        else if ( ((LA15_46>='\u0000' && LA15_46<='\t')||(LA15_46>='\u000B' && LA15_46<='\f')||(LA15_46>='\u000E' && LA15_46<='\uFFFF')) ) {s = 46;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA15_12 = input.LA(1);

                        s = -1;
                        if ( (LA15_12=='\\') ) {s = 30;}

                        else if ( (LA15_12=='\r') ) {s = 31;}

                        else if ( (LA15_12=='\'') ) {s = 32;}

                        else if ( (LA15_12=='\n') ) {s = 33;}

                        else if ( ((LA15_12>='\u0000' && LA15_12<='\t')||(LA15_12>='\u000B' && LA15_12<='\f')||(LA15_12>='\u000E' && LA15_12<='&')||(LA15_12>='(' && LA15_12<='[')||(LA15_12>=']' && LA15_12<='\uFFFF')) ) {s = 34;}

                        else s = 8;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA15_0 = input.LA(1);

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