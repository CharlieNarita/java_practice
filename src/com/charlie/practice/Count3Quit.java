package com.charlie.practice;

public class Count3Quit {
    public static void main(String[] args) {
        int total = 1000;
        boolean[] arr = new boolean[total];
        int len = arr.length;
        //init tha boolean array, make all elements as true
        for (int i = 0; i < len; i++) {
            arr[i] = true;
        }

        //action counting 3
        int remain = len;  //init remain as len means all survive;
        int countNum = 0;   //
        int index = 0;
        while (remain > 1) {
            if (arr[index] == true) {
                countNum++;

                //this condition reset countNum as 0 and make corresponding element as false;
                if (countNum == 3) {
                    countNum = 0;
                    arr[index] = false;
                    remain--;
                }
            }

            index++;    //whatever elements equals true or not;

            if (index == len) {
                index = 0;
            }
        }

        for (int i = 0; i < len; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
    }
}
