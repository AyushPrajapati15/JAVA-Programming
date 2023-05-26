public class O1_VowelCounter {
    public static int countVowels(String input) {
        int count = 0;
        String lowercaseInput = input.toLowerCase();
        for (int i = 0; i < lowercaseInput.length(); i++) {
            char ch = lowercaseInput.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        int vowelCount = countVowels(input);

        System.out.println("Number of vowels in the input string: " + vowelCount);
    }
}