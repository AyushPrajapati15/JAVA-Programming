//create a class circle with a method to initialize its radius, calculate area and perimeter
import java.util.Scanner;
class circle{
    double pi=3.14;
    public double area(double r){
        return pi*r*r;
    }
    public double perimeter(double r){
        return 2*pi*r;
    }
}
public class O4_CircleClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        circle cir=new circle();
        System.out.println("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        double ar_ea=cir.area(radius);
        double peri_meter=cir.perimeter(radius);
        System.out.println("The area of circle is: "+ar_ea);
        System.out.println("The perimeter of circle is: "+peri_meter);
    }
}
