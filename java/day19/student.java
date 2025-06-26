package day19.java;

public class student {
     String name;
     int Roll_no;
     String classroom;
     student()
     {
    	 System.out.println("default cinstructor is invoke");
     }
     student(int Roll_no,String name){
    	 this.Roll_no=Roll_no;
    	 this.name=name;
     }
     student(int Roll_no,String name,String classroom)
     {
    	 this.Roll_no=Roll_no;
    	 this.name=name;
    	 this.classroom=classroom;
     }
     void show() {
    	 System.out.println("Roll_no is="+Roll_no);
    	 System.out.println("name is="+name);
    	 System.out.println("classroom is="+classroom);
     }
	
	public static void main(String[] args) {
		student s=new student();
		student s1=new student(45,"jagruti");
		student s2=new student(46,"rohit","sycm-win");
		s.show();
		s1.show();
		s2.show();
	}

}
