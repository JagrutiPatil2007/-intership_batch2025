package day17.java;

import java.util.Scanner;

public class twoinput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the first number:");
			int a=s.nextInt();
			
			System.out.println("Enter the first number:");
			int b=s.nextInt();
			
			int c=a/b;
			System.out.println("Result is="+c);
			
		}
		catch(ArithmeticException e) {
			System.out.println("error:no is not divide by zero");

		}
	}

}
