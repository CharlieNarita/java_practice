package com.charlie.wrappers;

public class WrapperDemo {
    public static void main(String[] args) {

        //attention, temary operator is entirely term;
        //below code is like Object obj = (true?....);
        Object obj = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj);    //output 1.0

        //if-else
        Object obj2;
        if(true)
            obj2 = new Integer(1);
        else
            obj2 = new Double(2.0);
        System.out.println(obj2);

    }
}
