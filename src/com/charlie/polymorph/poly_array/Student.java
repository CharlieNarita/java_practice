package com.charlie.polymorph.poly_array;

public class Student extends Person{
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + "\tscore: " + score;
    }

    public String study() {
        return getName() + " is studying...";
    }
}
