//Check whether a no is int or not
import java.util.Scanner;

public class O5_Check_No_Is_Integer_Or_Not {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
