package com.citibank.main;

import com.citibank.domain.Resources;
import com.citibank.threads.Caller;

public class CallerMain {
    public static void main(String[] args) {
        // System.out.println("CallerMain started..");

        Resources resources = new Resources();
        Caller caller = null;
        caller = new Caller(resources, "Hi");
        caller = new Caller(resources, "Hello");

        // System.out.println("CallerMain end..");
    }
    
}
