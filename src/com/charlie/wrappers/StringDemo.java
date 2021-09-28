package com.charlie.wrappers;

public class StringDemo {
    public static void main(String[] args) {

        char[] c = {'J', 'a', 'v', 'a', 'J', 'V', 'M'};

        String s = "original";
        String s2 = new String("original");
        String s3 = new String(c);
        String s4 = new String(c, 4, 3);

        System.out.println(s3);
        System.out.println(s4);
        //---------------------------


        String a = "abc";
        String b = new String("abc");

        System.out.println(a == b); //false
        System.out.println(a.equals(b)); //true

        System.out.println(a == a.intern());    //true
        System.out.println(b == b.intern());    //false

        System.out.println(a == b.intern());    //true
        System.out.println(b == a.intern());    //false

        //----------------------------------

        String a1 = "hello";
        String b1 = "_world";

        //1.create a StringBuilder sb = new StringBuilder();
        //2.invoke sb.append("hello");
        //3.invoke sb.append("_world");
        //4.invoke sb.toString() --> return new String(value, 0, count);
        //finally, c1 point to a String object in heap,
        //String object has attribute value point "hello_world" in pool
        String c1 = a + b;  //String c1 = sb.toString();

    }
}
