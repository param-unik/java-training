package com.citibank.domain;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    public Employee() {
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
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + '}';
    }

    @Override
    public boolean equals(Object obj) {
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
        return true;
    
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.empId;
        return hash;
    }
    @Override
    public int compareTo(Employee emp) {
            System.out.println((int) (this.empSalary - emp.getEmpSalary()));
            // return this.empId - emp.getEmpId();
            // return this.getEmpName().compareTo(emp.getEmpName());
            return (int) (this.empSalary - emp.getEmpSalary());
    }
    
}
