package day20.java;

public class Employee {
    int id;
    String name;

    
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    Employee(Employee e) {
        this.id = e.id;
        this.name = e.name;
    }

    
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "jagruti");
        Employee emp2 = new Employee(emp1); 
        System.out.println("Original Employee:");
        emp1.display();

        System.out.println("\nCopied Employee:");
        emp2.display();
    }
}
