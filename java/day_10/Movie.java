package day10.java;

import java.util.Scanner;

public class Movie {
	void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the title of movie=");
		String title=s.nextLine();
		System.out.println("enter the director of movie=");
		String director=s.nextLine();
		System.out.println("enter the movie release year=");
		int release_year=s.nextInt();
		
	}

	public static void main(String[] args) {
           Movie m=new Movie();
           Movie m1=new Movie();
           m.accept();
           m1.accept();

	}

}
