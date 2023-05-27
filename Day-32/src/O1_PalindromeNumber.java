// A number is palindrome or not
public class O1_PalindromeNumber {
    public static boolean Palindrome(int n) {
        int originalNumber = n;
        int r = 0;

        while (n > 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n /= 10;
        }

        return originalNumber == r;
    }

    public static void main(String[] args) {

        int num1 = 12321;
        System.out.println(num1 + " is a palindrome number: " + Palindrome(num1));

        int num2 = 12345;
        System.out.println(num2 + " is a palindrome number: " + Palindrome(num2));
    }
}
