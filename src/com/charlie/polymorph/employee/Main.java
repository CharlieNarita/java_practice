package com.charlie.polymorph.employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Manager("Mary", 8300, 10000);
        Employee e2 = new Worker("tom", 4500);

        showEmpAnnal(e);
        showEmpWork(e);

        showEmpAnnal(e2);
        showEmpWork(e2);
    }

    public static void showEmpAnnal(Employee e) {
        System.out.println(e.getName() + " annal is " + e.getAnnual());
    }

    public static void showEmpWork(Employee e) {
        if (e instanceof Manager) {
            System.out.println(((Manager) e).manage());
        } else if(e instanceof  Worker) {
            System.out.println(((Worker) e).work());
        } else {
            System.out.println("please check class cast");
        }
    }
}


