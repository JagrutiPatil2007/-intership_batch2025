package addition.java;

import java.util.Scanner;

public class sum_A {

	public static void main(String[] args) {
		System.out.println("Enter the 1 number:-");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter the 2 number:-");
		Scanner s1=new Scanner(System.in);
		int b=s1.nextInt();
		int c=a+b;
		System.out.println("Total is:-"+c);

	}

}
