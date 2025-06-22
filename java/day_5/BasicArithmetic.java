package day5.java;

import java.util.Scanner;

public class BasicArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Arithmetic operations
        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division (/): " + (num1 / num2));
            System.out.println("Modulus (%): " + (num1 % num2));
        } else {
            System.out.println("Division and Modulus not possible (divisor is zero)");
        }

        
    }
}
