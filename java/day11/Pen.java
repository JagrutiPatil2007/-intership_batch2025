package Day11.java;

public class Pen {
	String brand;
    String color;

    void setDetails(String b, String c) {
        brand = b;
        color = c;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }

	public static void main(String[] args) {
		 Pen myPen = new Pen();
	        myPen.setDetails("Reynolds", "Blue");
	        myPen.displayDetails();
	}

}
