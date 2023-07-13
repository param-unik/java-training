package com.citibank.threads;

import com.citibank.domain.Account;

public class WithdrawalThread implements Runnable {

    Account account;
    int amount;

    public WithdrawalThread(Account account, int amount){
        this.account = account;
        this.amount = amount;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        account.withdraw(this.amount);     
    }
    
}
