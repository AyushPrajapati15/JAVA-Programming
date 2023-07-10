interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();

        cat.makeSound();

        Animal[] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = cat;

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
