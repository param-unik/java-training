package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;

public class AccountMainV2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Number ");
		int accNum = scanner.nextInt();
		
		System.out.println("Enter Account Name ");
		scanner.nextLine();
		String name  = scanner.nextLine();
		
		System.out.println("Enter Account Balance ");
		double balance = scanner.nextDouble();
		
		Account account = new Account(accNum, name, balance);
		
		System.out.println(account);
		
		System.out.println("Account Number  is " + account.getAcctNumber());
		System.out.println("Account name is " + account.getName());
		System.out.println("Account balance is $" + account.getBalance());
		
		System.out.println();
		System.out.println("Withdrawal started...");
		System.out.println("How much money you want to withdraw ? ");
		int amount = scanner.nextInt();
		
		if( account.withdraw(amount)) {
			System.out.println("Withdrawal successfull");	
		} else {
			System.out.println("Sorry .You dont enough money to withdraw!");
		}

		System.out.println("New account balance is $" + account.getBalance());
		
		System.out.println();
		System.out.println("deposit started...");
		System.out.println("How much money you want to get deposited to ?");
		amount = scanner.nextInt();
		
		if(account.deposit(amount)){
			System.out.println("Deposit is successfull");
		} else {
			System.out.println("Sorry . Deposit was not successfull!");
		}
		
		System.out.println("New account balance is $" + account.getBalance());
		
		System.out.println("***************************");
		Account account2 = new Account("New Account");
		System.out.println("Account Number  is " + account2.getAcctNumber());
		System.out.println("Account name is " + account2.getName());
		System.out.println("Account balance is $" + account2.getBalance());
		
		scanner.close();
	}

}
