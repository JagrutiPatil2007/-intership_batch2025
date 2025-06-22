package day12.java;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
   
    void makeSound() {
        System.out.println("Cat meows");
    }
    public static void main(String[] args) {
        
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.makeSound();
        a2.makeSound();

}
}
