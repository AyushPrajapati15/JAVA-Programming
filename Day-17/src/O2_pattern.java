//* * * * *
//* * * *
//* * *
//* *
//*
import java.util.Scanner;
public class O2_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int i,j,n=sc.nextInt();
        for (i=n;i>0;i--){
            for (j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *
        for (i=0;i<n;i++){
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=n-1;i>0;i--){
            for (j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
