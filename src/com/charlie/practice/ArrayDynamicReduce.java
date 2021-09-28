package com.charlie.practice;

import java.util.*;

public class ArrayDynamicReduce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        do {
            if (arr.length == 1) {
                System.out.println("the arr has only one element, can not reduce!");
                break;
            }
            System.out.println();
            System.out.print("do you want to reduce the arr(y/n): ");
            char c = scanner.next().charAt(0);
            if ('n' == c) {
                break;
            }
            System.out.println();
            int len = arr.length;
            int[] arrNew = new int[len - 1];
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
            }
            int r = arr[len - 1];
            System.out.println("the number arr[" + (len - 1) + "] = " + r + " has been removed");
            arr = arrNew;

        } while (true);

        System.out.println("---------------------------");
        //print final arr
        System.out.print("final arr = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
