package com.charlie.polymorph.account_billing;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MoneyChangeOOP {
    //define relate variable of menu
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //account details
    /*three options:
    1.store income and consume data into array;
    2.use object to store;
    3.use String to joint data;*/
    String details = "---------account details---------";

    //income record
    double money = 0;
    double balance = 0;
    Date date = null; //java.util.Data
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //consume record
    String note = "";   //consume description

    //display menu
    public void showMenu() {
        do {
            System.out.println("\n=========MoneyChangeSystem=========");
            System.out.println("\t\t1 Account Details");
            System.out.println("\t\t2 Income Record");
            System.out.println("\t\t3 Consume Record");
            System.out.println("\t\t4 Exit");

            System.out.print("Please select(1-4): ");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println("1 Account Details");
                    this.detail();
                    break;
                case "2":
                    System.out.println("2 Income Record");
                    this.income();
                    break;
                case "3":
                    System.out.println("3 Consume Record");
                    this.consume();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("choice wrong, please select again");
            }

        } while (loop);

        System.out.println("---MoneyChangeSystem has been exit---");
    }

    //detail title
    public void detail() {
        System.out.println(details);
    }

    //income details
    public void income() {
        System.out.print("income: ");
        money = scanner.nextDouble();
        //verify the money value scope
        if(money <= 0) {
            System.out.println("income must be greater zero");
            return; //exit method
        }
        //find correct money condition
        balance += money;
        //make info to details
        date = new Date();
        details += "\nincome record\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //consume details
    public void consume() {
        System.out.print("consume: ");
        money = scanner.nextDouble();
        //verify the money value scope
        if(money <= 0 || money > balance) {
            System.out.println("consume value should be from 0 to " + balance);
            return;
        }
        System.out.print("consume note: ");
        note = scanner.next();  //String note receive string description of consume
        balance -= money;
        date = new Date(); //get current date
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //exit
    public void exit() {
        String choice = "";
        while(true) {
            System.out.println("are you sure to exit? y/n");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if(choice.equals("y")) {
            loop = false;
            System.out.println("Exit Program");
        }
    }
}
