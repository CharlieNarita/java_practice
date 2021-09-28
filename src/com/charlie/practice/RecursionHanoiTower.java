package com.charlie.practice;
//specification:
// there are all 3 tower A,B,C, move plate from A to C
// rule is smaller plate must up on bigger one
// just move one plate everytime

public class RecursionHanoiTower {
    public static void main(String[] args) {
        int plateNum = 3;
        HanoiTower ht = new HanoiTower();
        ht.move(plateNum, ht.a, ht.b, ht.c);
    }
}

class HanoiTower {
    char a = 'A';
    char b = 'B';
    char c = 'C';

    //a,b,c means move all plate from  a to c through b
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println("move No." + num + " plate from " + a + " -> " + c);
        } else {
            move(num - 1, a, c, b);
            System.out.println("move No." + num + " plate from " + a + " -> " + c);
            move(num - 1, b, a, c);
        }
    }
}
