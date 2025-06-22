package day10.java;

import java.util.Scanner;

class Animal{
	void accept() {
		System.out.println("enter the animal_name=");
		Scanner s=new Scanner(System.in);
		String animal_name=s.nextLine();
		
	}
}

public class Dog extends Animal {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.accept();
		
		System.out.println("enter the Dog_name=");
		Scanner sc=new Scanner(System.in);
		String Dog_name=sc.nextLine();
		
		

	}

}
