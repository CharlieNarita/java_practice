package com.charlie.code_block;

public class CodeBlockDetail3 {
    public static void main(String[] args) {

//        AAA aaa = new AAA();

        System.out.println();

        BBB bbb = new BBB();

    }
}

class AAA {

    static {
        System.out.println("AAA static code block");
    }

    {
        System.out.println("AAA normal code block");
    }

    public AAA() {
        //super();
        //AAA static code block
        //AAA normal code block
        System.out.println("AAA() constructor called");
    }
}

class BBB extends AAA {

    static {
        System.out.println("BBB static code block");
    }

    {
        System.out.println("BBB normal code block");
    }

    public BBB() {
        //super();
        //BBB static code block
        //BBB normal code block
        System.out.println("BBB() constructor called");
    }
}
