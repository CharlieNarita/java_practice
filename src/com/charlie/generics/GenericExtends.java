package com.charlie.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        ArrayList<Object> list1= new ArrayList<>();

        ArrayList<BB> list2= new ArrayList<>();
        ArrayList<CC> list3= new ArrayList<>();

        ArrayList<AA> list4= new ArrayList<>();
        ArrayList<BB> list5= new ArrayList<>();

        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        printCollection2(list2);
        printCollection2(list3);
        printCollection2(list4);

        printCollection3(list3);
        printCollection3(list4);
        printCollection3(list5);
    }

    public static void printCollection1(List<?> c) {
        for (Object o : c) {    //Object
            System.out.println(o);
        }
    }

    public static void printCollection2(List<? extends AA> c) {
        for (Object o : c) {    //class which extends AA
            System.out.println(o);
        }
    }

    public static void printCollection3(List<? super CC> c) {
        for (Object o : c) {    //class which super of CC
            System.out.println(o);
        }
    }
}

class AA {

}

class BB extends AA {

}

class CC extends BB {

}
