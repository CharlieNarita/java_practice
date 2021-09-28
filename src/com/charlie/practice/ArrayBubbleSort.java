package com.charlie.practice;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        bubbleSort(arr);
        printArr(arr);
    }

    private static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = len - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void bubbleSort2(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void printArr(int[] arr) {
        int len = arr.length;
        System.out.print("int[] arr = {");
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                System.out.print(arr[i] + "}");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
