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


                 String name = "Alice";


        String nonTrimmedString = "     Alice     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('i', 'e'));
        System.out.println(name.replace("i", "ice"));

        System.out.println(name.startsWith("Ali"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(4));

        String modifiedName = "Aliceiceice";
        System.out.println(modifiedName.indexOf("ice"));
        System.out.println(modifiedName.indexOf("ice", 4));
        System.out.println(modifiedName.lastIndexOf("ice", 7));

        System.out.println(name.equals("Alice"));
        System.out.println(name.equalsIgnoreCase("AliCE"));

        System.out.println("I am escape sequence\'double quote\n");
        System.out.println("I am escape sequence\"double quote\n");
        System.out.println("I am escape sequence\\double quote\n");
        System.out.println("I am escape sequence\tdouble quote\n");
        System.out.println("I am escape sequence\bdouble quote\n");
        System.out.println("I am escape sequence\ndouble quote\n");
        System.out.println("I am escape sequence\rdouble quote\n");
        System.out.println("I am escape sequence\fdouble quote\n");

            }
}