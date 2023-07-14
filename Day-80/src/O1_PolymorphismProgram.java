//  Create a base class Shape with an abstract method calculateArea(). Create derived classes Circle and Rectangle that extend the Shape class and provide their own implementations of the calculateArea() method. Write a program that creates an array of Shape objects, including both Circle and Rectangle objects, and demonstrates polymorphism by calling the calculateArea() method on each object.
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class O1_PolymorphismProgram {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Circle(3.0);

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            System.out.println("Area: " + area);
        }
    }
}
