package com.charlie.practice;

import java.util.Random;
import java.util.Scanner;

public class MoraGuess {
    public static void main(String[] args) {
        Tom t = new Tom();
        int isWinCount = 0;

        int[][] arr1 = new int[3][3];
        int j = 0;

        String[] arr2 = new String[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("plz enter your num(0-fist, 1-scissors, 2-cloth) : ");
            int num = scanner.nextInt();
            t.setTomGuessNum(num);
            int tomGuess = t.getTomGuessNum();
            arr1[i][j + 1] = tomGuess;

            int comGuess = t.computerGuessNum();
            arr1[i][j + 2] = comGuess;

            String isWin = t.vsComputer();
            arr2[i] = isWin;
            arr1[i][j] = t.count;

            System.out.println("----------------------");
            System.out.println("turn\ttom\tcomputer\tresult");
            System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess + "\t\t" + isWin);
            System.out.println("----------------------");
            System.out.println("\n\n");
            isWinCount = t.winCount(isWin);
        }

        System.out.println("turn\ttom\tcomputer\tresult");
        for (int a = 0; a < arr1.length; a++) {
            for (int b = 0; b < arr1[a].length; b++) {
                System.out.print(arr1[a][b] + "\t\t\t");
            }
            System.out.print(arr2[a]);
            System.out.println();
        }
        System.out.println("tom win " + isWinCount + " times");
    }
}

class Tom {
    int tomGuessNum;
    int comGuessNum;
    int winCountNum;
    int count = 1;

    public void showInfo() {

    }

    public int computerGuessNum() {
        Random r = new Random();
        comGuessNum = r.nextInt(3); //return 0-2 random number
        return comGuessNum;
    }

    public void setTomGuessNum(int tomGuessNum) {
        if (tomGuessNum > 2 || tomGuessNum < 0) {
            throw new IllegalArgumentException("input wrong number");
        }
        this.tomGuessNum = tomGuessNum;
    }

    public int getTomGuessNum() {
        return tomGuessNum;
    }

    public String vsComputer() {
        if (tomGuessNum == 0 && comGuessNum == 1) {
            return "tom win";
        } else if (tomGuessNum == 1 && comGuessNum == 2) {
            return "tom win";
        } else if (tomGuessNum == 2 && comGuessNum == 0) {
            return "tom win";
        } else if (tomGuessNum == comGuessNum) {
            return "tie";
        } else {
            return "computer win";
        }
    }

    public int winCount(String s) {
        count++;
        if (s.equals("tom win")) {
            winCountNum++;
        }
        return winCountNum;
    }
}