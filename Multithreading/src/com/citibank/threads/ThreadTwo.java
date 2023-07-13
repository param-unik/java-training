package com.citibank.threads;

public class ThreadTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("ThreadTwo started..");
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadTwo: " + i);
        }   
    }
    
}
