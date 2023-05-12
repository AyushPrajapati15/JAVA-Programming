//Box pattern
import  java.util.Scanner;
public class O3_BoxPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for (i=0;i<=n;i++){
            for (j=0;j<=n;j++){
                if (i==0||i==n||j==0||j==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
