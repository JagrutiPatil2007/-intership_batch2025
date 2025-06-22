package day12.java;
class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    double area() {
        return length * width;
    }
    public static void main(String[] args) {
    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);
    System.out.println("Circle area: " + circle.area());
    System.out.println("Rectangle area: " + rectangle.area());
}
}
