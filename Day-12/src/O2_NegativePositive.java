// Program to check whether a number is negative, positive or zero
import java.util.Scanner;
public class O2_NegativePositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}