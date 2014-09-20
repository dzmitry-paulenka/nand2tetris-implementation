grammar Compiler;

clazz : 'class' className
        '{' classVarDec* subroutineDec* '}';

classVarDec : scopeType type varList ';';

varList : varName (',' varName)*;

scopeType : 'static' | 'field';

type : 'int' | 'char' | 'boolean' | className;

subroutineDec : subroutineKind returnType subroutineName '(' parameterList ')' subroutineBody;

subroutineKind : 'constructor' | 'function' | 'method';
returnType : 'void' | type;

parameterList : (typedVar (',' typedVar)*)?;

typedVar : type varName;

subroutineBody : '{' varDec* statements '}';

varDec : 'var' type varList ';';

className : ID;

subroutineName : ID;

varName : ID;

statements : statement*;

statement : letStatement
          | ifStatement
          | whileStatement
          | doStatement
          | returnStatement
          ;

letStatement : 'let' varName arrayIndexing? '=' expression ';';
arrayIndexing : '[' expression ']';

ifStatement : 'if' '(' expression ')'
              '{' statements '}'
              elseClause?
            ;

elseClause : 'else' '{' statements '}';

whileStatement : 'while' '(' expression ')'
                 '{' statements '}'
               ;

doStatement : 'do' subroutineCall ';';

returnStatement : 'return' expression? ';' ;

expression : term (op term)*;

term : number
     | string
     | keywordConstant
     | varExpr
     | arrayExpr
     | subroutineCall
     | '(' expression ')'
     | unaryExpr
     ;

number : INTEGER;
string : STRING;

varExpr : varName;

unaryExpr : unaryOp term;

arrayExpr : varName '[' expression ']';

subroutineCall : (qualifier '.')? subroutineName '(' expressionList ')';

qualifier : className | varName;

expressionList : (expression (',' expression)* )?;

op : '+' | '-' | '*' | '/' | '&' | '|' | '<' | '>' | '=';

unaryOp : '-' | '~';

keywordConstant : 'true' | 'false' | 'null' | 'this';

STRING : '"' STRING_CHAR* '"';
fragment STRING_CHAR :   ~["\\] | ESCAPED_CHAR ;
fragment ESCAPED_CHAR : '\\' [btnfr"'\\];

INTEGER      : [0-9]+;
ID           : [a-zA-Z_][a-zA-Z0-9_]*;
WS           :  [ \t\r\n\u000C]+ -> skip;
COMMENT      :   '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
