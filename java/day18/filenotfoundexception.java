package day18.java;

import java.io.*;

public class filenotfoundexception {

	public static void main(String[] args) {
		try {
            FileReader reader = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            System.out.println("First line: " + line);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception: File not found.");
        } catch (IOException e) {
            System.out.println("Exception: Error reading file.");
        }
	}

}
