parser grammar StayParser;
options { tokenVocab=StayLexer; }

program
    : stat*
    ;

stat
    : expr
    | printStat
    | readStat
    ;

expr
    : assignment
    ;

assignment
    : intAssignment
    | floatAssignment
    | stringAssignment
    ;

printStat: PRINT LPAREN printValue RPAREN SEMI ;

readStat: READ LPAREN ID RPAREN SEMI ;

intAssignment: INT_TYPE ID ASSIGN intValue SEMI ;

floatAssignment: FLOAT_TYPE ID ASSIGN FLOAT SEMI ;

stringAssignment: STRING_TYPE ID ASSIGN STRING SEMI ;

printValue
    : INT
    | STRING
    | ID
    ;

intValue
    : INT
    | ID
    | arithmeticOp
    ;

arithmeticOp
    : (INT | ID) (ADD | SUB | MUL | DIV) (INT | ID)
    ;
