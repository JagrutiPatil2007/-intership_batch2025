package Day11.java;
class Teacher {
    String name;
    String subject;

    Teacher(String n, String s) {
        name = n;
        subject = s;
    }
}

class MathTeacher extends Teacher{
	 int experienceYears;

	    MathTeacher(String n, String s, int y) {
	        super(n, s);
	        experienceYears = y;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Subject: " + subject);
	        System.out.println("Experience: " + experienceYears + " years");
	    }

	public static void main(String[] args) {
		MathTeacher mt = new MathTeacher("Sonia", "Mathematics", 10);
        mt.display();
		
	}

}
