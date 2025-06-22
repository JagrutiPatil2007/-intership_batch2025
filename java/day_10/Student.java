package day10.java;

public class Student {
	int age;
    String name;
    Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    void display()
    {
        System.out.println("Age is: " + age);
        System.out.println("Name is: " + name);
    }

	public static void main(String[] args)
	{
		
	        Student s = new Student(18, "Jagruti");
	        s.display();
	    }
	

	}


