// call $FN$ $ACNT5$

        //save function address in R13
    @$FN$
    D=A
    @R13
    M=D
        //save args+5 in R14
    @$ACNT5$
    D=A
    @R14
    M=D
        //save ret-address in D
    @$RET$
    D=A
        //prepare the call
    @::Internals::callSeqence
    0;JMP
($RET$)
