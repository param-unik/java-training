package com.citibank.main;

import com.citibank.threads.ThreadOne;
import com.citibank.threads.ThreadTwo;

public class ThreadMain {
    public static void main(String[] args) {
        
        System.out.println("main started..");
        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        ThreadTwo threadTwo = new ThreadTwo();
        Thread thread = new Thread(threadTwo);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main : " + i);    
        }
        System.out.println("main ended..");
    }   
}
