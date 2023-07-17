package com.citibank.main;

import com.citibank.domain.UserApplication;
import com.citibank.domain.MyAddClass;
import com.citibank.domain.MyInterface;
import com.citibank.domain.MySubClass;

public class InterfaceMain {

    public static void main(String[] args) {
        System.out.println("App started..");

        System.out.println("without lambda expression..");
        MyInterface myAddInterface = new MyAddClass();
        UserApplication application = new UserApplication(myAddInterface);
        application.doProcess(10, 20);

        MyInterface mySubInterface = new MySubClass();
        application =  new UserApplication(mySubInterface);
        application.doProcess(30, 20);

        System.out.println();
        System.out.println("with lambda expression...");
        MyInterface myAddLambda = (x , y) ->  x + y;
        application = new UserApplication(myAddLambda);
        int res = application.doProcess(10, 20);  
        System.out.println("Add Result is " + res);

        MyInterface mySubLambda = (x , y) ->  x - y;
        application = new UserApplication(mySubLambda);
        res = application.doProcess(30, 20);
        System.out.println("Subtraction result is " + res);

        System.out.println("App ended..");
        
    }
    
}
