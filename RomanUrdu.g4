grammar RomanUrdu;

program: statement* EOF;

statement
    : varDecl ';'
    | printStmt ';'
    | ifStmt
    | whileStmt
    | forStmt
    ;

varDecl: 'mutakyer' ID '=' expr;
printStmt: 'dikha' expr;
ifStmt: 'agar' expr 'phir' block ('warna' block)?;
whileStmt: 'jabtak' expr 'phir' block;
forStmt: 'ke' 'liye' ID '=' expr 'se' expr 'phir' block;

block: '{' statement* '}';

expr
    : INT
    | STRING
    | ID
    | expr '+' expr
    | expr '-' expr
    | expr '*' expr
    | expr '/' expr
    | expr '>' expr
    | expr '<' expr
    | expr '==' expr
    | expr '!=' expr
    | expr '>=' expr
    | expr '<=' expr
    | '(' expr ')'
    ;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
STRING: '"' ~["\r\n]* '"';
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;
