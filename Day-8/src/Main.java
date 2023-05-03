import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=6;
        float b = 5.555f;
        System.out.println(a);
        System.out.printf("the value of a is %d and b is %f",a,b);
        System.out.format("the value of a is %d and b is %f",a,b);
        System.out.print("\nEnter a string: ");
        String input = scanner.nextLine();

        if(input.contains("java")) {
            System.out.println("The string contains the word \"java\".");
        } else {
            System.out.println("The string does not contain the word \"java\".");
        }
    }
}
