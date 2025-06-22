package day7.java;

import java.util.Scanner;

public class BitwiseShifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

       
        int leftShift = num << 2;
        int rightShift = num >> 2;
        int unsignedRightShift = num >>> 2;

        System.out.println("Original Number: " + num);
        System.out.println("Left Shift (<< 2): " + leftShift);
        System.out.println("Right Shift (>> 2): " + rightShift);
        System.out.println("Unsigned Right Shift (>>> 2): " + unsignedRightShift);

       
    }
}
