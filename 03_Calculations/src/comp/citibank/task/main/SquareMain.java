package comp.citibank.task.main;

import comp.citibank.task.sqaure.Square;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class SquareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		System.out.println(rand.nextInt(100));
			
		// user input 
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the number ");
		int input = scanner.nextInt();
		scanner.close();
		
		Square sq = new Square();
		int cal_sq = sq.calculateSquare(input);
		
		
		System.out.println("Square of "+ input + " is " + cal_sq);
	}

}
