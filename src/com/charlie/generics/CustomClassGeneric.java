package com.charlie.generics;

public class CustomClassGeneric {
    public static void main(String[] args) {
        Tiger<Double, String, Integer> tiger = new Tiger<>("king",3.14,"cat", 12);
        Tiger tiger1 = new Tiger(); //default Object generic
    }
}

class Tiger<T,R,M> {
    String name;
    T t;
    R r;
    M m;
    T[] tArr;   //can not write T[] tArr = new T[x];

    public Tiger() {}

    public Tiger(String name, T t, R r, M m) {
        this.name = name;
        this.t = t;
        this.r = r;
        this.m = m;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
}
