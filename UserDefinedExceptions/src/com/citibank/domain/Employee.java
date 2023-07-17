package com.citibank.domain;
import java.util.Objects;

import com.citibank.UserExceptions.InvalidEmployeeSalaryException;

public class Employee {

    private int empId;
    private String empName;
    private double empSalary;

    public Employee() {}

    public Employee(int empId, String empName, double empSalary) throws InvalidEmployeeSalaryException {
        this.empId = empId;
        this.empName = empName;
        if (empSalary < 0) {
            System.out.println("calling user deined exception");
            throw new InvalidEmployeeSalaryException();
        } else {
            this.empSalary = empSalary;
        }
    }

    public Employee(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(double empSalary) throws InvalidEmployeeSalaryException {
        if(empSalary < 0) {
            throw new InvalidEmployeeSalaryException();
        }
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass()!= obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.empId!= other.empId) {
            return false;
        }
        if (!Objects.equals(this.empName, other.empName)) {
            return false;
        }
        if (Double.doubleToLongBits(this.empSalary)!= Double.doubleToLongBits(other.empSalary)) {
            return false;
        }
        return true;
    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.empId;
        hash = 97 * hash + Objects.hashCode(this.empName);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.empSalary) ^ (Double.doubleToLongBits(this.empSalary) >>> 32));
        return hash;

    }
    
}
