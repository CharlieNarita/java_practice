package com.charlie.polymorph.static_inner_demo;

public class StaticInnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f();

        Outer.Inner inner = new Outer.Inner();
        inner.say();
        inner.say2();

        outer.getInstance().say();
        outer.getInstance().say2();

        new Outer.Inner().say();
        new Outer.Inner().say2();
    }
}

class Outer {
    private int i = 123;
    private static String name = "Outer";

    static class Inner {
        private String name = "Inner";
        public void say() {
            System.out.println("name = " + name);
        }

        public void say2() {
            System.out.println("name = " + Outer.name);
        }
    }

    public void f() {
        Inner inner = new Inner();
        inner.say();
        inner.say2();
    }

    public Inner getInstance() {
        return new Inner();
    }
}