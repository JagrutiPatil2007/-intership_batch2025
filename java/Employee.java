package day10.java;

public class Person
{
	void get() 
	{
	int age=22;
	String name="jagruti";
}
}
class People extends Person
{
	 int salary=50000;
	   void dispaly()
	   {
		    System.out.println("age is="+age);
		    System.out.println("name is ="+name);
		    System.out.println("salary is="+salary);
	   }

}
 class Employee 
 {
	  	
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.get();
		e.display();
	}

}
