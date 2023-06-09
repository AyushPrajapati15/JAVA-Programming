 class Student {
    private String name;
    private int age;
    private int grade;
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
public class O1_StudentsDetails_obj_cls {
    public static void main(String[] args) {
        Student student1 = new Student("John Smith", 16, 10);
        Student student2 = new Student("Jane Doe", 15, 9);
        student1.displayInformation();
        System.out.println(); // Add a line break between student information
        student2.displayInformation();
    }
}