// Program to check whether a year is a leap year or not
import java.util.Scanner;
public class O2_LeapOrNot {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = input.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }


