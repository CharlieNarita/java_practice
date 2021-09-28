package com.charlie.practice;

public class ArrayInsertNum {
    public static void main(String[] args) {
        //requirement: insert a num 23 into arr and keep it still orderly
        int[] arr = {10, 12, 45, 90};
        int insertNum = 23;
        int posFlag = -1;   //make position flag as -1, for mark index
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] >= insertNum) {
                posFlag = i;
                break;
            }
            if (posFlag == -1) {
                posFlag = len;
            }
        }

        int[] arrNew = new int[len + 1];
        //here we use i and j represent two individual pointer for arr and arrNew
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i != posFlag) {
                arrNew[i] = arr[j];
                j++;    //while element copy action successful, j++
            } else {
                arrNew[i] = insertNum;
            }
        }

        arr = arrNew;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
