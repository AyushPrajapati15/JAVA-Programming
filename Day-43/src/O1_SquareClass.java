//create a class square with a method to initialize its side, calculate area and perimeter
import java.util.Scanner;
class square{
    public int area(int n){
        return n*n;

    }
    public int perimeter(int n){
        return 4*n;
    }
}
public class O1_SquareClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        square sq=new square();
        System.out.println("Enter the side of the square: ");
        int n=sc.nextInt();
        int ar_ea=sq.area(n);
        int peri_meter=sq.perimeter(n);
        System.out.println("The area of square is: "+ar_ea);
        System.out.println("The perimeter of square is: "+peri_meter);

    }
}