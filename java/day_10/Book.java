package day10.java;

public class Book {
	String title;
    String author;
    Book( String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    void display()
    {
        System.out.println("title is: " + title);
        System.out.println("author is: " + author);
    }

	public static void main(String[] args) {
		Book b1=new Book("shyam chi aai","sane guruji");
		Book b2=new Book("agnipankh","A.P.J abdul kalam");
		
        b1.display();
        b2.display();
		
	}

}
