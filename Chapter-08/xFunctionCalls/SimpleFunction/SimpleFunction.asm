//function SimpleFunction.test 2

(SimpleFunction.test)

    @2
    D=A

(GENERATED_INTERNAL_SYMBOL$$0)
    @SP
    M=M+1
    A=M-1
    M=0
    D=D-1

    @GENERATED_INTERNAL_SYMBOL$$1
    D;JEQ

    @GENERATED_INTERNAL_SYMBOL$$0
    0;JMP

(GENERATED_INTERNAL_SYMBOL$$1)

//push LCL 0:
    @0
    D=A
    @LCL
    A=D+M //A = val + seg
    D=M   //D = M[seg+val]
    @SP
    M=M+1
    A=M-1
    M=D

//push LCL 1:
    @1
    D=A
    @LCL
    A=D+M //A = val + seg
    D=M   //D = M[seg+val]
    @SP
    M=M+1
    A=M-1
    M=D

//&,|,+,-

    @SP
    M=M-1 //m[sp]--
    A=M
    D=M
    A=A-1
    M=M+D  //-, & |

// not / neg
    @SP
    A=M-1
    M=!M  //! or -

//push ARG 0:
    @0
    D=A
    @ARG
    A=D+M //A = val + seg
    D=M   //D = M[seg+val]
    @SP
    M=M+1
    A=M-1
    M=D

//&,|,+,-

    @SP
    M=M-1 //m[sp]--
    A=M
    D=M
    A=A-1
    M=M+D  //-, & |

//push ARG 1:
    @1
    D=A
    @ARG
    A=D+M //A = val + seg
    D=M   //D = M[seg+val]
    @SP
    M=M+1
    A=M-1
    M=D

//&,|,+,-

    @SP
    M=M-1 //m[sp]--
    A=M
    D=M
    A=A-1
    M=M-D  //-, & |

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

