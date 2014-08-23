//push $SEG$ $VAL$:
    @$VAL$
    D=A
    @$SEG$
    A=D+M //A = val + seg
    D=M   //D = M[seg+val]
    @SP
    M=M+1
    A=M-1
    M=D
