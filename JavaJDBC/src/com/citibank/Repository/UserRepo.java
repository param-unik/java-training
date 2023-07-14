package com.citibank.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import com.citibank.domain.User;

public class UserRepo {

    private String userName = "root";
    private String password = "Root123$";
    private String url = "jdbc:mysql://localhost:3306/mydb";
    private String query;
    private int resCount = 0;
    private ResultSet resultSet;;

    // connect to database 
    private Connection connection;
    // write query to database
    private PreparedStatement statement;

    public boolean addNewUser(User user) {
        query = "INSERT INTO employee_details values ( ?, ? )";
        try {
            connection = DriverManager.getConnection(this.url, this.userName, this.password);
            if(connection != null) {
                System.out.println("Connected to database");
                System.out.println();
                statement = connection.prepareStatement(query);
                statement.setString(1, user.getName());
                statement.setString(2, user.getPassword());

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

    public User getUser(String username, String password) {
        query = "SELECT * FROM users where username = ? and password =?";   
        try {
            connection = DriverManager.getConnection(this.url, this.userName, this.password);
            if(connection!= null) {
                System.out.println("connected to database");
            } else {
                System.out.println("Connection was not successful.."); 
                return null;  
            }
            statement =  connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                User user = new User();
                user.setName(resultSet.getString(1));
                user.setPassword(resultSet.getString(2));
                return user;
            }
            return null;
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




    
}
