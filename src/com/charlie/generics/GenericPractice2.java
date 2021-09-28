package com.charlie.generics;

import org.junit.jupiter.api.Test;

import java.util.*;

public class GenericPractice2 {
    public static void main(String[] args) {


    }

    @Test
    public void testDao() {
        User jack = new User(113, 23, "jack");
        User tom = new User(556, 24, "tom");
        User bob = new User(762, 26, "bob");
        User mary = new User(109, 26, "mary");
        User alice = new User(314, 26, "alice");

        Map<String, User> map = new HashMap<>();
        DAO<User> userDAO = new DAO<>(map);
        userDAO.save("A1", jack);
        userDAO.save("A2", tom);
        userDAO.save("A3", bob);

        System.out.println(userDAO.getMap());

        userDAO.save("B1",mary);

        System.out.println(userDAO.getMap());

        userDAO.update("A1",alice);

        System.out.println(userDAO.getMap());

        List<User> list = userDAO.list();
        System.out.println(list);
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        for (Map.Entry<String, T> entry : entries){
            list.add(entry.getValue());
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

    public Map<String, T> getMap() {
        return map;
    }
}

class User {
    private int id, age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name: " + name + ", age=" + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            throw new RuntimeException("wrong type cast");
        }
        User u = (User) obj;
        return name.equals(u.getName()) && id == u.getId() && age == u.getAge();
    }

}
