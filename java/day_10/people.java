package day10.java;
class Person{
	   int age=29;
	   String name="jagruti";
}
class Employee extends Person{
	int salary=5000;
}

public class people {

	public static void main(String[] args) {
	
		Employee e=new Employee();
		System.out.println("age is="+e.age);
		System.out.println("name is="+e.name);
		System.out.println("salary is="+e.salary);

		
	}

}
