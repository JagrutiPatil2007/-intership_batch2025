package day10.java;

public class Person
{    int age;
     String name;
   
	Person(int age,String name){
		this.age=age;
		this.name=name;
		
	}

}
class People extends Person
{
	 int salary=50000;
	   void display()
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
		People e=new People(22,"jagruti");
		e.display();
	}

}
