package day18.java;

public class handledarrayoutofboundexception {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
        try {
            for (int i = 0; i <= arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Tried to access invalid index!");
        }

	}

}
