//Create a base class called Employee with attributes name and salary. Include a parameterized constructor to initialize these attributes. Create a derived class called Manager that inherits from Employee and adds an attribute bonus. Include a parameterized constructor in the Manager class to initialize the attributes of both the Employee and Manager classes. Write a Java program to create an object of the Manager class, display the name, salary, and bonus of the manager, and calculate and display the total earnings (salary + bonus) of the manager.
class Employee {
    protected String name;
    protected double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
    public double calculateTotalEarnings() {
        return salary + bonus;
    }
}
public class O1_inheritanceProgram {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 5000, 2000);
        manager.displayInfo();
        double totalEarnings = manager.calculateTotalEarnings();
        System.out.println("Total Earnings: " + totalEarnings);
    }
}
