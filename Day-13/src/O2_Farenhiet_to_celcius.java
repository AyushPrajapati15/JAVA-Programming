import java.util.Scanner;
public class O2_Farenhiet_to_celcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");

        if (celsius < 0) {
            System.out.println("The temperature is below freezing point.");
        } else if (celsius >= 0 && celsius < 100) {
            System.out.println("The temperature is within the normal range.");
        } else {
            System.out.println("The temperature is above boiling point.");
        }

        scanner.close();
    }
}