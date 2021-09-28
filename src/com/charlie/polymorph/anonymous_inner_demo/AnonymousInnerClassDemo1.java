package com.charlie.polymorph.anonymous_inner_demo;

/**
 * anonymous inner class demonstration
 */
public class AnonymousInnerClassDemo1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();    //"anonymous f()"
        outer.outerMethod2();
        outer.outerMethod3();
    }
}


interface IA {
    void f();
}

/**
 * anonTest compile type is IA
 * anonTest running type is the anonymous inner class in outerMethod()
 */
class Outer {
    public void outerMethod() {
        /*
            anonTest running type is:

            class XXX implements IA {
                @Override
                public void f() {
                    System.out.println("anonymous f()");
                }
            }

            XXX = Outer$1
            so the name is Outer class name + $1

            so actually in JDK there create an anonymous class Outer$1
            and build Outer$1 instance, then convey the address to anonTest
         */
        IA anonTest = new IA() {
            @Override
            public void f() {
                System.out.println("anonymous f()");
            }
        };
        System.out.println("anonTest running type = " + anonTest.getClass());
        anonTest.f();
    }

    public void outerMethod2() {

        /*
            so actually in JDK there create an anonymous class Outer$2
            and build Outer$2 instance, then convey the address to anonTest2
         */
        SuperA anonTest2 = new SuperA("anonTest") {
            @Override
            public void superMethod() {
                System.out.println(getName() + " method");
            }
        };

        System.out.println("anonTest running type = " + anonTest2.getClass());
        anonTest2.superMethod();
    }

    public void outerMethod3() {

        /*
            so actually in JDK there create an anonymous class Outer$3
            and build Outer$3 instance, then convey the address to animal
         */
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("animal eat food");
            }
        };
        System.out.println("animal running type = " + animal.getClass());
        animal.eat();
    }
}

abstract class Animal {
    abstract void eat();
}


class SuperA {
    private String name;

    public SuperA(String name) {
        this.name = name;
    }

    public void superMethod() {
        System.out.println("superA method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
