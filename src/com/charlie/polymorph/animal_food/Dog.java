package com.charlie.polymorph.animal_food;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String cry() {
        return getName() + " bark!bark!bark!...";
    }
}
