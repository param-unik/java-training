package com.citibank.threads;

import com.citibank.domain.Resources;

public class Caller implements Runnable {

    Resources resources;
    String message;
    Thread thread;

    public Caller(){

    }

    public Caller(Resources resources, String message){
        this.resources = resources;
        this.message = message;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        resources.getCall(this.message); 
    }
    
    public String toString(){
        return "message is " + this.message;
        
    }
}
