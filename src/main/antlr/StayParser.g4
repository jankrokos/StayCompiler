parser grammar StayParser;
options { tokenVocab=StayLexer; }

program
    : block
    ;

block
    : stat*
    ;

stat
    : expr
    | printStat
    | readStat
    | ifStat
    | loopStat
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

ifStat: IF LPAREN boolValue RPAREN LCURLY blockif RCURLY ;

loopStat: REPEAT repetitions TIMES LCURLY block RCURLY ;

repetitions: INT;

blockif: block;

boolValue: ID EQ INT;

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
