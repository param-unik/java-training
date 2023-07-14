package com.citibank.main;

import java.util.Scanner;
import java.util.Set;

import com.citibank.Repository.EmployeeRepo;
import com.citibank.domain.Employee;

public class EmployeeManager {

    public static void main(String[] args) {
        
        EmployeeRepo repo = new EmployeeRepo();
        int choice;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int empId;
        String empFirstName;
        String empLastName;
        String empEmail;
        double salary;


        while (!exit) {

            System.out.println("Menu ");
            System.out.println("1. Add new employee");
            System.out.println("2. Get All employees");
            System.out.println("3. Update employee");
            System.out.println("4. Get Single employee");
            System.out.println("5. Delete employee");
            System.out.println("6. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Employee ID");
                    empId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Employee First Name");
                    empFirstName = scanner.next();
                    System.out.println("Enter Employee last Name");
                    empLastName = scanner.next();
                    System.out.println("Enter Employee email address" );
                    empEmail = scanner.next();
                    System.out.println("Enter Employee Salary");
                    salary = scanner.nextDouble();
                    boolean res = repo.addNewEmployee(new Employee(empId, empFirstName, empLastName, empEmail, salary));
                    if(res) {
                        System.out.println("Employee added successfully");
                    } else {    
                        System.out.println("Employee already added in DB");
                    }
                    break;
                case 2:
                    System.out.println("Getting employee details..");
                    Set<Employee> set = repo.getEmployees();
                    if(set!= null) {
                        for (Employee employee : set) {
                            System.out.println(employee);    
                        }
                    } else {
                        System.out.println("Sorry! No employees found");
                    }
                    break;
                case 3:
                    System.out.println("Updating the employee..");
                    System.out.println();
                    System.out.println("Enter Employee ID");
                    empId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Employee First Name");
                    empFirstName = scanner.next();
                    System.out.println("Enter Employee last Name");
                    empLastName = scanner.next();
                    System.out.println("Enter Employee email address" );
                    empEmail = scanner.next();
                    System.out.println("Enter Employee Salary");
                    salary = scanner.nextDouble();
                    res = repo.updateEmployee(new Employee(empId, empFirstName, empLastName, empEmail, salary));
                    if (res) {
                        System.out.println("Employee updated successfully");
                    } else {
                        System.out.println("Employee not updated");
                    }
                    break;
                case 4:
                    System.out.println("Getting Single employee details..");
                    System.out.println("Enter Employee ID");
                    empId = scanner.nextInt();
                    
                    Employee singleEmp = repo.getSinglEmployee(empId);
                    if(singleEmp != null) System.out.println(singleEmp);
                    else System.out.println("Emplyee not found.");
                    break;
                case 5:
                    System.out.println("Deleting the employee..");
                    System.out.println();
                    System.out.println("Enter Employee ID");
                    empId = scanner.nextInt();
                    boolean result = repo.removeEmployee(empId);
                    if (result) {
                        System.out.println("Employee deleted successfully");
                    } else {
                        System.out.println("Employee not deleted");
                    }
                    break;
                default:
                    exit = true;
                    System.out.println("Exiting now...");
            }
        }
        System.out.println("Thank youbfor using it!");
        scanner.close();    
    }
    
}
