//Fibonacci series
import java.util.Scanner;
public class O1_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int c=a+b;
        System.out.println("Enter the no of terms ");
        int n = sc.nextInt();
        System.out.println("The fibonacci series are ");
        System.out.println(a);
        for (int i=0;i<n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a);
        }
    }
}