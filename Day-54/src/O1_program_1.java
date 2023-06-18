//Create a base class called Shape with a method calculateArea() that returns the area of the shape. Create derived classes Rectangle and Triangle that inherit from the Shape class. Implement the calculateArea() method in each derived class to calculate and return the area of the rectangle and triangle, respectively. Write a Java program to create objects of the Rectangle and Triangle classes, call the calculateArea() method for each object, and display the calculated areas.
class Shape {
    public double calculateArea() {
        return 0;
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
    public double calculateArea() {
        return length * width;
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
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
public class O1_program_1{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 6);
        double rectangleArea = rectangle.calculateArea();
        double triangleArea = triangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Triangle Area: " + triangleArea);
    }
}
