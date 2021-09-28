package com.charlie.generics;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fix("fix wheel", 4);

        Truck truck = new Truck();
        truck.carry(5.56, car);

        truck.hello("hello", 666, 7.62f);
    }
}

class Car {
    public void run() {

    }

    public <T, E> void  fix(T t, E r) {
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }

}

class Truck<T, E> {
    public void run() {

    }

    public <R, M> void carry(R r, M m) {
        System.out.println(r.getClass());
        System.out.println(m.getClass());
    }

    public <K> void hello(T t, E e, K k) {
        System.out.println(t.getClass());
        System.out.println(e.getClass());
        System.out.println(k.getClass());
    }

    //public void f(W w) {}         //the parameter must be T or E type
}