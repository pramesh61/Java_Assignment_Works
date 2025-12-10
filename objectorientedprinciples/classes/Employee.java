package objectorientedprinciples.classes;

public class Employee {
    // Fields
    String name;
    float salary;
    int id;

    // Constructor
    public Employee(String name, float salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    // Method to display details
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
