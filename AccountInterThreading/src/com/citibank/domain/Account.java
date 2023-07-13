package com.citibank.domain;

public class Account  {

    int balance = 10000;

    public synchronized void withdraw(int amount) {
        System.out.println();
        System.out.println("Withdrawing " + amount);
        if (this.balance > amount) {
            this.balance = this.balance - amount;
            System.out.println("Withdrawal is completed...");
            System.out.println("New balance after withdrawal is " + this.balance);
            System.out.println();
        } else {
            System.out.println("Insufficient balance");
            try {
                wait();
                withdraw(amount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void deposit(int amount) {
        System.out.println();
        System.out.println("Depositing " + amount);
        this.balance = this.balance + amount;
        System.out.println("Desposit completed..");
        System.out.println("New balance is " + this.balance);
        notify();
    }
    public int getBalance() {
        return this.balance;
    }
    
}
