package com.charlie.wrappers;

public class IntegerWrapper {
    public static void main(String[] args) {

        /*public static Integer valueOf(int i) {
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.Inte gerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }*/
        //attention, (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
        //This method will always cache values in the range -128 to 127
        //this condition will conduct new integer object or not


        //two different objects
        Integer i = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i == i2);   //false

        //two references point same constant value
        Integer m = 1;  //Integer.valueOf(1);
        Integer n = 1;  //Integer.valueOf(1);
        System.out.println(m == n);     //true

        //cache values in the range -128 to 127 (actually a byte range)
        Integer x = 128;    //exceed the max range of cache value 127
        Integer y = 128;    //so new Integer(128);
        System.out.println(x == y); //false

        Integer a = 128;
        int b = 128;
        System.out.println(a == b);
    }
}
