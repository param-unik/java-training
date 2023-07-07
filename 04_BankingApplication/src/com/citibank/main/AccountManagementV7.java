package com.citibank.main;

import java.util.Random;
import java.util.Scanner;

import com.citibank.domain.CurrentAccount;

public class AccountManagementV7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println();
        int acctNumber = new Random().nextInt(1000);

        System.out.println("Enter your account name");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Enter your initial balance amount ? ");
        double balance = scanner.nextDouble();

        CurrentAccount account = new CurrentAccount(acctNumber, name, balance, 50000);
        System.out.println("Account Number : " + account.getAcctNumber());
        System.out.println("Account Name : " + account.getName());
        System.out.println("Account Balance : " + account.getBalance());
        System.out.println("Account overdraft balance : " + account.getOverdraftBalance());

        System.out.println("withdrawing $5000..");
        if(account.withdraw(5000)) {
            System.out.println("Account Balance : " + account.getBalance());
            System.out.println("Account overdraft balance : " + account.getOverdraftBalance());
        } else {
            System.out.println("Withdrawal of $5000 was unsuccessull!");
        }
        
        System.out.println();

        System.out.println("withdrawing $15000..");
        if(account.withdraw(15000)) {
            System.out.println("Account Balance : " + account.getBalance());
            System.out.println("Account overdraft balance : " + account.getOverdraftBalance());
        } else {
            System.out.println("Withdrawal of $15000 was unsuccessull!");
        };

        System.out.println();

        System.out.println("Depositing $2000...");
        if(account.deposit(2000)) {
            System.out.println("Account Balance : " + account.getBalance());
            System.out.println("Account overdraft balance : " + account.getOverdraftBalance());
        } else {
            System.out.println("Deposit of $2000 was unsuccessull!");
        };

        System.out.println();

        System.out.println("Depositing $25000..");
        if(account.deposit(25000)) {
            System.out.println("Account Balance : " + account.getBalance());
            System.out.println("Account overdraft balance : " + account.getOverdraftBalance());
        } else {
            System.out.println("Deposit of $25000 was unsuccessull!");
        };
        System.out.println();

        scanner.close();
    }
    
}
