package com.citibank.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {

    private int num_1;
    private int num_2;
    private int result;

    public void accept(){

        Scanner scanner = null;
        try {
            System.out.println();
            System.out.println("accept started from here..");
            System.out.println();
            scanner = new Scanner(System.in);
            System.out.println("Enter the first number");
            num_1 = scanner.nextInt();
            System.out.println("Enter the second number");
            num_2 = scanner.nextInt();
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input from user");
            System.out.println("error is " + e.getMessage());
            e.printStackTrace();
        } 
        catch(Exception e) {
            System.err.println("Invalid input from user.");
            e.printStackTrace();
  
        }finally {
            System.out.println("accept ended here..");
            scanner.close();
        }   
    }

    public void calculate(){

        System.out.println();
        System.out.println("calculate satrted..");
        result = num_1 + num_2;
        System.out.println("calculate ended here..");


    }

    public int acceptAndCalculateAndDisplay(){

        Scanner scanner = null;
        int result = 0;
        try {
            System.out.println();
            System.out.println("acceptAndCalculateAndDisplay started from here..");
            System.out.println();
            scanner = new Scanner(System.in);
            System.out.println("Enter the first number");
            num_1 = scanner.nextInt();
            System.out.println("Enter the second number");
            num_2 = scanner.nextInt();
            System.out.println("calculation started..");
            result = num_1 + num_2;
            System.out.println("calculation ended here..");
            System.out.println("Displaying the result as " + result);
        } catch (InputMismatchException e) {
            System.out.println("Inavlid input from user.");
            e.printStackTrace();
            return result;
        } finally {
            scanner.close();
            System.out.println("acceptAndCalculateAndDisplay ended here..");  
        }
        return result;      
    }

    public void display(){

        System.out.println();
        System.out.println("display started..");
        System.out.println("result is " + result);
        System.out.println("display ended here..");
    }
    
}
