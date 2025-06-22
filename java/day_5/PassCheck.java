package day5.java;

import java.util.Scanner;

public class PassCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

       
        if (marks >= 0 && marks <= 100) {
            if (marks > 40) {
                System.out.println("Status: Passed");
            } else {
                System.out.println("Status: Failed");
            }
        } else {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }

        
    }
}
