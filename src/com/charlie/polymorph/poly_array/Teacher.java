package com.charlie.polymorph.poly_array;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + "\tsalary: " + salary;
    }

    public String teach() {
        return getName() + " is teaching...";
    }
}
