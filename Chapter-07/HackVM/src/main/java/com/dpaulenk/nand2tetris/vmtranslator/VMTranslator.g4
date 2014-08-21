// Define a grammar called Hello
grammar VMTranslator;

program : (instruction? newLineOrComments)*
          instruction? EOF;

newLineOrComments : COMMENTS | NEWLINE;

instruction : memory
            | binary
            | unary
            | compare
            | flow
            | function
            ;

binary : 'add' | 'sub' | 'and' | 'or';
compare : 'eq' | 'gt' | 'lt';
unary : 'neg' | 'not';

memory : stackOp segment NUMBER;

stackOp : 'push' | 'pop';

segment : 'argument' | 'local' | 'static' | 'constant' | 'this' | 'that' | 'pointer' | 'temp';

flow : ( 'label' | 'goto' | 'if-goto') SYMBOL;

function : ('function' | 'call') SYMBOL NUMBER | 'return';

NEWLINE     : [\r\n]+;
SYMBOL      : [a-zA-Z_\.\$\:][a-zA-Z0-9_\.\$\:]*;
NUMBER      : [0-9]+;
COMMENTS    :	('//' .*? NEWLINE);
WS          : [ \t]+ -> skip;
