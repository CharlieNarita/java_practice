package com.charlie.practice;

public class RecursionMonkey {
    public static void main(String[] args) {
        //question:
        /*Monkey eat peach: there are some peaches;
        every day, monkey eat half of them + 1;
        until tenth day, only one peach left;
        so, how many peaches in begin?*/

        int day = 1;
        int amount = peaches(day);
        if (amount != -1) {
            System.out.println("day " + day + " has " + amount + " peaches");
        }
    }

    public static int peaches(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peaches(day + 1) + 1) * 2;
        } else {
            System.out.println("wrong day, plz try again");
            return -1;
        }
    }
}
