// program to find factorial of given number using for loop
import java.util.Scanner;
public class O2_Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        int fact=1;
        for (i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of "+n+" number is "+fact);
    }
}
