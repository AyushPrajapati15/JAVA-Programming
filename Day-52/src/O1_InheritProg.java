//Create a base class called Vehicle with the following attributes: make, model, and year. Include a parameterized constructor to initialize these attributes. Create a derived class called Car that inherits from Vehicle and has an additional attribute called color. Include a parameterized constructor in the Car class to initialize the attributes of both the Vehicle and Car classes. Write a Java program to create an object of the Car class and display its make, model, year, and color.
        class Vehicle {
            protected String make;
            protected String model;
            protected int year;
            public Vehicle(String make, String model, int year) {
                this.make = make;
                this.model = model;
                this.year = year;
            }
        }
        class Car extends Vehicle {
            private String color;
            public Car(String make, String model, int year, String color) {
                super(make, model, year);
                this.color = color;
            }
            public void displayInfo() {
                System.out.println("Make: " + make);
                System.out.println("Model: " + model);
                System.out.println("Year: " + year);
                System.out.println("Color: " + color);
            }
        }
public class O1_InheritProg {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2021, "Red");
        car.displayInfo();

    }
}