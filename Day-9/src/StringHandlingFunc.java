import java.util.Scanner;
public class StringHandlingFunc {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String str = input.nextLine();

                // Length of the string
                int length = str.length();
                System.out.println("Length of the string: " + length);

                // Convert to uppercase
                String upper = str.toUpperCase();
                System.out.println("Uppercase string: " + upper);

                // Convert to lowercase
                String lower = str.toLowerCase();
                System.out.println("Lowercase string: " + lower);

                // Trim leading and trailing whitespace
                String trimmed = str.trim();
                System.out.println("Trimmed string: " + trimmed);

                // Check if string starts with a given prefix
                System.out.print("Enter a prefix: ");
                String prefix = input.nextLine();
                boolean startsWith = str.startsWith(prefix);
                System.out.println("String starts with " + prefix + ": " + startsWith);

                // Check if string ends with a given suffix
                System.out.print("Enter a suffix: ");
                String suffix = input.nextLine();
                boolean endsWith = str.endsWith(suffix);
                System.out.println("String ends with " + suffix + ": " + endsWith);
            }
}