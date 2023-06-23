class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public void displayInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("Radius: " + this.radius);
    }
}
public class O2_SuperKeyProgram {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5.0);
        circle.displayInfo();
    }
}
