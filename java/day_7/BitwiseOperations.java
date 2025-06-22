package day7.java;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        
        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;

        System.out.println("Bitwise AND (&): " + andResult);
        System.out.println("Bitwise OR (|): " + orResult);
        System.out.println("Bitwise XOR (^): " + xorResult);

        sc.close();
    }
}
