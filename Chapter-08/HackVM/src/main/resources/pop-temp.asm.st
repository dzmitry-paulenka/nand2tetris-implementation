//pop temp $REG$:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @$REG$
    M=D   
