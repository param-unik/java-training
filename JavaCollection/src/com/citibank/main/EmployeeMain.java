package com.citibank.main;

import java.util.ArrayList;

import com.citibank.domain.GenericClass;

public class EmployeeMain {

    public static void main(String args[]) {

        System.out.println("App started..");

        GenericClass <Integer> integer = new GenericClass<Integer>();
        integer.display(10);

        GenericClass <Double> doubles = new GenericClass<Double>();
        doubles.display(10.0);

        GenericClass <String> str = new GenericClass<String>();
        str.display("hello..");

        System.out.println("App ended..");

        ArrayList<Integer> integers = new ArrayList<Integer>();

        integers.add(10);
        integers.add(20);
        integers.add(30);

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }

        for (Integer i : integers) {
            System.out.println(i);   
        }


    
    }

}   
        


