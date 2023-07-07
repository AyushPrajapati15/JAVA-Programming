interface Shape {
    void draw();
    double calculateArea();
}

abstract class AbstractShape implements Shape {
    protected String color;

    public AbstractShape(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " " + getClass().getSimpleName());    }
}

class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends AbstractShape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);


        circle.draw();
        double circleArea = circle.calculateArea();
        System.out.println("Circle Area: " + circleArea);


        rectangle.draw();
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}
