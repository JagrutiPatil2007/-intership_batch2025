package day9.java;

public class split {

	public static void main(String[] args) {
		String sentence = "Hello? How are you? Good!";
        String[] parts = sentence.split("/*"); 
        for (String part : parts)
        {
            System.out.println(part);
	}

	}

}
