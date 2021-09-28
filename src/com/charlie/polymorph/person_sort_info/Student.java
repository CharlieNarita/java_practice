package com.charlie.polymorph.person_sort_info;

class Student extends Person{
    private String stu_id;

    public Student(String name, char sex, int age) {
        super(name, sex, age);
    }

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "stu_id :" + stu_id;
    }

    @Override
    public String play() {
        return super.play() + "football";
    }

    public String study() {
        return getName() + " will study hard...";
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}
