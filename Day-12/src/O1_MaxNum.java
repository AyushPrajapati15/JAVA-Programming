import java.util.Scanner;
public class O1_MaxNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Maximum of " + num1 + ", " + num2 + ", and " + num3 + " is " + max);
    }
}