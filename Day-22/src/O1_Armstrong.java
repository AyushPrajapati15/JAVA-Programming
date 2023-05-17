//Armstrong number
public class O1_Armstrong {
    public static void main(String[] args) {
        for (int number = 1; number <= 500; number++) {
            int originalNumber = number;
            int sum = 0;

            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += Math.pow(digit, 3);
                originalNumber /= 10;
            }

            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}