package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.SavingsAccount;

public class AccountManagementV5 {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount(101, "Paramjit", 2000, 1000, false);
		System.out.println("Account obj is = " + account);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money you want to withdraw ? ");
		int amount = scanner.nextInt();
		
		if(account.withdraw(amount)) {
			
			System.out.println("Successfull withdrawal..");
			System.out.println("Account new balance is " + account.getBalance());
		} else {
			System.out.println("Sorry not a Saving account, cant withdraw more than min balance.");
		}
		
		scanner.close();
	}

}
