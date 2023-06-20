class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    private int employeeId;

    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
    }
}

public class O2_Program_2 {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 12345);
        employee.displayInfo();
    }
}
