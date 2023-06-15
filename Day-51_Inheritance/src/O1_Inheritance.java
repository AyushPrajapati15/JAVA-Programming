// Shape class
class Shape {
    public double calculateArea() {
        return 0.0;
    }
}


// Rectangle class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


// Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to demonstrate the usage
public class O1_Inheritance {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Circle circle = new Circle(3.0);
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
