class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " " +
                "and I am " + age + " years old.");
    }
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am a student. My name is " + name +
                " and I am " + age + " years old.");
    }
}

class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am a teacher. My name is " + name +
                " and I am " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        Teacher teacher = new Teacher("Bob", 35);

        student.introduce();
        teacher.introduce();
    }
}
