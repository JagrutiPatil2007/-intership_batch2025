package day10.java;
 class Shape {
    void area() {
        System.out.println("Area method in base class.");
    }
}
 class Circle extends Shape {
	    double radius;

	    Circle(double r) {
	        radius = r;
	    }

	    void area() {
	        double result = Math.PI * radius * radius;
	        System.out.println("Area of Circle: " + result);
	    }
	}
public class Rectangle extends Shape{
	  double length, breadth;

	    Rectangle(double l, double b) {
	        length = l;
	        breadth = b;
	    }

	    void area() {
	        double result = length * breadth;
	        System.out.println("Area of Rectangle: " + result);
	    }

	public static void main(String[] args) {
		Circle c = new Circle(5.0);
        Rectangle r = new Rectangle(4.0, 6.0);

        c.area();
        r.area();
		
	}

}
