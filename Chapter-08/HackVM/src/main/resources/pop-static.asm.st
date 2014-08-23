//pop static $VAR$:

    @SP
    M=M-1 //sp--
    A=M   //a=m[sp]
    D=M   //d=m[sp]
    @$VAR$
    M=D   
