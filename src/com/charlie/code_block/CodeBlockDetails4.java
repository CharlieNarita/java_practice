package com.charlie.code_block;

public class CodeBlockDetails4 {
    public static void main(String[] args) {
        B2 b2 = new B2();
    }
}

class A1 {
    private static int n1 = getVal01();

    static {
        System.out.println("A1 static code block"); //2
    }

    {
        System.out.println("A1 normal code block"); //5
    }
    public int n2 = getVal02();

    public static int getVal01() {
        System.out.println("A1 static getVal01()"); //1
        return 1;
    }

    public int getVal02() {
        System.out.println("A1 normal getVal02()"); //6
        return 2;
    }

    public A1() {
        //super()
        //A1 normal
        System.out.println("A1 constructor");   //7
    }
}

class B2 extends A1 {
    private static int n3 = getVal03();

    static {
        System.out.println("B2 static code block"); //4
    }

    public int n4 = getVal04();

    {
        System.out.println("B2 normal code block"); //9
    }

    public static int getVal03() {
        System.out.println("B2 static getVal03()"); //3
        return 3;
    }

    public int getVal04() {
        System.out.println("B2 normal getVal04()"); //8
        return 4;
    }

    public B2() {
        //super()
        //b2 normal
        System.out.println("B2 constructor");   //10
    }
}