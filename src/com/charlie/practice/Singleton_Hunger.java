package com.charlie.practice;

public class Singleton_Hunger {
    public static void main(String[] args) {
        Sample01 s = Sample01.getInstance();
        Sample01 s2 = Sample01.getInstance();
        System.out.println(s == s2);
        System.out.println(s.equals(s2));

        System.out.println(s);
        System.out.println(s2);
    }
}

class Sample01 {
    private String name;

    private static Sample01 single = new Sample01("Hello");

    private Sample01(String name) {
        this.name = name;
    }

    public static Sample01 getInstance() {
        return single;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


