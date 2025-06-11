package day8.java;

import java.util.Scanner;

public class color {

	public static void main(String[] args) {
      
        System.out.print("Enter a color (Red, Yellow, Green): ");
        Scanner s=new Scanner(System.in);
		String color = s.nextLine();
        switch(color) {
            case "red":
                System.out.println("STOP! Red means stop.");
                break;
            case "yellow":
                System.out.println("READY! Yellow means get ready.");
                break;
            case "green":
                System.out.println("GO! Green means go.");
                break;
            default:
                System.out.println("Invalid color. Please enter Red, Yellow, or Green.");
        }

        
    }
}
	


