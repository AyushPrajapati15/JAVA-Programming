//recursive function to determine if a given string is a palindrome
public class O2_PalindromeCheck_rec{
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);

            if (firstChar == lastChar) {
                String subStr = str.substring(1, str.length() - 1);
                return isPalindrome(subStr);
            } else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("The string is: "+str);
        boolean isPalindrome = isPalindrome(str);
        System.out.println("Is palindrome: " + isPalindrome);
    }
}