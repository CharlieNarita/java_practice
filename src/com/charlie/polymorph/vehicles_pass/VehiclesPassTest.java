package com.charlie.polymorph.vehicles_pass;

public class VehiclesPassTest {
    public static void main(String[] args) {
        Person jack = new Person("jack", Factory.getHorse());

        jack.commonPass();

        jack.commute("river");
    }
}

interface Vehicles {
    void work();
}

class Car implements Vehicles {
    @Override
    public void work() {
        System.out.println("car running in land...");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("boat sailing in river...");
    }
}

class Factory {
    public static Car getHorse() {
        return new Car();
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void riverPass() {
        if (!(vehicles instanceof Boat)) {
            vehicles = Factory.getBoat();
        }
        System.out.print(name + " taking ");
        vehicles.work();
    }

    public void commonPass() {
        if (!(vehicles instanceof Car)) {
            vehicles = Factory.getHorse();
        }
        System.out.print(name + " driving ");
        vehicles.work();
    }

    public void commute(String path) {
        if ("river" == path) {
            riverPass();
        } else {
            commonPass();
        }
    }
}