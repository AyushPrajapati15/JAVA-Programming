//Fibonacci Series: Write a recursive function to print the Fibonacci series up to a given number.
public class O1_Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printFibonacciSeries(int count)  {
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        int count = 10;
        System.out.println("Fibonacci Series:");
        printFibonacciSeries(count);
    }
}