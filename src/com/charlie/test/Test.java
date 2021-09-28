package com.charlie.test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Cat> map = new HashMap<>();

        map.put("A1", new Cat("tom"));
        map.put("B2", new Cat("jack"));
        map.put("C3", new Cat("mike"));

        //enhance for
        Set<String> strings = map.keySet();
        for (String key : strings) {
            System.out.println(key + " " + map.get(key));
        }

        //iterator
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " " + map.get(key));
        }

        //EtySet
        Set<Map.Entry<String, Cat>> entries = map.entrySet();
        for (Map.Entry<String, Cat> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}





