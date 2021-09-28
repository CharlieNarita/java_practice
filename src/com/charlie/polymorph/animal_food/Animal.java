package com.charlie.polymorph.animal_food;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String eat(Food f) {
        return getName() + " eat " + f.getName();
    }

    public String cry() {
        return getName() + " animal cry...";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
