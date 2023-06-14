class Person {
    private String name;
    private int age;
    private String address;
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
public class O1_personInfo {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 25, "123 Main St");
        person1.displayInfo();
        Person person2 = new Person("John Doe", 25, "123 Main St");
        person2.displayInfo();
        Person person3 = new Person("John Doe", 25, "123 Main St");
        person3.displayInfo();
        Person person4 = new Person("John Doe", 25, "123 Main St");
        person4.displayInfo();
        Person person5 = new Person("John Doe", 25, "123 Main St");
        person5.displayInfo();
    }
}