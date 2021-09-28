package com.charlie.practice;

public class RecursionDemo {
    public static void main(String[] args) {
        int i = 10;
        print(i);
        System.out.println("print method is over");
        System.out.println("------------------------");
        print2(i);
        System.out.println("print2 method is over");
        System.out.println("------------------------");

        //factorial
        int x = 5;
        int result = factorial(x);
        System.out.println("number " + x + " factorial = " + result);
        System.out.println("------------------------");

        int y = 8;
        int res = fibonacci(y);
        System.out.println("number " + y + " fibonacci = " + res);
        System.out.println("------------------------");
    }

    //Fibonacci
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //factorial
    public static int factorial(int n) {
        if (n <= 2) {
            return n;
        } else {
            return factorial(n - 1) * n;
        }
    }

    //this recursion type can instead of for loop to print numbers
    public static void print(int n) {
        if (n > 1) {
            print(n - 1);
        }
        System.out.println("n = " + n);
    }

    //attention here we use if-else, find difference
    public static void print2(int n) {
        if (n > 1) {
            print2(n - 1);
        } else {
            System.out.println("n = " + n);
        }
    }
}




