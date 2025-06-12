package day9.java;

import java.util.Scanner;

public class orNoperator {

	public static void main(String[] args) {
		System.out.println("Enter the age of citizens:");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		if(age >= 60 || age <= 15)
		{
			System.out.println("a person is either a senior citizen or a child");
		}
		else
		{
			System.out.println("a person is neither a senior citizen or a child");
		}
	}

}
