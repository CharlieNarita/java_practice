package com.charlie.polymorph.bank_account;

/*
extend BankAccount class as new class SavingAccount
define a method earnMonthlyInterest()
and there is three times service charge free of deposit or withdraw
reset the transaction counts in earnMonthlyInterest() method
*/
class SavingAccount extends BankAccount {
    //new attribute
    private int count = 3;  //init count as 3
    private double interestRate = 0.01; //init interestRate as 0.01

    //define method can reset count monthly
    public void earnMonthlyInterest() {
        count = 3;  //reset count as 3
        //save the interest into account every month
        super.deposit(getInterest());
    }

    public double getInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void deposit(double amount) {
        //judge service charge free or not
        if(count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        //judge service charge free or not
        if(count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}