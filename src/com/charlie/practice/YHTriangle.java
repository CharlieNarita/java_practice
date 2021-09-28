package com.charlie.practice;

public class YHTriangle {
    public static void main(String[] args) {
        int level = 10;
        int[][] yh = new int[level][];
        for (int i = 0; i < level; i++) {
            yh[i] = new int[i + 1];
            for (int j = 0; j < yh[i].length; j++) {
                if (j == 0 || j == yh[i].length - 1) {
                    yh[i][j] = 1;
                } else {
                    yh[i][j] = yh[i - 1][j] + yh[i - 1][j - 1];
                }
            }
        }
        printBinArr(yh);
    }

    public static void printBinArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
