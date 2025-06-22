package day2.java;

public class local {

	

	    
	    int lastPrinted = 0;

	    public void printEvenNumbers(int n) {
	      
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	                lastPrinted = i;  
	            }
	        }
	    }

	    public static void main(String[] args) {
	       local printer = new local();
	        printer.printEvenNumbers(10);
	    }
	}


