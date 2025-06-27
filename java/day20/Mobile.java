package day20.java;

public class Mobile {
	String brand;
	int price;
	 public Mobile()
	{
		 brand="redmi 12";
		 price=12000;
	}
	void display() {
		System.out.println("brand is:"+brand);
	    System.out.println("price is:"+price);
	
	}

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.display();

	}

}
