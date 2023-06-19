class Vehicle {
    protected String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}
class Car extends Vehicle {
    private int numOfDoors;
    public Car(String brand, int numOfDoors) {
        super(brand);
        this.numOfDoors = numOfDoors;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numOfDoors);
    }
}
public class O1_constrInInheritance  {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.displayInfo();
    }
}
