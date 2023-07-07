package com.citibank.domain;

public class SavingsAccount extends Account {
	
	double minBalance;
	boolean isSalary;
	
	public SavingsAccount() {
		System.out.println("Default Saving account constructor gets called..");
	}
	
	public SavingsAccount(int acctNumber, String name, double balance, double minBalance, boolean isSalary) {
		super(acctNumber, name, balance);
		this.minBalance = minBalance;
		this.isSalary = isSalary;
	}
	
	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public boolean withdraw(int amount) {
		
		if ((super.getBalance() - amount) < 0 ) {
			return false;
		}
		
		if(isSalary && (super.getBalance() - amount ) < this.minBalance) {
			super.setBalance(super.getBalance() - amount);	
			return true;
		} else if((super.getBalance() - amount ) > this.minBalance) {
			if(super.withdraw(amount)) return true; else return false;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "SavingsAccount [ AccountNumber = " + super.getAcctNumber() + " , Name =  "+ super.getName() + " , Balance = " + super.getBalance() + " , minBalance = " + minBalance + ", isSalary=" + isSalary + "]";
	}
	
	

}
