lexer grammar StayLexer;

ASSIGN : '=' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
GT : '>' ;
LT : '<' ;
GE : '>=' ;
LE : '<=' ;
EQ : '==' ;
AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;
TRUE : 'true' ;
FALSE : 'false' ;

COMMA : ',' ;
DOT : '.' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;

INT_TYPE : 'int' ;
FLOAT_TYPE : 'float' ;
STRING_TYPE : 'str' ;

PRINT : 'print' ;
READ : 'read' ;
IF : 'if' ;
REPEAT : 'repeat' ;
TIMES : 'times' ;

INT : [0-9]+ ;
STRING : '"' ( ~('\\'|'"') )* '"' ;
FLOAT : [0-9]+ DOT [0-9]+ ;

ID: [a-zA-Z_][a-zA-Z_0-9]* ;
WS: [ \t\n\r\f]+ -> skip ;