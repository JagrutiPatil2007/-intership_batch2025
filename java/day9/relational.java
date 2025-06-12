package day9.java;

import java.util.Scanner;

public class relational {

	public static void main(String[] args) {
		System.out.println("Enter the first number:");
		System.out.println("Enter the second number:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("a>b="+(a>b));
		System.out.println("a<b="+(a<b));
		System.out.println("a==b="+(a==b));
		System.out.println("a!=b="+(a!=b));
		System.out.println("a>=b="+(a>=b));
		System.out.println("a<=b="+(a<=b));



	}

}
