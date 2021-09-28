package com.charlie.practice;

public class ArraySelectSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        selectSort(arr);
//        selectSort2(arr);
        printArr(arr);
    }

    private static void selectSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void selectSort2(int[] arr) {
        int len = arr.length;
        int k;  //define a variate k store temporary min index
        for (int i = 0; i < len - 1; i++) {
            k = i;  //init the k point to i, assume i is min index
            for (int j = k + 1; j < len; j++) {    //j=k+1, means j is next index of elements after min
                if (arr[k] > arr[j]) {   //compare the k element and j element, if k element greater than j element
                    k = j;  //then make k point to j element, find current min element
                }
            }
            if (k != i) {
                swap(arr, i, k);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArr(int[] arr) {
        int len = arr.length;
        System.out.print("int[] arr = {");
        for (int i = 0; i < len; i++) {
            if (i != len - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "}");
            }
        }
    }
}
