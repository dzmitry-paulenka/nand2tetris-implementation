//pop $SEG$ $VAL$:

    @$VAL$
    D=A
    @$SEG$
    D=D+M //D = 6 + m[seg]
    @R13
    M=D   //r13 = 6 + m[seg]
    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @R13
    A=M   
    M=D   //m[seg + 6] = m[sp]
