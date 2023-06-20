class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
    public void draw() {
        System.out.println("Drawing a shape...");
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public void draw() {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }
}
public class O1_Program_1 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.draw();
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        rectangle.draw();
    }
}
