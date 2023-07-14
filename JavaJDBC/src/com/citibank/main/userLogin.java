package com.citibank.main;

import java.util.Scanner;

import com.citibank.Repository.UserRepo;
import com.citibank.domain.User;

public class userLogin {

    public static void main(String[] args) {

        UserRepo userRepo = new UserRepo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username ");
        String username = scanner.next();
        System.out.println("Enter password ");
        String password = scanner.next();

        User user = userRepo.getUser(username, password);
        if(user != null){
            System.out.println("Welcome to Login Page..");
        } else {
            System.out.println("Sorry check your username and password");
        }
        scanner.close();   
    }   
}
