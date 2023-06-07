//create a class rectangle with a method to initialize its length and breadth, calculate area and
// perimeter
import java.util.Scanner;
class rectangle{
        int l,b;
        public int area(int l, int b){
            return l*b;
        }
        public int perimeter   (int l, int b){
            return 2*(l+b);
        }
}
public class O2_RectangleClass {
    public static void main(String[] args) {
        rectangle rec=new rectangle();
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length=sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth=sc.nextInt();
        int ar_ea=rec.area(length,breadth);
        int peri_meter=rec.perimeter(length,breadth);
        System.out.println("The area of rectangle is: "+ar_ea);
        System.out.println("The perimeter of rectangle is: "+peri_meter);
    }
}
