package day6.java;

import java.util.Scanner;

public class StudentDetailsSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student details (e.g. 101,Ravi,78,85,90): ");
        String input = sc.nextLine();

        
        String[] details = input.split(",");

        System.out.println("Student Details:");
        for (String detail : details) {
            System.out.println(detail);
        }

      
    }
}
