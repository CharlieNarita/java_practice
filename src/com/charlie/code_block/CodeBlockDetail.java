package com.charlie.code_block;

public class CodeBlockDetail {
    public static void main(String[] args) {
        //class loading situation

        //1.new instance of class
        System.out.println("-----new AA instance-----");
        AA aa = new AA();
        System.out.println();
        AA aa2 = new AA();

        System.out.println();

        //2.when new instance of subclass, super class also loaded
        System.out.println("-----new BB instance-----");
        BB bb = new BB();
        System.out.println();
        BB bb2 = new BB();

        System.out.println();




        //3.use static member variable
        System.out.println("------use static member----");
        System.out.println(Animal.dna);
        System.out.println();
        System.out.println(Animal.getDna());
        System.out.println();
        Animal a = new Animal();

        System.out.println();

        //4.use subclass static member
        System.out.println("---use subclass member---");
        System.out.println(Cat.getEyes());

        System.out.println();

        //5.sub use super static
        System.out.println("---sub use super static---");
        System.out.println(Cat.dna);
    }
}

class Animal {
    public static String dna = "animal dna";

    static {
        System.out.println("animal static code block");
    }

    {
        System.out.println("animal normal code block");
    }

    public static String getDna() {
        return dna;
    }

    public static void setDna(String dna) {
        Animal.dna = dna;
    }
}

class Cat extends Animal {
    public static int eyes = 2;

    static {
        System.out.println("cat static code block");
    }

    {
        System.out.println("cat normal code block");
    }

    public static int getEyes() {
        return eyes;
    }

    public static void setEyes(int eyes) {
        Cat.eyes = eyes;
    }
}


class AA {

    static {
        System.out.println("aa static code block");
    }

    //--------------------------------------------
    {
        System.out.println("aa normal code block");
    }
}

class BB extends AA {

    static {
        System.out.println("bb static code block");
    }

    //-------------------------------------------
    {
        System.out.println("bb normal code block");
    }
}
