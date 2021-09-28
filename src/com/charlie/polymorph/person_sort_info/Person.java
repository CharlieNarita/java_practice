package com.charlie.polymorph.person_sort_info;

class Person {
    private String name;
    private char sex;
    private int age;

    @Override
    public String toString() {
        return name + " \t" + sex + " \t" + age;
    }

    public String play() {
        return name + " play ";
    }

    public String getInfo() {
        return "name: " + name + "\n" +
                "age: " + age + "\n" +
                "sex: " + sex + "\n";
    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
