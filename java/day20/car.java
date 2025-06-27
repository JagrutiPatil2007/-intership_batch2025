package day20.java;

public class car {
    String model;
    String brand;
    int year;

    
    car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    
    car(car c) {
        this.model = c.model;
        this.brand = c.brand;
        this.year = c.year;
    }

    
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    
    public static void main(String[] args) {
       
        car car1 = new car("Civic", "Honda", 2022);

        
        car car2 = new car(car1);

        
        System.out.println("Original Car:");
        car1.display();

        System.out.println("\nCopied Car:");
        car2.display();
    }
}
