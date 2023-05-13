// program to print sum of first n even number using while loop
import java.util.Scanner;
public class O1_Sum_of_n_even_nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum + 2*i;
            i++;
        }
        System.out.println("The sum of first "+n+" even number is "+sum);
    }
}