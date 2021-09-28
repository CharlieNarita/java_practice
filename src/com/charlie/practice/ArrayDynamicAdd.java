package com.charlie.practice;

import java.util.*;

public class ArrayDynamicAdd {
    public static void main(String[] args) {
        //build a scanner to receive user input data
        Scanner scanner = new Scanner(System.in);

        //do-while + break structure
        int[] arr = new int[]{1, 2, 3};
        do {
            int len = arr.length;
            int[] arrNew = new int[len + 1];
            for (int i = 0; i < len; i++) {
                arrNew[i] = arr[i];
            }
            //note user to add element
            System.out.print("please enter a integer number: ");
            int addNum = scanner.nextInt();
            arrNew[arrNew.length - 1] = addNum;
            arr = arrNew;

            System.out.println();

            //break condition
            System.out.print("do you want continue to add element(y/n): ");
            char c = scanner.next().charAt(0);
            System.out.println();
            if ('n' == c) {
                break;
            }
        } while (true);

        //print arr
        System.out.println("print the final arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
