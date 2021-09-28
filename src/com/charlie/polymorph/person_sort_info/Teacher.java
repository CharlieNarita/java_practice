package com.charlie.polymorph.person_sort_info;

class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age) {
        super(name, sex, age);
    }

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "work_age: " + work_age;
    }

    @Override
    public String play() {
        return super.play() + "chess";
    }

    public String teach() {
        return getName() + " will teach well...";
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
}
