//Create a superclass called Shape with a method calculateArea(). Create subclasses Circle, Rectangle, and Triangle that override the calculateArea() method to calculate and return the area of their respective shapes
class Shape {
    public void calculateArea() {
        System.out.println("Area calculation not defined for generic shape");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
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
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: " + area);
    }
}

public class O1_DynamicMemoryDispatch {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 8.0);

        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();
    }
}
