grammar Expr;

/* =========================
   REGRAS SINTÁTICAS (Parser)
   ========================= */

expr
    : orExpr
    ;

orExpr
    : andExpr (OR andExpr)*
    ;

andExpr
    : notExpr (AND notExpr)*
    ;

notExpr
    : NOT notExpr
    | atom
    ;

atom
    : relation
    | LPAREN expr RPAREN
    ;

relation
    : INT relOp INT
    ;

relOp
    : GT
    | LT
    | GE
    | LE
    | EQ
    | NE
    ;

/* =========================
   REGRAS LÉXICAS (Lexer)
   ========================= */

AND : 'and';
OR  : 'or';
NOT : 'not';

GT : '>';
LT : '<';
GE : '>=';
LE : '<=';
EQ : '==';
NE : '!=';

LPAREN : '(';
RPAREN : ')';

INT : [0-9]+;

WS : [ \t\r\n]+ -> skip;
