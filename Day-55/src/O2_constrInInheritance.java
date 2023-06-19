class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    private String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    public void sound() {
        System.out.println("Woof woof!");
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}
public class O2_constrInInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Laab", "Labrador Retriever");
        dog.displayInfo();
        dog.sound();
    }
}
