package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Shapes;
import com.citibank.factory.ShapesFactory;

public class ShapeMain {

    public static void main(String[] args) {
        System.out.println("Shapes main started..");
        Shapes shapes;
        ShapesFactory shapesFactory = new ShapesFactory();
        Scanner scanner = new Scanner(System.in);
        boolean exist = true;
        System.out.println("Menu");

        while (exist) {
            
            System.out.println("What shape you want to draw ?..");
            System.out.println("1. Circle");
            System.out.println("2. Lines");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Quit");
            System.out.println();

            int choice = scanner.nextInt();

            shapes = shapesFactory.createShape(choice);

            if (shapes == null) {
                exist = false;
                System.out.println("You have choosen an invalid shape. quiting now.");
                break;
            }
            shapes.draw();    
        }
        scanner.close();
        System.out.println("Thank You!"); 
    }   
}
