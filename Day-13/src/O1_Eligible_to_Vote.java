import java.util.Scanner;
public class O1_Eligible_to_Vote {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your age: ");
                int age = scanner.nextInt();

                if (age >= 18) {
                    System.out.println("You are eligible to vote.");
                } else {
                    System.out.println("You are not eligible to vote yet.");
                }
            }
        }