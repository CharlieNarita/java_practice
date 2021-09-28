package com.charlie.practice;

public class ArrayRandomNum {
    public static void main(String[] args) {
        // requirement:
        // generate 10 random number (0, 100) into array
        // reverse array then find max number and its index
        int len = 10;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        //reverse arr
        for (int i = 0; i < len / 2; i++) {
            swap(arr, i, len - 1 - i);
        }
        printArr(arr);

        double sum = arr[0];
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < len; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            sum += arr[i];
        }
        double avg = sum / len;
        System.out.println("max value is arr[" + maxIndex + "] = " + arr[maxIndex]);
        System.out.println("avg value = " + avg);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArr(int[] arr) {
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
