//eq, gt, lt

    @SP
    M=M-1
    A=M
    D=M   // == y
    A=A-1
    D=M-D //x-y

    @$HIT$
    D;$CMP$  // JEQ, JGT, JLT

    @$END$
    D=0;JMP 
($HIT$)
    D=-1
($END$)
    @SP
    A=M-1
    M=D