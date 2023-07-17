package com.citibank.domain;

public class MyAddClass  implements MyInterface{

    @Override
    public int calculate(int x, int y) {
        System.out.println("sum is " + (x + y));
        return x + y;

    }
    
}
