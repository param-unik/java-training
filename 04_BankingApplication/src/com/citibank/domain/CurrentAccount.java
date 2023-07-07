package com.citibank.domain;

public class CurrentAccount extends Account {

    double overdraftBalance;
    double prevOverdraftBalance = 0;

    public CurrentAccount() {
        System.out.println("default constructor of currentaccount gets called..");
    }

    public CurrentAccount(int acctNumber, String name, double balance, double overdraftBalance){
        super(acctNumber, name, balance);
        this.overdraftBalance =  overdraftBalance;
        prevOverdraftBalance = this.overdraftBalance;
    }

    public double getOverdraftBalance() {
        return this.overdraftBalance;
    }

    public void setOverdraftBalance(double amount) {
        this.overdraftBalance = amount;
    }

    public boolean withdraw(int amount) {
        if (super.getBalance() == 0){
            this.overdraftBalance = this.overdraftBalance - amount;
            return true;
        } else if (super.getBalance() > amount) {
            super.setBalance(super.getBalance() - amount);
            return true;
        } else if (amount > super.getBalance()){
            this.overdraftBalance = this.overdraftBalance - (amount - super.getBalance());
            super.setBalance(0);
            return true;
        }
        return false;
    }

    public boolean deposit(int amount){
        if (prevOverdraftBalance == this.overdraftBalance){
            super.setBalance(super.getBalance() + amount);
            return true;
        } else if((prevOverdraftBalance - this.overdraftBalance) >= amount ) {
            this.overdraftBalance = this.overdraftBalance + amount;
            return true;
        } else if ((prevOverdraftBalance - this.overdraftBalance) < amount){
            double diff = prevOverdraftBalance - this.overdraftBalance;
            this.overdraftBalance = this.overdraftBalance + diff;
            prevOverdraftBalance = this.overdraftBalance;
            super.setBalance(super.getBalance() + (amount - diff));
            return true;
        } else {
            return false;
        }
    }

}
