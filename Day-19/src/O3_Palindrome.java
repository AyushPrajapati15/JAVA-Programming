import java.util.Scanner;
public class O3_Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0,temp=0,rem;
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        temp=n;
        while (n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if (temp==sum){
            System.out.println("Palindrome number");
        }
        else
            System.out.println("Not a palindrome number");
    }
}
