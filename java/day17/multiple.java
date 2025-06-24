package day17.java;

import java.util.Scanner;

public class multiple {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the first number:");
			int a=s.nextInt();
			
			System.out.println("Enter the first number:");
			int b=s.nextInt();
			
			System.out.println("Addition"+(a+b));

			System.out.println("Addition"+(a-b));
			
			System.out.println("Addition"+(a*b));
			
			System.out.println("Addition"+(a/b));



			
			
		}
		catch(ArithmeticException e) {
			System.out.println("error:no is not divide by zero");

		}
		finally {
			System.out.println("finally block is always execute");

		}

	}

}
