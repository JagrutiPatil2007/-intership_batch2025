package day19.java;

class Student1 {
    String name;
    int marks1, marks2, marks3;

    Student1(String name, int m1, int m2, int m3) {
        this.name = name;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void displayResult() {
        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("jagruti", 99, 99, 90);
        s1.displayResult();
    }
}