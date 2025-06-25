package day18.java; 

public class IOexception1 {
	public static void main(String[] args) {
		String text = null;
        if (text != null)
        {
            System.out.println(text.toUpperCase());
        } 
        else {
            System.out.println("Text is null!");
        }
	}

} 
