//push const 111:

    @111
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 333:

    @333
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 888:

    @888
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//pop static StaticTest.8:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @StaticTest.8
    M=D   

//pop static StaticTest.3:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @StaticTest.3
    M=D   

//pop static StaticTest.1:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @StaticTest.1
    M=D   

//push static StaticTest.3:

    @StaticTest.3
    D=M
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D

//push static StaticTest.1:

    @StaticTest.1
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

//push static StaticTest.8:

    @StaticTest.8
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

