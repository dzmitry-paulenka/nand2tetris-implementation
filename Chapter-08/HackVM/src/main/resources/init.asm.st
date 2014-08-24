//initialization section
        //init stack
    @261 // = 256 + 5
    D=A
    @SP
    M=D
        //call Sys.init
    @Sys.init
    0;JMP
        //ending infinite loop
(::Internals::endingLoop)
    @::Internals::endingLoop
    0;JMP


(::Internals::callSeqence)
// return address is in R13,
// argcount+5 is in R14 and
// function address is in D
        //push ret-addr
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
    @R14
    D=D-M
    @ARG
    M=D
        //LCL = SP
    @SP
    D=M
    @LCL
    M=D
        //goto function, which address is in R14
    @R13
    A=M
    0;JMP


(::Internals::returnSeqence)
        //save ret-addr to R13
    @5
    D=A
    @LCL
    A=M-D
    D=M
    @R13
    M=D
        //save ret value to M[ARG]
    @SP
    A=M-1
    D=M
    @ARG
    A=M
    M=D
        //move stack top
    @ARG
    D=M
    @SP
    M=D+1
        //restore THAT
    @LCL
    AM=M-1
    D=M

    @THAT
    M=D
        //restore THIS
    @LCL
    AM=M-1
    D=M
    @THIS
    M=D
        //restore ARG
    @LCL
    AM=M-1
    D=M
    @ARG
    M=D
        //restore LCL
    @LCL
    AM=M-1
    D=M
    @LCL
    M=D
        //jmp to ret-addr
    @R13
    A=M
    0;JMP


(::Internals::InitFunction)
//start function address is in R13
//localCount is in D

    (::Internals::InitFunction.LOOP)
        @::Internals::InitFunction.END
        D;JEQ

        @SP
        M=M+1
        A=M-1
        M=0
        D=D-1

        @::Internals::InitFunction.LOOP
        0;JMP
    (::Internals::InitFunction.END)
        @R13
        A=M
        0;JMP
