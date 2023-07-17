package com.citibank.main;

import com.citibank.UserExceptions.InvalidEmployeeSalaryException;
import com.citibank.domain.Employee;

public class ExceptionMain {
    public static void main(String[] args) {
        Employee employee;
        try {
            employee = new Employee(101, "Param", -1000.0);
            System.out.println(employee);
            employee.setEmpSalary(100); 
            System.out.println(employee);
        } catch (InvalidEmployeeSalaryException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }    
        
    }

    
}
