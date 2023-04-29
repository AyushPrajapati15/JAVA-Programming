import java.sql.SQLOutput;
import java.util.Scanner;

public class O4_Conversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Km");
        double km = sc.nextDouble();
        double miles = km/1.609344;
        System.out.println(miles);

    }
}
