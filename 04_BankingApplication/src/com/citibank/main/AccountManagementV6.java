package com.citibank.main;

import java.util.Random;
import java.util.Scanner;

import com.citibank.domain.SavingsAccount;

public class AccountManagementV6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Do you want to open Salary account ?");
        System.out.println("Type true for yes and false for No");
        boolean isSalary = scanner.nextBoolean();

        int acctNumber = new Random().nextInt(1000);

        System.out.println("Enter your account name");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Enter your initial balance amount ? ");
        double balance = scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(acctNumber, name, balance, 1000, isSalary);
        System.out.println("Account Number : " + account.getAcctNumber());
        System.out.println("Account Name : " + account.getName());
        System.out.println("Account Balance : " + account.getBalance());
        
        if(account.isSalary()) 
            System.out.println("You selected to open salary saving account with us, Thanks you.");
        else 
            System.out.println("You have selected Non salary saving account, Thanks you!");
        
        boolean quit = false;
		
		while(!quit) {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Quit");
			
			int option = scanner.nextInt();
			int amount;
			
			switch (option) {
			case 1:
				System.out.println("Enter the amount to be withdrawan ?");
				amount = scanner.nextInt();
				if(account.withdraw(amount)) {
					System.out.println("withdrawal successful!");
				} else {
					System.out.println("transaction error!");
				}
				System.out.println();
				break;
			case 2:
				System.out.println("Enter the amount to be deposited ?");
				amount = scanner.nextInt();
				if(account.deposit(amount)) {
					System.out.println("deposit is successful!");
				} else {
					System.out.println("transaction error!");
				}
				System.out.println();
				break;
			case 3:
				System.out.println("Account balance is " + account.getBalance());
				System.out.println();
				break;

			default:
				quit = true;
				break;
			}
		}
		System.out.println("completed the interaction. Thank You !");

        scanner.close();
    }
    
}
