class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }
    public void displayInfo() {
        System.out.println("Shape: " + name);
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Square extends Shape {
    private double side;
    public Square(String name, double side) {
        super(name);
        this.side = side;
    }
    public double calculateArea() {
        return side * side;
    }
    public double calculatePerimeter() {
        return 4 * side;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class O1_InheritanceProgram {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5.0);
        circle.displayInfo();
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        Square square = new Square("Square", 4.0);
        square.displayInfo();
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());

        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
