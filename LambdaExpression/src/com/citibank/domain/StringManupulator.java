package com.citibank.domain;

public class StringManupulator {
    private ProcessString process;

    public StringManupulator(ProcessString process) {
        this.process = process;
    }

    public String doManupulation(String input) {
        return process.doProcess(input);
    }
 
}
