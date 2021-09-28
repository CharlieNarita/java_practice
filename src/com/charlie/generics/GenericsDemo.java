package com.charlie.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        GenericTest<String> testString = new GenericTest<String>("testName");
        GenericTest<Integer> testNumber = new GenericTest<Integer>(666);

        String f = testString.getS();  //return String
        Integer f1 = testNumber.getS();    //return Integer

        System.out.println(f);
        System.out.println(f1);

        testString.showClass();     //class java.lang.String
        testNumber.showClass();     //class java.lang.Integer
    }
}

class GenericTest<E>{
    private E attribute;

    public GenericTest(E s) {
        this.attribute = s;
    }

    public E getS() {
        return attribute;
    }

    public void showClass() {
        System.out.println(attribute.getClass());
    }
}
