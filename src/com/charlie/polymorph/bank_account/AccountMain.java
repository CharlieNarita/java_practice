package com.charlie.polymorph.bank_account;

public class AccountMain {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(5000);
        //monthly operation
        //first month
        sa.deposit(2000);
        sa.withdraw(500);
        sa.deposit(1000);
        sa.withdraw(300);
        System.out.println("first month balance = " + sa.getBalance());
        System.out.println("first month interest = " + sa.getInterest());
        sa.earnMonthlyInterest();
        System.out.println("first month balance with interest = " + sa.getBalance());

        //second month
        sa.deposit(3000);
        sa.withdraw(3800);
        System.out.println("second month balance = " + sa.getBalance());
        System.out.println("second month interest = " + sa.getInterest());
        sa.earnMonthlyInterest();
        System.out.println("second month balance with interest = " + sa.getBalance());
    }
}
