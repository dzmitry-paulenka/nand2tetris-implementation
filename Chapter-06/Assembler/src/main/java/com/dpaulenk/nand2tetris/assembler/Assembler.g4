// Define a grammar called Hello
grammar Assembler;

program : (labelWithInstruction? newLineOrComments)*
          labelWithInstruction? EOF;

newLineOrComments : COMMENTS | NEWLINE;

labelWithInstruction : (label newLineOrComments)* instruction;

label : '(' SYMBOL ')';

instruction : ainstr | cinstr;

ainstr : '@' (address | SYMBOL );

address : '0' | '1' | NUMBER;

cinstr : (dest '=')? comp (';' jump)?;

dest : 'M'
     | 'D'
     | 'MD'
     | 'A'
     | 'AM'
     | 'AD'
     | 'AMD'
     ;

jump : 'JGT'
     | 'JEQ'
     | 'JGE'
     | 'JLT'
     | 'JNE'
     | 'JLE'
     | 'JMP'
     ;

comp : consts
     | binary
     | unary
     ;

consts : '0' | '1' | '-' '1';

unary : ('-' | '!')? ('A' | 'D' | 'M');

binary : ('A' | 'M' | 'D') ('+' | '-') '1'
       | 'D' ('+' | '-' | '&' | '|' ) ('A' | 'M')
       | ('A' | 'M') '-' 'D'
       ;

NEWLINE     : [\r\n]+;
SYMBOL      : [a-zA-Z_\.\$\:][a-zA-Z0-9_\.\$\:]*;
NUMBER      : [0-9]+;
COMMENTS    :	('//' .*? NEWLINE);
WS          : [ \t]+ -> skip;
