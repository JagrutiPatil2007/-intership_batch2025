package day12.java;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
  
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    
    void start() {
        System.out.println("Bike starts with button");
    }
    public static void main(String[] args) {
    Vehicle car = new Car();
    Vehicle bike = new Bike();
    car.start();
    bike.start();

}}
