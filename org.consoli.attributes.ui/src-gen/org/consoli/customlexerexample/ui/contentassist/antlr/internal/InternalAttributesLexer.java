package org.consoli.customlexerexample.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAttributesLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_PROPERTY_VALUE=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators

    public InternalAttributesLexer() {;} 
    public InternalAttributesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAttributesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:11:7: ( '[' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:11:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:12:7: ( ']' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:12:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:13:7: ( '=' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:14:7: ( ',' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "RULE_PROPERTY_VALUE"
    public final void mRULE_PROPERTY_VALUE() throws RecognitionException {
        try {
            int _type = RULE_PROPERTY_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:603:21: ( '=' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:603:23: '=' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('='); 
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:603:27: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:603:27: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:603:43: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:603:44: ( '\\r' )? '\\n'
                    {
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:603:44: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:603:44: '\\r'
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:605:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:605:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:605:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:605:11: '^'
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

            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:605:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:607:10: ( ( '0' .. '9' )+ )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:607:12: ( '0' .. '9' )+
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:607:12: ( '0' .. '9' )+
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
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:607:13: '0' .. '9'
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:609:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:611:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:611:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:611:24: ( options {greedy=false; } : . )*
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
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:611:52: .
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:613:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:613:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:613:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:613:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:613:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:613:41: ( '\\r' )? '\\n'
                    {
                    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:613:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:613:41: '\\r'
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:615:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:615:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:615:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:
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
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:617:16: ( . )
            // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:617:18: .
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
        // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:8: ( T__12 | T__13 | T__14 | T__15 | RULE_PROPERTY_VALUE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=12;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:34: RULE_PROPERTY_VALUE
                {
                mRULE_PROPERTY_VALUE(); 

                }
                break;
            case 6 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:54: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:62: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 8 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:71: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 9 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:83: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 10 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:99: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 11 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:115: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 12 :
                // ../org.consoli.attributes.ui/src-gen/org/consoli/customlexerexample/ui/contentassist/antlr/internal/InternalAttributes.g:1:123: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\3\uffff\1\17\1\uffff\1\14\2\uffff\3\14\15\uffff";
    static final String DFA15_eofS =
        "\30\uffff";
    static final String DFA15_minS =
        "\1\0\2\uffff\1\0\1\uffff\1\101\2\uffff\2\0\1\52\15\uffff";
    static final String DFA15_maxS =
        "\1\uffff\2\uffff\1\uffff\1\uffff\1\172\2\uffff\2\uffff\1\57\15"+
        "\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\uffff\1\6\1\7\3\uffff\1\13\1\14"+
        "\1\1\1\2\1\3\1\5\1\4\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA15_specialS =
        "\1\2\2\uffff\1\0\4\uffff\1\1\1\3\16\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\14\2\13\2\14\1\13\22\14\1\13\1\14\1\10\4\14\1\11\4\14\1"+
            "\4\2\14\1\12\12\7\3\14\1\3\3\14\32\6\1\1\1\14\1\2\1\5\1\6\1"+
            "\14\32\6\uff85\14",
            "",
            "",
            "\0\20",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | RULE_PROPERTY_VALUE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_3 = input.LA(1);

                        s = -1;
                        if ( ((LA15_3>='\u0000' && LA15_3<='\uFFFF')) ) {s = 16;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_8 = input.LA(1);

                        s = -1;
                        if ( ((LA15_8>='\u0000' && LA15_8<='\uFFFF')) ) {s = 20;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='[') ) {s = 1;}

                        else if ( (LA15_0==']') ) {s = 2;}

                        else if ( (LA15_0=='=') ) {s = 3;}

                        else if ( (LA15_0==',') ) {s = 4;}

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
                    case 3 : 
                        int LA15_9 = input.LA(1);

                        s = -1;
                        if ( ((LA15_9>='\u0000' && LA15_9<='\uFFFF')) ) {s = 20;}

                        else s = 12;

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