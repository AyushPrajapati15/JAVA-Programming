class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}
class Employee extends Person1 {
    String employeeId;

    public Employee(String name, String employeeId) {
        super(name);
        this.employeeId = employeeId;
    }
}
public class O1_SuperKeyProgram {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "E12345");
        System.out.println("Name: " + employee.name);
        System.out.println("Employee ID: " + employee.employeeId);
    }
}

