//push static $REG$:

    @$REG$
    D=M
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
