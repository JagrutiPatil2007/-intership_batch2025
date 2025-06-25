package day18.java;

public class ArrayoutofboundException {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		try {
			System.out.println(""+a[6]);
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("array index out bound exception"+e);
		}
				
	

	}

}
