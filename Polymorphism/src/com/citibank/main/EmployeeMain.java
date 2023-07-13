package com.citibank.main;

import com.citibank.domain.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp_1 = new Employee(101,"Paramjit", 1000.0);
        Employee emp_2 = new Employee(101,"Paramjit", 1000.0);

        Employee emp_3 =  emp_2;
        System.out.println(emp_3.hashCode());
        System.out.println(emp_2.hashCode());


        System.out.println(emp_1);
        System.out.println(emp_2);

        String str = "Char";
        String str2 = "Char";

        if (emp_1.equals(emp_2)) {
            System.out.println("Emp_1 and Emp_2 are equal");
        } else {
            System.out.println("Emp_1 and Emp_2 are not equal") ;
        }

        if (str.equals(str2)){
            System.out.println("str and str2 are equal");
        } else {
            System.out.println("str and str2 are not equal");
        }
    }
    
} 