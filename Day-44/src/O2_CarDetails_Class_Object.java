// it prints the details of a car like color and year and km driven
class Car {
    String color;
    int year;
    int km=25000;

    void drive() {
        System.out.println("The car is driven "+km+" Km");
    }
}

public class O2_CarDetails_Class_Object {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.year = 2021;

        System.out.println("My car is " + myCar.color + " and it was built in " + myCar.year + ".");
        myCar.drive();
    }
}
