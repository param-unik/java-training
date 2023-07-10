package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Account;
import com.citibank.domain.CurrentAccount;
import com.citibank.domain.SavingsAccount;
import com.citibank.factory.AccountFactory;

public class AccountManager {

    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println(" ");
        AccountFactory accountFactory = new AccountFactory();

        System.out.println("Menu of Account Creation.");
        System.out.println("1.Savings");
        System.out.println("2.Current");
        System.out.println("3. Quit");

        Account account = null;

        Scanner scanner = new Scanner(System.in);
        int choice  = scanner.nextInt();

        switch (choice) {
            case 1:
                account = accountFactory.createAccount(choice, scanner);
                System.out.println("Account Number : " + account.getAcctNumber());
                System.out.println("Account Name : " + account.getName());
                System.out.println("Account Balance : " + account.getBalance());
                
                if(((SavingsAccount) account).isSalary()) 
                    System.out.println("You have choosen to open salary saving account with us, Thanks you.");
                else 
                    System.out.println("You have choosen Non salary saving account with us, Thanks you!");
                break;
            case 2:
                account = accountFactory.createAccount(choice, scanner);
                System.out.println("Account Number : " + account.getAcctNumber());
                System.out.println("Account Name : " + account.getName());
                System.out.println("Account Balance : " + account.getBalance());
                if (account instanceof CurrentAccount) {
                    System.out.println("Account overdraft balance : " + ((CurrentAccount) account).getOverdraftBalance()); 
                };
                System.out.println("You have choosen to open current account with us, Thanks you.");
                break;     
            default:
                System.out.println("completed the interaction. Thank You !");
                System.out.println("Quiting the application.. Thank you.");
                break;
        }
    
    boolean quit = false;
    while(!quit && account!= null) {
        System.out.println("Transaction Menu..");
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

            if(account instanceof CurrentAccount){
                System.out.println("Overdraft balance is " + ((CurrentAccount) account).getOverdraftBalance());
            }
            System.out.println();
            break;

        default:
            quit = true;
            System.out.println("completed the interaction. Thank You !");
            break;
            }
        }
        if (account == null)System.out.println("Account object was not initialized..");
        scanner.close();
    };
    
}
