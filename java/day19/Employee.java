package day19.java;

public class Employee {
	
	int id;
	String name;
	int salary;
	
	Employee(int id,String name1,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		Employee e=new Employee(45,"jagruti",5000);
		System.out.println("id is="+e.id);
		System.out.println("name is="+e.name);
		System.out.println("salary is="+e.salary);



	}

}
