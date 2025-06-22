package day2.java;

public class Employee {
   
    private String name;
    private int id;

   
    private static int employeeCount = 0;

    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; 
    }

   
    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);

        System.out.println("Total Employees: " + Employee.getEmployeeCount());
    }
}
