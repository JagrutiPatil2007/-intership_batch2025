package day12.java;

interface Printable {
    void print();
}

class Document implements Printable {
   
    public void print() {
        System.out.println("Printing document...");
    }
}

class Photo implements Printable {
    
    public void print() {
        System.out.println("Printing photo...");
    }
    public static void main(String[] args) {
    Printable doc = new Document();
    Printable photo = new Photo();
    doc.print();
    photo.print();
}
}