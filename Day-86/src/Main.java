// Package 

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating objects of different classes
        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(2, 5);


        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println();

        System.out.println("Cylinder:");
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());
    }
}
