package com.citibank.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class ConnectionTestMain {

    public static void main(String[] args) {
        System.out.println("JDBC connection Main started..");
        String username = "root";
        String password = "Root123$";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb";
        Connection connection = null;
        
        try {
            connection = java.sql.DriverManager.getConnection(url, username, password);
            
            if (connection!= null) {
                System.out.println("Connect is successful..");
                Statement sql = connection.createStatement();
                String sqlQuery = "SELECT * FROM employee_details";
                ResultSet res = sql.executeQuery(sqlQuery);
                while(res.next()) {
                    System.out.println("Emp_Id: " + res.getString(1) + ", First_Name: " + res.getString(2) + ", Last_Name: " + res.getString(3) + ",Email_address : " + res.getString(4) + ", Salary : " + res.getDouble(5));
                }

            }else {
                System.out.println("Connect is not successful..");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error while closing connection..");
                e.printStackTrace();
            }
        }


        System.out.println("JDBC Connection Main ended..");

        
    }
    
}
