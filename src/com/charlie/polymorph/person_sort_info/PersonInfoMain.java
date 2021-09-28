package com.charlie.polymorph.person_sort_info;

import com.charlie.polymorph.person_sort_info.Person;
import com.charlie.polymorph.person_sort_info.Student;
import com.charlie.polymorph.person_sort_info.Teacher;

public class PersonInfoMain {
    public static void main(String[] args) {
        Person[] p = new Person[4];
        p[0] = new Teacher("mary", 'f', 42, 20);
        p[1] = new Student("jack", 'm', 18, "123456");
        p[2] = new Teacher("anna", 'f', 36, 5);
        p[3] = new Student("mike", 'm', 21, "5678432");

        showArr(p);
        sortArr(p);
        showArr(p);

        for (Person person : p) {
            callPersonMethod(person);
        }
    }

    public static void showArr(Person[] p) {
        for (Person person : p) {
            System.out.println(person);
        }
        System.out.println();
    }

    public static void sortArr(Person[] p) {
        int len = p.length;
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (p[j].getAge() < p[j + 1].getAge()) {
                    swap(p, j, j + 1);
                }
            }
        }
    }

    public static void swap(Person[] p, int a, int b) {
        Person temp = p[a];
        p[a] = p[b];
        p[b] = temp;
    }


    public static void callPersonMethod(Person p) {
        if (p == null || !(p instanceof Person)) {
            return;
        }
        if (p instanceof Teacher) {
            Teacher t = (Teacher) p;
            System.out.println("teacher information:");
            System.out.println(t.getInfo());
            System.out.println(t.teach());
            System.out.println(t.play());
            System.out.println();
        } else if (p instanceof Student) {
            Student s = (Student) p;
            System.out.println("student information:");
            System.out.println(s.getInfo());
            System.out.println(s.study());
            System.out.println(s.play());
            System.out.println();
        } else {
            System.out.println("class cast error");
        }
    }
}
