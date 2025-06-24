package day17.java;

public class zerodivide {

	public static void main(String[] args) {
		try {
			int result=10/0;
			System.out.println("result is:"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("error:no is not divide by zero");

		}
	}

}
