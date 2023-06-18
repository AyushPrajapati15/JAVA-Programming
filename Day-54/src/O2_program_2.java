//Create a base class called Person with attributes name and age. Include a parameterized constructor in the base class to initialize these attributes. Create a derived class called Student that inherits from Person and adds an attribute grade. Include a parameterized constructor in the Student class to initialize the attributes of both the Person and Student classes. Write a Java program to create an object of the Student class, display the name, age, and grade of the student.
class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person {
    private int grade;
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
public class O2_program_2{
    public static void main(String[] args) {
        Student student = new Student("John Doe", 15, 9);
        student.displayInfo();
    }
}
