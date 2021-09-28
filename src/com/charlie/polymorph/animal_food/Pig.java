package com.charlie.polymorph.animal_food;

public class Pig extends Animal{
    public Pig(String name) {
        super(name);
    }

    @Override
    public String cry() {
        return getName() + " oin~oin~oin~...";
    }
}
