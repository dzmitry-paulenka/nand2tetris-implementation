//push const 3030:

    @3030
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//pop temp R3:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @R3
    M=D   

//push const 3040:

    @3040
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//pop temp R4:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @R4
    M=D   

//push const 32:

    @32
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//pop THIS 2:

    @2
    D=A
    @THIS
    D=D+M //D = 6 + m[seg]
    @R13
    M=D   //r13 = 6 + m[seg]
    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @R13
    A=M   
    M=D   //m[seg + 6] = m[sp]

//push const 46:

    @46
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//pop THAT 6:

    @6
    D=A
    @THAT
    D=D+M //D = 6 + m[seg]
    @R13
    M=D   //r13 = 6 + m[seg]
    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @R13
    A=M   
    M=D   //m[seg + 6] = m[sp]

//push static R3:

    @R3
    D=M
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D

//push static R4:

    @R4
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
    M=M+D  //-, & |

//push THIS 2:
    @2
    D=A
    @THIS
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

//push THAT 6:
    @6
    D=A
    @THAT
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

