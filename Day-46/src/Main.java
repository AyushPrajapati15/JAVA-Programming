class Car {
    private String make;
    private String model;
    private int year;
    private double mileage;

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public int calculateYearsSinceManufacture(int currentYear) {
        return currentYear - year;
    }
}
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Toyota");
        car1.setModel("Camry");
        car1.setYear(2018);
        car1.setMileage(50000);

        int currentYear = 2023;
        int yearsSinceManufacture = car1.calculateYearsSinceManufacture(currentYear);

        System.out.println("Car 1 Details:");
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1.getMileage());
        System.out.println("Years since Manufacture: " + yearsSinceManufacture);
    }
}
