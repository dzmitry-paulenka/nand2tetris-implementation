//function $FN$ $LCNT$

($FN$)

    @$LCNT$
    D=A

($LOOP$)
    @$END$
    D;JEQ

    @SP
    M=M+1
    A=M-1
    M=0
    D=D-1

    @$LOOP$
    0;JMP

($END$)
