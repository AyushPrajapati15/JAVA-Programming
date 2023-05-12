import java.util.Scanner;
public class O1_StarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // sum of first 100 integer
        int i,sum=0;
        for (i=0;i<100;i++){
            sum=sum+i;
        }
        System.out.println("The sum of first 100 integer is "+sum);

        // triangle pattern
        int n,j;
        System.out.println("Enter the value of n ");
        n= sc.nextInt();
        for (i=0;i<=n;i++){
            for (j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}