package com.citibank.main;

import com.citibank.domain.Child;
import com.citibank.domain.Parent;

public class App {

    public static void main(String[] args) {
        System.out.println("App started..");
        Parent parent = new Parent();
        Child child = new Child();
        child.show();
        
    }
    
}
