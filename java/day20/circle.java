package day20.java;

public class circle {
	float radius;
	circle()
	{
		float radius=1.5f;
	}
	void display()
	{
		System.out.println("radius is:"+radius);
	}

	public static void main(String[] args) {
		circle c=new circle();
		c.display();

	}

}
