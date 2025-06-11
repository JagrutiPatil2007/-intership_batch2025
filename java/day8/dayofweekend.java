package day8.java;

import java.util.Scanner;

public class dayofweekend {

	public static void main(String[] args) {
		System.out.print("\nEnter a number (1 to 7) for weekday: ");
		Scanner s=new Scanner(System.in);
        int day =s.nextInt();
        switch (day) {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday"); 
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday"); 
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday"); 
            break;
            default: System.out.println("Invalid day number.");
        }
		
	}

}
