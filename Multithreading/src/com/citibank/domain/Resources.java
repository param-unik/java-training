package com.citibank.domain;

public class Resources  {

    public synchronized void getCall(String message) {
        System.out.print("[");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(message);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
    
}
