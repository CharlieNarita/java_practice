package com.charlie.code_block;

public class CodeBlockDetail2 {
    public static void main(String[] args) {
        A a = new A();  //execute getNum() first, then a static block

        System.out.println();

        //attention the sequence
        B b = new B();
        /*
        b static code block
        b static getStr() called
        b normal getNum() called
        b normal code block
        b constructor called
        */


    }
}

class A {

    private static int abc = getNum();

    static {
        System.out.println("a static code block");
    }

    public static int getNum() {
        System.out.println("a static getNum() called");
        return 999;
    }

}

class B {

    public B() {
        System.out.println("b constructor called");
    }

    private int bbb = getNum();

    {
        System.out.println("b normal code block");
    }

    static {
        System.out.println("b static code block");
    }

    private static String str = getStr();

    public static String getStr() {
        System.out.println("b static getStr() called");
        return "b string";
    }

    public int getNum() {
        System.out.println("b normal getNum() called");
        return 666;
    }
}
