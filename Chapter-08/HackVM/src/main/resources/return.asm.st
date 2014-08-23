//return

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
