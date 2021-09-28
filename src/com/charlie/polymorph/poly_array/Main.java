package com.charlie.polymorph.poly_array;

public class Main {
    public static void main(String[] args) {
        Person[] p = new Person[4];

        p[0] = new Teacher("Mary", 38, 6500);
        p[1] = new Teacher("Linda", 42, 7600);
        p[2] = new Student("tom", 21, 89);
        p[3] = new Student("ana", 23, 95);

        for (Person person : p) {
            System.out.println(person.say());
            if (person instanceof Teacher) {
                System.out.println(((Teacher) person).teach());
            } else if (person instanceof Student) {
                System.out.println(((Student) person).study());
            } else if (person instanceof Person){
                System.out.println("Person class instance");
            } else {
                System.out.println("please check class cast");
            }
        }

    }
}
