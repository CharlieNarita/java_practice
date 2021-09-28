package com.charlie.practice;

import com.sun.javaws.IconUtil;

public class Singleton_Lazy {
    public static void main(String[] args) {
        Cat cat = Cat.getInstance();
        Cat cat2 = Cat.getInstance();

        System.out.println(cat == cat2);
        System.out.println(cat.equals(cat2));
    }
}

class Cat {
    private String name;

    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if(cat == null) {
            cat = new Cat("mimi");
        }
        return cat;
    }
}
