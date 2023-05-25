public class O3_FibonacciExample {
    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
    public static void main(String[] args) {
        int num = 7;
        for (int i = 0; i <= num; i++) {
            int result = fibonacci(i);
            System.out.print(result + " ");
        }
    }
}