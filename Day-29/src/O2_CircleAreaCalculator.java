import java.util.Scanner;
public class O2_CircleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = calculateArea(radius);

        System.out.println("The area of the circle is: " + area);
    }
    public static double calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
