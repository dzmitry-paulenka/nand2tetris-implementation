//initialization sequence

        //init stack
    @261 // = 256 + 5
    D=A
    @SP
    M=D
        //call Sys.init
    @Sys.init
    0;JMP
        //ending infinite loop
($LOOP$)
    @$LOOP$
    0;JMP
