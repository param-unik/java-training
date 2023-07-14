package com.citibank.domain;
import java.util.Objects;

public class Employee {
    private int empId;
    private String empFirstName;
    private String empLastName;
    private String empEmail;
    private double empSalary;

    public Employee(int empId, String empFirstName, String empLastName, String empEmail, double empSalary) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empEmail = empEmail;
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
    public String getEmpFirstName() {
        return empFirstName;
    }
    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }
    public String getEmpLastName() {
        return empLastName;
    }
    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }
    public String getEmpEmail() {
        return empEmail;
    }
    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.empSalary, empSalary) == 0 &&
                empId == employee.empId &&
                Objects.equals(empFirstName, employee.empFirstName) &&
                Objects.equals(empLastName, employee.empLastName) &&
                Objects.equals(empEmail, employee.empEmail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(empId, empFirstName, empLastName, empEmail, empSalary);
    }
    


}
