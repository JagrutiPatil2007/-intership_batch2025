package Day11.java;

public class Laptop {
	String brand;
    String model;
    double price;

    Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

	}


