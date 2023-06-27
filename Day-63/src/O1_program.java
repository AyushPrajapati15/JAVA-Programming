class Vehicle {
    public void drive() {
        System.out.println("Generic vehicle driving");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a motorcycle");
    }
}

class Truck extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }
}

public class O1_program {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle truck = new Truck();

        car.drive(); // Dynamic dispatch to Car's drive()
        motorcycle.drive(); // Dynamic dispatch to Motorcycle's drive()
        truck.drive(); // Dynamic dispatch to Truck's drive()
    }
}
