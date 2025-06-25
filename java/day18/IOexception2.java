package day18.java;

import java.io.*;

public class IOexception2 {

	public static void main(String[] args) {
		try {
            FileReader reader = new FileReader("nofile.txt");
            reader.close();
        } catch (IOException e) {
            System.out.println("Exception: File not found or cannot be read.");
        }
	}

}
