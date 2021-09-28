package com.charlie.polymorph.animal_food;

public class Master {
    private String name;
    public Master(String name) {
        this.name = name;
    }

    public void feed(Animal a, Food f) {
        System.out.println(getName() + " feed " + a.eat(f));
    }

    public void play(Animal a) {
        System.out.println(getName() + " play with " + a.cry());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
