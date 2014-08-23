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
(GENERATED_INTERNAL_SYMBOL$$0)
    @GENERATED_INTERNAL_SYMBOL$$0
    0;JMP

//function Main.fibonacci 0

(Main.fibonacci)

    @0
    D=A

(GENERATED_INTERNAL_SYMBOL$$1)
    @GENERATED_INTERNAL_SYMBOL$$2
    D;JEQ

    @SP
    M=M+1
    A=M-1
    M=0
    D=D-1

    @GENERATED_INTERNAL_SYMBOL$$1
    0;JMP

(GENERATED_INTERNAL_SYMBOL$$2)

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

//push const 2:

    @2
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//eq, gt, lt

    @SP
    M=M-1
    A=M
    D=M   // == y
    A=A-1
    D=M-D //x-y

    @GENERATED_INTERNAL_SYMBOL$$3
    D;JLT  // JEQ, JGT, JLT

    @GENERATED_INTERNAL_SYMBOL$$4
    D=0;JMP 
(GENERATED_INTERNAL_SYMBOL$$3)
    D=-1
(GENERATED_INTERNAL_SYMBOL$$4)
    @SP
    A=M-1
    M=D

//goto Main.fibonacci$IF_TRUE

    @SP
    M=M-1
    A=M
    D=M
    @Main.fibonacci$IF_TRUE
    D;JNE

//goto Main.fibonacci$IF_FALSE
    @Main.fibonacci$IF_FALSE
    0;JMP

//label Main.fibonacci$IF_TRUE

(Main.fibonacci$IF_TRUE)

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

//label Main.fibonacci$IF_FALSE

(Main.fibonacci$IF_FALSE)

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

//push const 2:

    @2
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//&,|,+,-

    @SP
    M=M-1 //m[sp]--
    A=M
    D=M
    A=A-1
    M=M-D  //-, & |

// call Main.fibonacci 6

        //push ret-addr
    @GENERATED_INTERNAL_SYMBOL$$5
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
    @6
    D=D-A
    @ARG
    M=D
        //LCL = SP
    @SP
    D=M
    @LCL
    M=D
        //goto Main.fibonacci
    @Main.fibonacci
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$5)

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

//push const 1:

    @1
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//&,|,+,-

    @SP
    M=M-1 //m[sp]--
    A=M
    D=M
    A=A-1
    M=M-D  //-, & |

// call Main.fibonacci 6

        //push ret-addr
    @GENERATED_INTERNAL_SYMBOL$$6
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
    @6
    D=D-A
    @ARG
    M=D
        //LCL = SP
    @SP
    D=M
    @LCL
    M=D
        //goto Main.fibonacci
    @Main.fibonacci
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$6)

//&,|,+,-

    @SP
    M=M-1 //m[sp]--
    A=M
    D=M
    A=A-1
    M=M+D  //-, & |

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

//function Sys.init 0

(Sys.init)

    @0
    D=A

(GENERATED_INTERNAL_SYMBOL$$7)
    @GENERATED_INTERNAL_SYMBOL$$8
    D;JEQ

    @SP
    M=M+1
    A=M-1
    M=0
    D=D-1

    @GENERATED_INTERNAL_SYMBOL$$7
    0;JMP

(GENERATED_INTERNAL_SYMBOL$$8)

//push const 7:

    @7
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

// call Main.fibonacci 6

        //push ret-addr
    @GENERATED_INTERNAL_SYMBOL$$9
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
    @6
    D=D-A
    @ARG
    M=D
        //LCL = SP
    @SP
    D=M
    @LCL
    M=D
        //goto Main.fibonacci
    @Main.fibonacci
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$9)

//label Sys.init$WHILE

(Sys.init$WHILE)

//goto Sys.init$WHILE
    @Sys.init$WHILE
    0;JMP

