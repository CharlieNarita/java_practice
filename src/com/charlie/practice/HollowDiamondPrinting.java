package com.charlie.practice;

public class HollowDiamondPrinting {
    public static void main(String[] args) {
        int totalLevel = 7;
        int row = totalLevel / 2 + 1;
        //up part;
        for (int i = 1; i <= row; i++) {
            //print " "
            for (int j = row - i; j > 0; j--) {
                System.out.print("  ");
            }
            //print "*"
            for (int j = 0; j < (2 * i - 1); j++) {
                if (j == 0 || j == 2 * i - 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //down part;
        for (int i = 1; i < row; i++) {
            //print " "
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            //print "*"
            for (int j = (row - i) * 2 - 1; j > 0; j--) {
                if (j == (row - i) * 2 - 1 || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
