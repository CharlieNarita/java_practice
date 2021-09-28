package com.charlie.polymorph.animal_food;

public class Test {
    public static void main(String[] args) {
        Master mike = new Master("Mike");

        Cat tom = new Cat("tom cat");
        Fish big_fish = new Fish("big fish");

        mike.feed(tom, big_fish);



        Animal bob = new Dog("bob dog");
        Food big_bone = new Bone("big bone");

        mike.feed(bob, big_bone);

        Animal polo = new Pig("polo");
        Food big_corn = new Corn("big corn");
        mike.play(polo);
        mike.feed(polo, big_corn);

    }
}
