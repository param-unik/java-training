package com.citibank.domain;

public class MySubClass implements MyInterface {
    public int calculate(int x, int y) {
        System.out.println("Subtraction is "+ (x - y)) ;
        return x - y;
    }
    
}
