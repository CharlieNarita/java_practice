package com.charlie.generics;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

interface IUsb3 extends IUsb<String, Double> {

}

class Computer implements IUsb3 {
    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void sayHi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

class Server implements IUsb<Integer, Float> {
    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void sayHi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}


interface IUsb<U, R> {
    R get(U u);

    void sayHi(R r);

    void run(R r1, R r2, U u1, U u2);

    default R method(U u) {
        return null;
    }
}