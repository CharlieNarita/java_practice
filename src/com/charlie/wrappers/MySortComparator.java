package com.charlie.wrappers;

import java.util.Comparator;

public class MySortComparator {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("AK-47", 100);
        books[1] = new Book("M16-A3", 90);
        books[2] = new Book("Computer", 50);
        books[3] = new Book("Java", 130);
        books[4] = new Book("C++", 300);


        System.out.println("---sort by price---");
        bubbleSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                return  b1.getPrice() - b2.getPrice();
            }
        });

        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println();

        System.out.println("---sort by name length---");
        bubbleSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                return  b1.getName().length() - b2.getName().length();
            }
        });

        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static void bubbleSort(Book[] books, Comparator c) {
        int len = books.length;
        for(int i=len-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(c.compare(books[j], books[j+1]) > 0) {
                    swap(books, j, j+1);
                }
            }
        }
    }

    public static void swap(Book[] books, int a, int b) {
        Book temp = books[a];
        books[a] = books[b];
        books[b] = temp;
    }
}

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
