package com.charlie.practice;

public class TrianglePrinting {
    public static void main(String[] args) {
        int row;
        int column;
        int spaceNum;
        int level = 10;
        for (row = 1; row <= level; row++) {
            for (spaceNum = level - row; spaceNum >= 0; spaceNum--) {
                System.out.print(" ");
            }
            for (column = 1; column <= 2 * row - 1; column++) {
                if (column == 1 || column == 2 * row - 1 || row == level) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        //other method
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 2 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
