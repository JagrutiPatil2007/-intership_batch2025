package day20.java;

public class student {
	int id;
	int marks;
	String name;
    student(int id,int marks,String name){
    	this.id=id;
    	this.marks=marks;
    	this.name=name;
    	
    }
    void display() {
    	System.out.println("id is:"+id);
    	System.out.println("name is:"+name);
    	System.out.println("marks is:"+marks);
    }

	public static void main(String[] args) {
		student s=new student(4,99,"jagruti");
		s.display();

	}

}
