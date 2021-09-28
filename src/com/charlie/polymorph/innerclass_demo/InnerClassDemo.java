package com.charlie.polymorph.innerclass_demo;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f();
    }
}

class Outer {
    private int i = 100;

    public Outer() {
        System.out.println("Outer empty constructor");
    }

    public Outer(int i) {
        this.i = i;
        System.out.println("Outer constructor with parameter");
    }

    //f() method contain inner class
    public void f() {
        System.out.println("Outer f()");

        final int i = 666;

        //local inner class
        class InnerLocal {
            private int i = 555;
            public void innerLocalMethod() {
                System.out.println("innerLocalMethod");
                System.out.println("f() i = " + i);
                System.out.println("Outer i = " + Outer.this.i);
                System.out.println("InnerLocal i = " + InnerLocal.this.i);
                f2();
            }
        }

        class InnerLocal2 extends InnerLocal {
            public void innerLocal2Method() {
                System.out.println("innerLocal2Method");
            }
        }

        InnerLocal innerLocal = new InnerLocal();
        innerLocal.innerLocalMethod();

        InnerLocal2 innerLocal2 = new InnerLocal2();
        innerLocal2.innerLocal2Method();
    }

    public void f2() {
        System.out.println("Outer f2()");
    }

    //Outer code block
    {
        System.out.println("Outer code block");
    }

    class InnerMember {
        private int j = 99;

        public InnerMember() {
            System.out.println("InnerMember empty constructor");
        }

        public InnerMember(int j) {
            this.j = j;
            System.out.println("InnerMember constructor");
        }

        private void innerMemberMethod() {
            System.out.println("innerMemberMethod");
        }

        {
            System.out.println("Inner code block");
        }
    }
}
