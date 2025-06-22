package Day11.java;

public class Product {

	String name;
    int productId;
    double price;

    Product(String name, int productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: $" + price);
        System.out.println();
    }
}

