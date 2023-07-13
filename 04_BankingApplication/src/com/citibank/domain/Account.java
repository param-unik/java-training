package com.citibank.domain;
import java.util.Random;

abstract public class Account {
	
	private int acctNumber;
	private String name;
	private double balance;
	
	public Account() {
		
		System.out.println("Default constructor getting called...");
	}
	
	public Account(String name) {
		super();
		this.name = name;
		this.acctNumber = new Random().nextInt(1000);
		this.balance = 1000;
	}


	public Account(int acctNumber, String name, double balance) {
		super();
		this.acctNumber = acctNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int acctNumber, String name) {
		this.acctNumber = acctNumber;
		this.name = name;
	}

	public int getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(int acctNumber) {
		this.acctNumber = acctNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(int amount) {
		
		if( amount < this.balance) {
			this.balance = (this.getBalance() - amount);

			return true;
		} else {
			return false;
		}
	}
	
	public boolean deposit(int amount) {
		
		if (amount > 0) {
			this.balance = this.getBalance() + amount;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Account [acctNumber=" + acctNumber + ", name=" + name + ", balance=" + balance + "]";
	}
		


}
