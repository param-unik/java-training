package com.citibank.Repository;


import java.util.HashSet;

import java.util.Set;

import com.citibank.domain.Employee;

public class EmployeeRepo {

    Set<Employee> employees = new HashSet<Employee>();

    public Set<Employee> getEmployees() {
        return employees;
    }

    public boolean addEmployee(Employee employee) {

        return employees.add(employee);
    }

    public boolean removeEmployee(int empId) {

        // for (Employee emp : employees) {
        //     if (emp.getEmpId() == empId) {
        //         return employees.remove(emp);
        //     } 

        Employee emp = this.getSinglEmployee(empId); 
        if (emp!= null) {
            return employees.remove(emp);
        }
        return false;
    }

    public boolean updateEmployee(Employee employee) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == employee.getEmpId()) {
                emp.setName(employee.getName());
                emp.setSalary(employee.getSalary());
                return true;
            }   
        }
        return false;
    }

    public Employee getSinglEmployee(int empId) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                return emp;
            }   
        }
        return null;
    }
}
