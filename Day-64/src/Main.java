class circle{
    circle(int r){
        radius=r;
        System.out.println("I am circle parameterized constructor");
    }
    public static int radius;
    public static double area() {
        return Math.PI * radius * radius;
    }
}
class cylinder extends circle{
    cylinder(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        height=h;
    }
    public static int height;
    public static double volume(){
        return Math.PI * radius * radius* height;
    }
}
public class Main {
    public static void main(String[] args) {
        circle objCir = new circle(5);
        cylinder objCy=new cylinder(5,2);
        System.out.println("The area of circle is "+ circle.area());
        System.out.println("The volume of cylinder is "+ cylinder.volume());
    }
}