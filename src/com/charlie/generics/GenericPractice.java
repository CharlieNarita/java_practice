package com.charlie.generics;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericPractice {
    public static void main(String[] args) {
        Employee<MyDate> jack = new Employee<>("jack", 5500, new MyDate(5, 6, 1993));
        Employee<MyDate> tom = new Employee<>("tom", 7500, new MyDate(9, 10, 1995));
        Employee<MyDate> mike = new Employee<>("mike", 6500, new MyDate(11, 8, 1994));
        Employee<MyDate> john = new Employee<>("bob", 5500, new MyDate(9, 7, 1996));
        Employee<MyDate> mary = new Employee<>("mary", 6500, new MyDate(4, 16, 1999));
        Employee<MyDate> alice = new Employee<>("alice", 6800, new MyDate(5, 8, 1998));
        Employee<MyDate> lucy = new Employee<>("lucy", 7600, new MyDate(11, 7, 1997));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(tom);
        employees.add(mike);
        employees.add(john);
        employees.add(mary);
        employees.add(alice);
        employees.add(lucy);


        sortEmployees(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    public static void sortEmployees(ArrayList<Employee> employees) {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    throw new RuntimeException("wrong type parameters");
                }
                int result = emp1.getName().compareTo(emp2.getName());
                if (result == 0) {
                    result = emp1.getBirthday().compareTo(emp2.getBirthday());
                }
                return result;
            }
        });
    }

}

class Employee<T> {
    private String name;
    private double salary;
    private MyDate birthday;

    public Employee(String name, double salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return name + ", " + salary + ", " + birthday;
    }
}

class MyDate implements Comparable<MyDate> {
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public int compareTo(MyDate otherDate) {
        int result = 0;
        int yearMinus = year - otherDate.getYear();
        int monthMinus = month - otherDate.getMonth();
        int dayMinus = day - otherDate.getDay();

        if (yearMinus != 0) {
            result = yearMinus;
        } else if (monthMinus != 0) {
            result = monthMinus;
        } else if (dayMinus != 0) {
            result = dayMinus;
        }
        return result;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return month + "-" + day + "-" + year;
    }

}
