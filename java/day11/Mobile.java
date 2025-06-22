package Day11.java;

public class Mobile {
	String modelName;
    double price;

    void setDetails(String model, double cost) {
        modelName = model;
        price = cost;
    }

    void displayDetails() {
        System.out.println("Model: " + modelName + ", Price: ₹" + price);
    }

	public static void main(String[] args) {
		 Mobile mob1 = new Mobile();
	        Mobile mob2 = new Mobile();

	        mob1.setDetails("Samsung Galaxy S21", 69999);
	        mob2.setDetails("iPhone 14", 79999);

	        mob1.displayDetails();
	        mob2.displayDetails();

	}

}
