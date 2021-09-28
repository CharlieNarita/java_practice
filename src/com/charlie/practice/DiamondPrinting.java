package com.charlie.practice;

public class DiamondPrinting {
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
                System.out.print("* ");
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
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        //other method
        //up part
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 2 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //down part
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= 4 - 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        //
    }
}
