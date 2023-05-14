import java.util.Scanner;
public class O2_PrimeNo{
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        System.out.println("Prime numbers between " + start + " and " + end + " are: ");

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
        }
    }
}

