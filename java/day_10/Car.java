package day10.java;

public class Car {
     String car_name="Defender";
     int model=2022;
     void displayInfo()
     {
    	 System.out.println("car name is="+car_name);
    	 System.out.println("car model is="+model);
    	 
     }

	public static void main(String[] args) {
		Car c=new Car();
		c.displayInfo();
		

	}

}
