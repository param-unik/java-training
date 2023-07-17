package com.citibank.UserExceptions;

public class InvalidEmployeeSalaryException extends RuntimeException {
    
    public String getMessage() {
        return "Invalid Employee Salary; Salary must be a positive number";
    }
    
}
