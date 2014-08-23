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

//function Class1.set 0

(Class1.set)

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

//function Class1.get 0

(Class1.get)

    @0
    D=A

(GENERATED_INTERNAL_SYMBOL$$3)
    @GENERATED_INTERNAL_SYMBOL$$4
    D;JEQ

    @SP
    M=M+1
    A=M-1
    M=0
    D=D-1

    @GENERATED_INTERNAL_SYMBOL$$3
    0;JMP

(GENERATED_INTERNAL_SYMBOL$$4)

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

//function Class2.set 0

(Class2.set)

    @0
    D=A

(GENERATED_INTERNAL_SYMBOL$$5)
    @GENERATED_INTERNAL_SYMBOL$$6
    D;JEQ

    @SP
    M=M+1
    A=M-1
    M=0
    D=D-1

    @GENERATED_INTERNAL_SYMBOL$$5
    0;JMP

(GENERATED_INTERNAL_SYMBOL$$6)

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

//function Class2.get 0

(Class2.get)

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

(GENERATED_INTERNAL_SYMBOL$$9)
    @GENERATED_INTERNAL_SYMBOL$$10
    D;JEQ

    @SP
    M=M+1
    A=M-1
    M=0
    D=D-1

    @GENERATED_INTERNAL_SYMBOL$$9
    0;JMP

(GENERATED_INTERNAL_SYMBOL$$10)

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

        //push ret-addr
    @GENERATED_INTERNAL_SYMBOL$$11
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
    @7
    D=D-A
    @ARG
    M=D
        //LCL = SP
    @SP
    D=M
    @LCL
    M=D
        //goto Class1.set
    @Class1.set
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$11)

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

        //push ret-addr
    @GENERATED_INTERNAL_SYMBOL$$12
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
    @7
    D=D-A
    @ARG
    M=D
        //LCL = SP
    @SP
    D=M
    @LCL
    M=D
        //goto Class2.set
    @Class2.set
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$12)

//pop temp R5:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @R5
    M=D   

// call Class1.get 5

        //push ret-addr
    @GENERATED_INTERNAL_SYMBOL$$13
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
    @5
    D=D-A
    @ARG
    M=D
        //LCL = SP
    @SP
    D=M
    @LCL
    M=D
        //goto Class1.get
    @Class1.get
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$13)

// call Class2.get 5

        //push ret-addr
    @GENERATED_INTERNAL_SYMBOL$$14
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
    @5
    D=D-A
    @ARG
    M=D
        //LCL = SP
    @SP
    D=M
    @LCL
    M=D
        //goto Class2.get
    @Class2.get
    0;JMP
(GENERATED_INTERNAL_SYMBOL$$14)

//label Sys.init$WHILE

(Sys.init$WHILE)

//goto Sys.init$WHILE
    @Sys.init$WHILE
    0;JMP

