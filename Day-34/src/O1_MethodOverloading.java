public class O1_MethodOverloading {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        int result1 = multiply(5, 10);
        System.out.println("Result of multiplying two numbers: " + result1);

        int result2 = multiply(2, 3, 4);
        System.out.println("Result of multiplying three numbers: " + result2);
    }
}