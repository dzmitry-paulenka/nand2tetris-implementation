//push const 17:

    @17
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 17:

    @17
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

    @LABEL0
    D;JEQ  // JEQ, JGT, JLT

    @LABEL1
    D=0;JMP 
(LABEL0)
    D=-1
(LABEL1)
    @SP
    A=M-1
    M=D

//push const 17:

    @17
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 16:

    @16
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

    @LABEL2
    D;JEQ  // JEQ, JGT, JLT

    @LABEL3
    D=0;JMP 
(LABEL2)
    D=-1
(LABEL3)
    @SP
    A=M-1
    M=D

//push const 16:

    @16
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 17:

    @17
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

    @LABEL4
    D;JEQ  // JEQ, JGT, JLT

    @LABEL5
    D=0;JMP 
(LABEL4)
    D=-1
(LABEL5)
    @SP
    A=M-1
    M=D

//push const 892:

    @892
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 891:

    @891
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

    @LABEL6
    D;JLT  // JEQ, JGT, JLT

    @LABEL7
    D=0;JMP 
(LABEL6)
    D=-1
(LABEL7)
    @SP
    A=M-1
    M=D

//push const 891:

    @891
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 892:

    @892
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

    @LABEL8
    D;JLT  // JEQ, JGT, JLT

    @LABEL9
    D=0;JMP 
(LABEL8)
    D=-1
(LABEL9)
    @SP
    A=M-1
    M=D

//push const 891:

    @891
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 891:

    @891
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

    @LABEL10
    D;JLT  // JEQ, JGT, JLT

    @LABEL11
    D=0;JMP 
(LABEL10)
    D=-1
(LABEL11)
    @SP
    A=M-1
    M=D

//push const 32767:

    @32767
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 32766:

    @32766
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

    @LABEL12
    D;JGT  // JEQ, JGT, JLT

    @LABEL13
    D=0;JMP 
(LABEL12)
    D=-1
(LABEL13)
    @SP
    A=M-1
    M=D

//push const 32766:

    @32766
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 32767:

    @32767
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

    @LABEL14
    D;JGT  // JEQ, JGT, JLT

    @LABEL15
    D=0;JMP 
(LABEL14)
    D=-1
(LABEL15)
    @SP
    A=M-1
    M=D

//push const 32766:

    @32766
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 32766:

    @32766
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

    @LABEL16
    D;JGT  // JEQ, JGT, JLT

    @LABEL17
    D=0;JMP 
(LABEL16)
    D=-1
(LABEL17)
    @SP
    A=M-1
    M=D

//push const 57:

    @57
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 31:

    @31
    D=A
    @SP
    M=M+1 //m[sp]++
    A=M-1 //a=m[sp-1]
    M=D   //m[sp-1]=D
    

//push const 53:

    @53
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
    M=M+D  //-, & |

//push const 112:

    @112
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

// not / neg
    @SP
    A=M-1
    M=-M  //! or -

//&,|,+,-

    @SP
    M=M-1 //m[sp]--
    A=M
    D=M
    A=A-1
    M=M&D  //-, & |

//push const 82:

    @82
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
    M=M|D  //-, & |

// not / neg
    @SP
    A=M-1
    M=!M  //! or -

