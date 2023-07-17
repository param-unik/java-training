package com.citibank.domain;

public class UserApplication {

    private MyInterface myInterface ;
    
    public UserApplication(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    public int doProcess(int x, int y){
        return this.myInterface.calculate(x, y);
    }
    
}
