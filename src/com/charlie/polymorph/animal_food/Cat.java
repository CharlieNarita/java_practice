package com.charlie.polymorph.animal_food;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String cry() {
        return getName() + " mi~mi~mi~...";
    }
}
