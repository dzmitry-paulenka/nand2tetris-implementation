//push const 10:

    @10
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//pop LCL 0:

    @0
    D=A
    @LCL
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

//push const 21:

    @21
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 22:

    @22
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//pop ARG 2:

    @2
    D=A
    @ARG
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

//pop ARG 1:

    @1
    D=A
    @ARG
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

//push const 36:

    @36
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//pop THIS 6:

    @6
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

//push const 42:

    @42
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 45:

    @45
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//pop THAT 5:

    @5
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

//pop THAT 2:

    @2
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

//push const 510:

    @510
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//pop temp R11:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @R11
    M=D   

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

//push THAT 5:
    @5
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

//push THIS 6:
    @6
    D=A
    @THIS
    A=D+M //A = val + seg
    D=M   //D = M[seg+val]
    @SP
    M=M+1
    A=M-1
    M=D

//push THIS 6:
    @6
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
    M=M+D  //-, & |

//&,|,+,-

    @SP
    M=M-1 //m[sp]--
    A=M
    D=M
    A=A-1
    M=M-D  //-, & |

//push static R11:

    @R11
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

