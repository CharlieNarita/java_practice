package com.charlie.polymorph.anonymous_details;

public class AnonymousDetails {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
        System.out.println(outer);
    }
}

class Outer{
    private int i = 999;

    public void outerMethod() {
        //receive by parameter
        Person p = new Person() {
            @Override
            public void say() {
                System.out.println("Inner class say hi");
            }
        };
        System.out.println("p running type = " + p.getClass());
        p.say();

        //no parameter received
        new Person() {
            @Override
            public void say() {
                System.out.println("Inner class say welcome");
            }
        }.say();

        //no parameter received
        new Person() {
            @Override
            public void work(String str) {
                super.work(str);
            }
        }.work("building");

        //additional method in anonymous inner class
        new Person() {
            public void print(int num) {
                System.out.println(num);
            }
        }.print(i); //visit Outer i

        //same attribute
        new Person() {
            int i = 666;
            public void print() {
                System.out.println(i);
            }
        }.print();

        //
        Person p2 = new Person() {
            int i = 888;

            @Override
            public void say() {
                System.out.println(Outer.this.i);
            }
        };
        p2.say();
        System.out.println(Outer.this);
    }
}


class Person {
    public void say() {
        System.out.println("Person say hello");
    }

    public void work(String str) {
        System.out.println("do " + str);
    }
}