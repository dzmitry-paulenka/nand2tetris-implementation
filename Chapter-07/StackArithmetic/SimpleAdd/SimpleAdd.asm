//push const 7:

    @7
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
    

//add,or,&,|

    @SP
    M=M-1 //m[sp]--
    A=M
    D=M
    A=A-1
    M=D+M  //-, & |

