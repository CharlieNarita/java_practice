package com.charlie.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericHashMap {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap = new HashMap<String,Student>();
        hashMap.put("A1",new Student("jack", 21));
        hashMap.put("C3",new Student("tom", 23));
        hashMap.put("B2",new Student("mike", 25));

        //entry
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        for(Map.Entry entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println();
        //iterator
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }

        System.out.println();
        //keySet
        Set<String> strings = hashMap.keySet();
        for (String key : strings) {
            System.out.println(key + "-" + hashMap.get(key));
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}