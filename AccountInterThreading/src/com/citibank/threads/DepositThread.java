package com.citibank.threads;

import com.citibank.domain.Account;

public class DepositThread implements Runnable {

    Account account;
    int amount;

    public DepositThread(Account account, int amount) {
        this.account = account;
        this.amount = amount;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
      account.deposit(this.amount);
    }
    
}
