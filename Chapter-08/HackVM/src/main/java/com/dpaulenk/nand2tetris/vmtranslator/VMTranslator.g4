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
            | functional
            ;

binary : 'add' | 'sub' | 'and' | 'or';
compare : 'eq' | 'gt' | 'lt';
unary : 'neg' | 'not';

memory : stackConst
       | stackStatic
       | stackRegs
       | stackSegs
       ;

stackConst : 'push' 'constant' NUMBER;

stackStatic : stackOp 'static' NUMBER;

stackRegs : stackOp regSegment NUMBER;

regSegment : 'temp' | 'pointer' ;

stackSegs : stackOp segment NUMBER;

segment : 'argument' | 'local' | 'this' | 'that';

stackOp : 'push' | 'pop';

flow : ( 'label' | 'goto' | 'if-goto') SYMBOL;

functional : function
           | call
           | xreturn
           ;

function : 'function' SYMBOL NUMBER;

call : 'call' SYMBOL NUMBER;

xreturn : 'return';

NEWLINE     : [\r\n]+;
SYMBOL      : [a-zA-Z_\.\$\:][a-zA-Z0-9_\.\$\:]*;
NUMBER      : [0-9]+;
COMMENTS    :	('//' .*? NEWLINE);
WS          : [ \t]+ -> skip;
