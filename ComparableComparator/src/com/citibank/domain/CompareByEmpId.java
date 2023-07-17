package com.citibank.domain;

import java.util.Comparator;

public class CompareByEmpId implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getEmpId() - emp2.getEmpId();
    } 
}
