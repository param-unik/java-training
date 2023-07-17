package com.citibank.main;

import java.util.Arrays;
import java.util.Comparator;

import com.citibank.domain.CompareByEmpId;
import com.citibank.domain.Employee;

public class App {

    public static void main(String[] args) {
        System.out.println("App started..");
        int[] myArray = {2, 5, 3, 1, 8};

        for (int i : myArray) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("After sorting");
        Arrays.sort(myArray);
        
        for (int i : myArray) {
            System.out.println(i);
        }

        Employee emp1 = new Employee(103,"def", 9000);
        Employee emp2 = new Employee(102,"abc", 2000);
        Employee emp3 = new Employee(101,"ghi", 3000);

        Employee[] empArrya = {emp1, emp2, emp3};

        for (Employee employee : empArrya) {
            System.out.println(employee);
        }

        Arrays.sort(empArrya);

        for (Employee employee : empArrya) {
            System.out.println(employee);
        }

        String ch = "";
        for (int i = 0; i < 4; i++) {
            ch = ch + "Hi";
        }
        System.out.println(ch);

        System.out.println("**************************************");
        System.out.println("Compare employees by employeeId");
        Arrays.sort(empArrya, new CompareByEmpId());

        for (Employee employee : empArrya) {
            System.out.println(employee);
        }

        System.out.println("By lambda expression now...");

        Comparator<Employee> byName = (Employee e1, Employee e2) -> e1.getEmpName().compareTo(e2.getEmpName());
        System.out.println("Sorting out by Name..");
        Arrays.sort(empArrya, byName);
        
        for (Employee employee : empArrya) {
            System.out.println(employee);
        }

        Comparator<Employee> bySalary = (Employee e1, Employee e2) -> (int)(e1.getEmpSalary() - e2.getEmpSalary());
        System.out.println("Sorting out by Salary..");
        Arrays.sort(empArrya, bySalary);
        for (Employee employee : empArrya) {
            System.out.println(employee);
        }

    }   
}
