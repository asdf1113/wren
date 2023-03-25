grammar wren;

prog: PROGRAM IDENTIFIER IS block;

block: declaration_seq BEGIN command_seq END;

//declaration_seq: ε | declaration declaration_seq;
declaration_seq: declaration*;
declaration: VAR variable_list COLON type SEMI;
type: INTEGER | BOOLEAN;
variable_list: variable | variable COMMA variable_list;

command_seq: command | command SEMI command_seq;

command : variable ASSIGN expr
        |SKIP_
        | READ variable | WRITE integer_expr
        | WHILE boolean_expr DO command_seq END WHILE
        | IF boolean_expr THEN thencommand END IF
        | IF boolean_expr THEN thencommand ELSE elsecommand END IF
        ;

thencommand: command_seq;
elsecommand: command_seq;

expr : integer_expr | boolean_expr;

////integer_expr: term | integer_expr weak_op term;
//integer_expr: term (weak_op term)*;
//
////term : element | term strong_op element;
//term : element (strong_op element)*;

integer_expr: integer_expr strong_op integer_expr
             | integer_expr weak_op integer_expr
             | element;

element : NURMAL  |  variable  | LPAREN integer_expr RPAREN | SUB element;

////boolean_expr : boolean_term | boolean_expr OR boolean_term;
//boolean_expr : boolean_term (OR boolean_term)*;
//
////boolean_term : boolean_element| boolean_term AND boolean_element;
//boolean_term : boolean_element (AND boolean_element)*;

boolean_expr: boolean_expr AND boolean_expr
            | boolean_expr OR boolean_expr
            | boolean_element;


boolean_element :  TRUE | FALSE | variable | comparison
| NOT LPAREN boolean_expr RPAREN | LPAREN boolean_expr RPAREN;

comparison : integer_expr relation integer_expr;


weak_op: ADD | SUB;
strong_op: MUL | DIV;
variable : IDENTIFIER;
relation: LE | LT | EQUAL | GT |GE | NE;
//numeral: Digit numeral*;
//numeral: '0' | [1-9][1-9]*;

PROGRAM: 'program';
IS: 'is';
BEGIN: 'begin';
END : 'end';
VAR: 'var';
INTEGER: 'integer';
BOOLEAN: 'boolean';
READ: 'read';
WRITE: 'write';
SKIP_:'skip';
WHILE:'while';
DO:'do';
IF:'if';
THEN:'then';
ELSE:'else';
AND:'and';
OR:'or';
TRUE:'true';
FALSE: 'false';
NOT: 'not';

ASSIGN: ':=';
COLON: ':' ;
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
SEMI: ';';

LE: '<=';
LT: '<';
EQUAL: '=';
GT: '>';
GE:'>=';
NE:'<>';

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';

NURMAL: '0' | [1-9][0-9]*;
IDENTIFIER: Letter LetterOrDigit*;
fragment LetterOrDigit: Letter | [0-9];

fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment Letter:
	[a-z]
	;

WS: [ \t\r\n\u000C]+ -> skip;


