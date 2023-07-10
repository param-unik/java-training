package com.citibank.factory;

import java.util.Random;
import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.CurrentAccount;
import com.citibank.domain.SavingsAccount;

public class AccountFactory {

    public Account createAccount(int choice, Scanner scanner) {
        System.out.println();

        switch (choice) {
            case 1:
                System.out.println("Do you want to open Salary account ?");
                System.out.println("Type true for yes and false for No");

                boolean isSalary = scanner.nextBoolean();

                int acctNumber = new Random().nextInt(1000, 2000);

                System.out.println("Enter your account name");
                scanner.nextLine();
                String name = scanner.nextLine();

                System.out.println("Enter your initial balance amount ? ");
                double balance = scanner.nextDouble();
                
                return new SavingsAccount(acctNumber, name, balance, 10000, isSalary);
            case 2:
                System.out.println("Going to create current account now.");
                System.out.println();
                acctNumber = new Random().nextInt(1000);

                System.out.println("Enter your account name");
                scanner.nextLine();
                name = scanner.nextLine();

                System.out.println("Enter your initial balance amount ? ");
                balance = scanner.nextDouble();
                return new CurrentAccount(acctNumber, name, balance, 50000);
            default:
                return null;
        }
    }
}
