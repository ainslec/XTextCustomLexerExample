// This file is generated and should not be modified.
// Source of file : D:\projects\public\XTextCustomLexerExample\org.consoli.attributes\src\org\consoli\customlexerexample\CustomAttributesLexer.g

lexer grammar CustomAttributesLexer;

@header {
package org.consoli.customlexerexample.lexer;
import org.eclipse.xtext.parser.antlr.Lexer;
}

@members{
  private boolean isArray = false;
  private boolean isAttributeValue = false;
}

KEYWORD_1 : {!isAttributeValue}?=> ',';
KEYWORD_2 : {!isAttributeValue}?=> '=' { if (!isArray) {isAttributeValue = true;} };
KEYWORD_3 : {!isAttributeValue}?=> '[';
KEYWORD_4 : {!isAttributeValue}?=> ']' { isArray = true; } ;

RULE_PROPERTY_VALUE : {isAttributeValue}?=> ~(('\n'|'\r'))* ('\r'? '\n')? {isAttributeValue = false;};
RULE_ID : {!isAttributeValue}?=> '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* { isArray = false; } ;
RULE_INT : {!isAttributeValue}?=> ('0'..'9')+;
RULE_STRING : {!isAttributeValue}?=> ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');
RULE_ML_COMMENT : {!isAttributeValue}?=> '/*' ( options {greedy=false;} : . )*'*/';
RULE_SL_COMMENT : {!isAttributeValue}?=> '//' ~(('\n'|'\r'))* ('\r'? '\n')?;
RULE_WS : {!isAttributeValue}?=> (' '|'\t'|'\r'|'\n')+;
RULE_ANY_OTHER : .;



