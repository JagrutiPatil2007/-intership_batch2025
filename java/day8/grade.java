package day8.java;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		System.out.print("\nEnter a grade (A, B, C, D, F): ");
	    Scanner s=new Scanner(System.in);
		String grade = s.nextLine();
		switch (grade) {
		    case "A": 
		    	System.out.println("Excellent");
		        break;
		    case "B": 
		    	System.out.println("Good"); 
		        break;
		    case "C": 
		    	System.out.println("Average"); 
		        break;
		    case "D":
		    	System.out.println("Below Average");
		        break;
		    case "F": 
		    	System.out.println("Fail");
		        break;
		    default: System.out.println("Invalid Grade.");
		}


		}
		

	}


