package com.charlie.polymorph.interface_feature;

public class InterfaceFeature {
    public static void main(String[] args) {
        K k = new K();
        k.f();
        k.f2();
        MyInterface.f3();
    }
}

interface MyInterface {
    //member attribute
    //public int n = 10;

    //abstract method
    void f();

    default void f2() {
        System.out.println("MyInterface default f2()");
    }

    static void f3() {
        System.out.println("MyInterface default f3()");
    }
}

class K implements MyInterface {
    public void f() {
        System.out.println("K f() from interface abstract");
    }
}
