class Person1 {
    String name;

    public Person1(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
    }
}

public class O3_ThisKeyProgram {
    public static void main(String[] args) {
        Person1 person = new Person1("John Doe");
        person.displayInfo();
    }
}
