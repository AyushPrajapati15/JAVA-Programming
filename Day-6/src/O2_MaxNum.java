import java.util.Scanner;
public class O2_MaxNum {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter the first number: ");
                int num1 = input.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = input.nextInt();

                int max = (num1 > num2) ? num1 : num2;

                System.out.println("The maximum of the two numbers is: " + max);

    }

}
