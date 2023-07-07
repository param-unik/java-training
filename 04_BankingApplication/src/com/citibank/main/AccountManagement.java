package com.citibank.main;

import com.citibank.domain.Account;

public class AccountManagement {

	public static void main(String[] args) {
		
		System.out.println("main started...");
		
		Account account =  new Account(101,"Paramjit", 1000);
		
		System.out.println("Account Number  is " + account.getAcctNumber());
		System.out.println("Account name is " + account.getName());
		System.out.println("Account balance is $" + account.getBalance());
		
		System.out.println("*******************************");
		
		account =  new Account(102,"Training Day1", 2000);
		
		System.out.println("Account Number  is " + account.getAcctNumber());
		System.out.println("Account name is " + account.getName());
		System.out.println("Account balance is $" + account.getBalance());
		
		System.out.println("main ended..");

	}

}
