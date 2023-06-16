//Create a base class called Animal with the following attributes: name and age. Include a parameterized constructor to initialize these attributes. Create a derived class called Dog that inherits from Animal and has an additional attribute called breed. Include a parameterized constructor in the Dog class to initialize the attributes of both the Animal and Dog classes. Write a Java program to create an object of the Dog class and display its name, age, and breed.
        class Animal {
            protected String name;
            protected int age;
            public Animal(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        class Dog extends Animal {
            private String breed;
            public Dog(String name, int age, String breed) {
                super(name, age);
                this.breed = breed;
            }
            public void displayInfo() {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Breed: " + breed);
            }
        }
        public class O2_InheritProg {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", 5, "Labrador");
        dog.displayInfo();
    }
}