//Create a base class called Animal with a method makeSound() that prints a generic sound. Create derived classes Dog, Cat, and Cow that inherit from the Animal class. Implement the makeSound() method in each derived class to print the specific sound of the animal. Write a Java program to create objects of the Dog, Cat, and Cow classes, call the makeSound() method for each object, and display the sounds produced by the animals.
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow moos");
    }
}
public class O2_inheritanceProgram  {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
