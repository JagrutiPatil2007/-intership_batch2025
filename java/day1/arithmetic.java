package arithmetic.java;

import java.util.Scanner;

public class arithmetic {

	public static void main(String[] args) {
               System.out.println("Enter the two number=");
               Scanner sc=new Scanner(System.in);
               int a=sc.nextInt();
               Scanner s=new Scanner(System.in);
               int b=s.nextInt();
               System.out.println("perform the addition:-"+(a+b));
               System.out.println("perform the multiplication:-"+(a*b));
               System.out.println("perform the division:-"+(a/b));
               System.out.println("perform the substraction:-"+(a-b));
               System.out.println("perform the modilation:-"+(a%b));
               
	}

}

