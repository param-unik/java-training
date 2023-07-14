package com.citibank.domain;

public class GenericClass<T> {
    
    public void display(T input){
        System.out.println(input);
    }

    @Override
    public int hashCode() {
            return super.hashCode();
    }

}
