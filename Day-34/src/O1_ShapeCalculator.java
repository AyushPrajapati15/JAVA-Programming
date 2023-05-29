public class O1_ShapeCalculator {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double circleArea = calculateArea(2.5);
        System.out.println("Area of the circle: " + circleArea);

        double triangleArea = calculateArea(6, 4);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}
