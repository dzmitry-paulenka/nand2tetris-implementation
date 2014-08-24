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

//function Class1.set 0

(Class1.set)
    @GENERATED_INTERNAL_SYMBOL$$0
    D=A
    @R13
    M=D
    @0
    D=A

    @::Internals::InitFunction
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$0)

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

//pop static Class1.0:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @Class1.0
    M=D   

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

//pop static Class1.1:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @Class1.1
    M=D   

//push const 0:

    @0
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//return
    @::Internals::returnSeqence
    0;JMP

//function Class1.get 0

(Class1.get)
    @GENERATED_INTERNAL_SYMBOL$$1
    D=A
    @R13
    M=D
    @0
    D=A

    @::Internals::InitFunction
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$1)

//push static Class1.0:

    @Class1.0
    D=M
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D

//push static Class1.1:

    @Class1.1
    D=M
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

//return
    @::Internals::returnSeqence
    0;JMP

//function Class2.set 0

(Class2.set)
    @GENERATED_INTERNAL_SYMBOL$$2
    D=A
    @R13
    M=D
    @0
    D=A

    @::Internals::InitFunction
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

//pop static Class2.0:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @Class2.0
    M=D   

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

//pop static Class2.1:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @Class2.1
    M=D   

//push const 0:

    @0
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//return
    @::Internals::returnSeqence
    0;JMP

//function Class2.get 0

(Class2.get)
    @GENERATED_INTERNAL_SYMBOL$$3
    D=A
    @R13
    M=D
    @0
    D=A

    @::Internals::InitFunction
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$3)

//push static Class2.0:

    @Class2.0
    D=M
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D

//push static Class2.1:

    @Class2.1
    D=M
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

//return
    @::Internals::returnSeqence
    0;JMP

//function Sys.init 0

(Sys.init)
    @GENERATED_INTERNAL_SYMBOL$$4
    D=A
    @R13
    M=D
    @0
    D=A

    @::Internals::InitFunction
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$4)

//push const 6:

    @6
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 8:

    @8
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

// call Class1.set 7

        //save function address in R13
    @Class1.set
    D=A
    @R13
    M=D
        //save args+5 in R14
    @7
    D=A
    @R14
    M=D
        //save ret-address in D
    @GENERATED_INTERNAL_SYMBOL$$5
    D=A
        //prepare the call
    @::Internals::callSeqence
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$5)

//pop temp R5:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @R5
    M=D   

//push const 23:

    @23
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 15:

    @15
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

// call Class2.set 7

        //save function address in R13
    @Class2.set
    D=A
    @R13
    M=D
        //save args+5 in R14
    @7
    D=A
    @R14
    M=D
        //save ret-address in D
    @GENERATED_INTERNAL_SYMBOL$$6
    D=A
        //prepare the call
    @::Internals::callSeqence
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$6)

//pop temp R5:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @R5
    M=D   

// call Class1.get 5

        //save function address in R13
    @Class1.get
    D=A
    @R13
    M=D
        //save args+5 in R14
    @5
    D=A
    @R14
    M=D
        //save ret-address in D
    @GENERATED_INTERNAL_SYMBOL$$7
    D=A
        //prepare the call
    @::Internals::callSeqence
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$7)

// call Class2.get 5

        //save function address in R13
    @Class2.get
    D=A
    @R13
    M=D
        //save args+5 in R14
    @5
    D=A
    @R14
    M=D
        //save ret-address in D
    @GENERATED_INTERNAL_SYMBOL$$8
    D=A
        //prepare the call
    @::Internals::callSeqence
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$8)

//label Sys.init$WHILE

(Sys.init$WHILE)

//goto Sys.init$WHILE
    @Sys.init$WHILE
    0;JMP

