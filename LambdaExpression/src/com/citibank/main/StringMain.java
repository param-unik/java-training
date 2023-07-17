package com.citibank.main;

import com.citibank.domain.ProcessString;
import com.citibank.domain.StringManupulator;

public class StringMain {
    public static <string> void main(String[] args) {

        System.out.println("App started..");

        ProcessString process =  (input) -> input.toUpperCase();
        StringManupulator stringManupulator = new StringManupulator(process);
        String res =  stringManupulator.doManupulation("hi");
        System.out.println("converted to upper case as: " + res);

        System.out.println();

        process = (input) -> input.length() + "";
        stringManupulator = new StringManupulator(process);
        res =  stringManupulator.doManupulation("lambdaExpression");
        System.out.println("Length is " + res);

        System.out.println();

        process = (String input) -> input + input + input + input;

        stringManupulator = new StringManupulator(process);
        res =  stringManupulator.doManupulation("Hi");
        System.out.println("Output is: "  + res);



    }
    
}
