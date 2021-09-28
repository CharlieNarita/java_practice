package com.charlie.practice;

public class ArrayDemo {
    public static void main(String[] args) {
        //alpha beta table
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A' + i);
        }
        //output alpha beta table
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }

        System.out.println();
        System.out.println("--------------------------------------------");

        //find max value
        int[] a = new int[]{3, 2, 8, 3, 4, 7, 6, 5};
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("max value a[" + maxIndex + "] = " + a[maxIndex]);

        System.out.println("--------------------------------------------");

        //array assign
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 9;
        System.out.println("arrSrc[0] = " + arr1[0]);  //arrSrc[0] == arrDest = 8;

        System.out.println("--------------------------------------------");

        //array copy
        int[] arrSrc = new int[]{10, 20, 30};
        int[] arrDest = new int[arrSrc.length];
        for (int index = 0; index < arrSrc.length; index++) {
            arrDest[index] = arrSrc[index];
        }
        //output copied array arrDest
        for (int i = 0; i < arrDest.length; i++) {
            System.out.println("arrDest[" + i + "] = " + arrDest[i]);
        }

        System.out.println("--------------------------------------------");

        //array reverse
        int[] arr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        int temp = 0;
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        //output reversed arr
        System.out.print("arr = {");
        for (int i = 0; i < len; i++) {
            if (i != len - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "}");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------------");

        //array reverse 2
        int[] a1 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int length = a1.length;
        int[] a2 = new int[length];
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            a2[j] = a1[i];
        }
        a1 = a2;    //point a1 reference to a2
        //print a1
        for (int i = 0; i < length; i++) {
            System.out.print(a1[i] + "\t");
        }

        System.out.println();
        System.out.println("--------------------------------------------");

        //array add
        int[] add = new int[]{1, 2, 3};
        int[] addNew = new int[add.length + 1];
        for (int i = 0; i < add.length; i++) {
            addNew[i] = add[i]; //copy old content
        }
        //add new element
        addNew[addNew.length - 1] = 4;
        add = addNew;   //new reference
        for (int i = 0; i < add.length; i++) {
            System.out.print(add[i] + "\t");
        }


    }
}
