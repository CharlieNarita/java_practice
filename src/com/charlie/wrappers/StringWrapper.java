package com.charlie.wrappers;

public class StringWrapper {
    public static void main(String[] args) {
        Integer i = 100;
        //num to string
        String str = i + "";
        String str1 = i.toString();
        String str2 = String.valueOf(i);

        //string to num
        String s = "123";
        Integer integer = Integer.parseInt(s);
        System.out.println(integer);
        System.out.println(integer.toString());
        System.out.println(integer.intValue());


        String s2 = new String("123");
        int i2 = Integer.parseInt(s2);
        System.out.println(i2);

        Integer i3 = new Integer(s2);
        System.out.println(i3);
    }
}
