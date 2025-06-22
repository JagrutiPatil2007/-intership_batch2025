package day6.java;

import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter today's temperature in °C: ");
        double temperature = sc.nextDouble();

        if (temperature > 35.0) {
            System.out.println("Hot Day");
        } else {
            System.out.println("Normal Day");
        }

        sc.close();
    }
}
