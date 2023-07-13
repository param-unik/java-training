package com.citibank.domain;

public class Employee {

    private int empId;
    private String name;
    private double salary;

    Employee(){
        this.empId = 0;
        this.name = "";
        this.salary = 0;
    }

    public Employee(int empId, String name, double salary){
         this.empId = empId;
         this.name = name;
         this.salary = salary;
     }

    public int getEmpId() {
        return empId;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String toString(){
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println();
        return "Employee ID: " + this.empId + ",Name : " + this.name + ",Salary: " + this.salary ;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass()!= obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.empId!= other.empId && this.name != other.name &&  this.salary != other.salary) {
            return false;
        }
        return true;
    }

}
