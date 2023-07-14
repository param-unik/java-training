package com.citibank.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.sql.ResultSet;
import com.citibank.domain.Employee;

public class EmployeeRepo {

    private String userName = "root";
    private String password = "Root123$";
    private String url = "jdbc:mysql://localhost:3306/mydb";
    private String query;
    private int resCount = 0;
    private ResultSet resultSet;
    private Set<Employee> employeeSet = new HashSet<Employee>();

    // connect to database 
    private Connection connection;
    // write query to database
    private PreparedStatement statement;

    public boolean addNewEmployee(Employee employee) {
        query = "INSERT INTO employee_details values ( ?, ?, ?, ?, ? )";
        try {
            connection = DriverManager.getConnection(this.url, this.userName, this.password);
            if(connection != null) {
                System.out.println("Connected to database");
                System.out.println();
                statement = connection.prepareStatement(query);
                statement.setInt(1, employee.getEmpId());
                statement.setString(2, employee.getEmpFirstName());
                statement.setString(3, employee.getEmpLastName());
                statement.setString(4, employee.getEmpEmail());
                statement.setDouble(5, employee.getEmpSalary());
                resCount = statement.executeUpdate();
                if(resCount > 0) {
                    System.out.println("Inserted successfully");
                    return true;
                } else {
                    System.out.println("Failed to insert employee");
                    return false; 
                }   
            } else {
                System.out.println("connection was not successful..");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println("error while closing connection");
                e.printStackTrace();
            }
        }
        return false;

    }

    public Set<Employee> getEmployees() {
        query = "SELECT * FROM employee_details";   
        try {
            connection = DriverManager.getConnection(this.url, this.userName, this.password);
            if(connection!= null) {
                System.out.println("connected to database");
            } else {
                System.out.println("Connection was not successful.."); 
                return null;  
            }
            statement =  connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            while(resultSet.next()){
                Employee employee = new Employee();
                employee.setEmpId(resultSet.getInt(1));
                employee.setEmpFirstName(resultSet.getString(2));
                employee.setEmpLastName(resultSet.getString(3));
                employee.setEmpEmail(resultSet.getString(4));
                employee.setEmpSalary(resultSet.getDouble(5));

                System.out.println(employee.getEmpId());
                System.out.println(employee.getEmpFirstName());
                System.out.println(employee.getEmpLastName());
                System.out.println(employee.getEmpEmail());
                System.out.println(employee.getEmpSalary());
                System.out.println();
                employeeSet.add(employee);
            }
            return employeeSet;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
                resultSet.close();
            } catch (SQLException e) {
                System.out.println("error while closing connection");
                e.printStackTrace();
            }
        }

        return null;
    }

    public Employee getSinglEmployee(int empId) {
        query = "SELECT DISTINCT * FROM employee_details WHERE emp_id = ?";

        try {
            connection = DriverManager.getConnection(this.url, this.userName, this.password);
            if(connection!= null) {
                System.out.println("connected to database");
            } else {
                System.out.println("Connection was not successful.."); 
                return null;  
            }
            statement =  connection.prepareStatement(query);
            statement.setInt(1, empId);
            resultSet = statement.executeQuery();
            Employee employee = new Employee();
            resultSet.next();
            employee.setEmpId(resultSet.getInt(1));
            employee.setEmpFirstName(resultSet.getString(2));
            employee.setEmpLastName(resultSet.getString(3));
            employee.setEmpEmail(resultSet.getString(4));
            employee.setEmpSalary(resultSet.getDouble(5));

            System.out.println(employee.getEmpId());
            System.out.println(employee.getEmpFirstName());
            System.out.println(employee.getEmpLastName());
            System.out.println(employee.getEmpEmail());
            System.out.println(employee.getEmpSalary());
            System.out.println();

            return employee;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
                resultSet.close();
            } catch (SQLException e) {
                System.out.println("error while closing connection");
                e.printStackTrace();
            }
        }
        return null;    
    }

    public boolean removeEmployee(int empId) {
        query = "DELETE FROM employee_details WHERE emp_id =?";
        try {
            connection = DriverManager.getConnection(this.url, this.userName, this.password);
            if(connection!= null) {
                System.out.println("connected to database");
            } else {
                System.out.println("Connection was not successful.."); 
                return false;  
            }
            statement =  connection.prepareStatement(query);
            statement.setInt(1, empId);
            resCount = statement.executeUpdate();
            System.out.println(resCount);
            System.out.println();
            if(resCount > 0) {
                System.out.println("Deleted successfully");
                return true;
            } else {
                System.out.println("Failed to delete employee");
                return false; 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println("error while closing connection");
                e.printStackTrace();
            }
        }
        return false;

    }

    public boolean updateEmployee(Employee employee){
        query = "UPDATE employee_details SET first_name =?, last_name =?, email =?, salary =? WHERE emp_id =?";
        try {
            connection = DriverManager.getConnection(this.url, this.userName, this.password);
            if(connection!= null) {
                System.out.println("Connected to database");
                System.out.println();
                statement = connection.prepareStatement(query);
                statement.setString(1, employee.getEmpFirstName());
                statement.setString(2, employee.getEmpLastName());
                statement.setString(3, employee.getEmpEmail());
                statement.setDouble(4, employee.getEmpSalary());
                statement.setInt(5,employee.getEmpId());
                resCount = statement.executeUpdate();
                if(resCount > 0) {
                    System.out.println("Updated successfully");
                    return true;
                } else {
                    System.out.println("Failed to update employee");
                    return false; 
                }   
            } else {
                System.out.println("connection was not successful..");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println("error while closing connection");
                e.printStackTrace();
            } 
    }
    return false;
}
    
}
