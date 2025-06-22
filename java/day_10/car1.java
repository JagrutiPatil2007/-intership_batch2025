package day10.java;
class Vechicle{
	void accept() {
		 int type_no=2;
		 String type_name="car1";
		 System.out.println(" vechicle type_no:"+type_no);
		 System.out.println(" vechicle type_name:"+type_name);

		 
	}
}
class Bike extends Vechicle{
	void get() {
		int Bike_no=2007;
		String Bike_name="Bullet";
		System.out.println(" Bike_no:"+Bike_no);
	    System.out.println(" Bike_name:"+Bike_name);
	}
}

public class car1 extends Vechicle {

	public static void main(String[] args) {
		
			int car_no=2005;
			String car_name="Defender";
			System.out.println(" car_no:"+car_no);
			System.out.println(" car_name:"+car_name);
		    Bike b=new Bike();
		    b.accept();
		    b.get();
	   

}
}
