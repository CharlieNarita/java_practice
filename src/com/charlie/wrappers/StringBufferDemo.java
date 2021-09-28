package com.charlie.wrappers;

public class StringBufferDemo {
    public static void main(String[] args) {

        //default char[] capacity is 16
        StringBuffer stringBuffer = new StringBuffer();

        //designate capacity
        StringBuffer stringBuffer1 = new StringBuffer(32);

        //init with String
        /*
        public StringBuffer(String str) {
            super(str.length() + 16);
            append(str);
        }
         */
        StringBuffer original = new StringBuffer("original");

        //String to StringBuffer
        String str = "string";
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(str);
        System.out.println(stringBuffer2);

        //StringBuffer to String
        StringBuffer stringBuffer3 = new StringBuffer("StringBuffer");
        String s = stringBuffer3.toString();
        String s2 = new String(stringBuffer3);

        //splitByCommas method
        String price = "12345678.99";
        String res = splitByCommas(price);
        System.out.println(res);

    }

    public static String splitByCommas(String price) {
        StringBuffer sb = new StringBuffer(price);
        int index = sb.lastIndexOf(".") - 3;
        for(int i = index; i>0; i-=3) {
            sb = sb.insert(i, ',');
        }
        String res = sb.toString();
        return res;
    }
}
