import java.util.Scanner;
public class O1_While_doWhile_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        //While loop
        while (i<=5){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish running while loop");

//        while (true){ //invalid statement infinite loop
//            System.out.println("I am infinite while loop");
//        }

//        program to print natural number from 100 to 110
        int n=100;
        while (n<=110){
            System.out.println(n);
            n++;
        }

//       do-while loop
        int a=0;
        do {
            System.out.println(a);
            a++;
        }while (a<5);

//      print first n natural number
        System.out.println("Enter a number till where you want to print");
        int j= sc.nextInt(),k=0;
        do {
            System.out.println(k);
            k++;
        }while (k<j);

    }
}