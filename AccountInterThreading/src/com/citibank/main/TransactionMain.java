package com.citibank.main;

import com.citibank.domain.Account;
import com.citibank.threads.DepositThread;
import com.citibank.threads.WithdrawalThread;

public class TransactionMain {


    public static void main(String[] args) {

        Account account = new Account();
        
        WithdrawalThread withdrawalThread = new WithdrawalThread(account, 5000);
        DepositThread depositThread = new DepositThread(account, 3000);
        withdrawalThread = new WithdrawalThread(account, 9000);
        depositThread = new DepositThread(account, 10000);

    }
    
}
