package com.citibank.domain;

import java.util.Objects;

public class Employee {
    
    private String name;
    private int empId;
    private double salary;

    public Employee( int empId, String name,double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpdId(int empId) {
        this.empId = empId;
    }
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee " + "name = " + name + ", Empployee Id =" + empId + ", salary = " + salary + ' ';
    }

    @Override
    public boolean equals(Object obj) {
        if(this.empId == ((Employee)obj).getEmpId() && this.name.equals(((Employee)obj).getName())){
            return true;
        }
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(empId, name);
    }
}

