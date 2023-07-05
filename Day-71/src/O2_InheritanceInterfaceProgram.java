interface Vehicle {
    void start();
    void stop();
}

// Base class implementing the Vehicle interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Derived class extending the base class and implementing interface
class ElectricCar extends Car implements Vehicle {
    @Override
    public void start() {
        super.start();
        System.out.println("Electric car started");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Electric car stopped");
    }

    public void charge() {
        System.out.println("Electric car is charging");
    }
}

public class O2_InheritanceInterfaceProgram {
    public static void main(String[] args) {
        // Create objects of Car and ElectricCar
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        car.start();
        car.stop();

        electricCar.start();
        electricCar.stop();
        electricCar.charge();
    }
}
