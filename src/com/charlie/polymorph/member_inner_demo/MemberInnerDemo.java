package com.charlie.polymorph.member_inner_demo;

public class MemberInnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f();

        //visit the Inner in other Outer
        Outer.Inner inner = outer.new Inner();
        inner.say();

        Outer.Inner inner1 = outer.getInstance();
        inner1.say();

        new Outer().new Inner().printName();

        new Outer().getInstance().printName2();
    }
}

class Outer {
    private int i = 888;
    public String name = "Outer";

    class Inner {
        private String name = "Inner";

        public void say() {
            System.out.println("i = " + i + ", name = " + name);
        }

        public void printName() {
            System.out.println(name);
        }

        public void printName2() {
            System.out.println(Outer.this.name);    //visit outer attribute
        }
    }

    public void f() {
        Inner inner = new Inner();
        inner.say();
    }

    public Inner getInstance() {
        return new Inner();
    }
}