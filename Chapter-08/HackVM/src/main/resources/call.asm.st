// call $FN$ $ACNT5$

        //push ret-addr
    @$RET$
    D=A
    @SP
    M=M+1
    A=M-1
    M=D
        //push LCL
    @LCL
    D=M
    @SP
    M=M+1
    A=M-1
    M=D
        //push ARG
    @ARG
    D=M
    @SP
    M=M+1
    A=M-1
    M=D
        //push THIS
    @THIS
    D=M
    @SP
    M=M+1
    A=M-1
    M=D
        //push THAT
    @THAT
    D=M
    @SP
    M=M+1
    A=M-1
    M=D
        //reposition ARG = SP - args - 5
    @SP
    D=M
    @$ACNT5$
    D=D-A
    @ARG
    M=D
        //LCL = SP
    @SP
    D=M
    @LCL
    M=D
        //goto $FN$
    @$FN$
    0;JMP
($RET$)
