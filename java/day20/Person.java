package day20.java;

public class Person {
    int age;
    String name;

    Person() {
        age = 0;
        name = "Unknown";
    }

    void display() {
        System.out.println("age is: " + age);
        System.out.println("name is: " + name);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}
