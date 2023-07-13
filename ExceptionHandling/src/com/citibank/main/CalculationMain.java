package com.citibank.main;

import com.citibank.domain.Calculations;

public class CalculationMain {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("main started..");
        Calculations calculations =  new Calculations();
        calculations.acceptAndCalculateAndDisplay();
        System.out.println("main ended..");
    }
    
}
