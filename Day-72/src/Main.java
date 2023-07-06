// Interface
interface Animal {
    void sound();
}

class Mammal implements Animal {
    @Override
    public void sound() {
        System.out.println("Mammal sound");
    }
}

class Dog extends Mammal implements Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog barks");
    }

    public void wagTail() {
        System.out.println("Dog is wagging its tail");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of Mammal and Dog
        Mammal mammal = new Mammal();
        Dog dog = new Dog();

        mammal.sound();

        dog.sound();
        dog.wagTail();
    }
}
