// Define a class
public class O2_OverloadExample2 {
    static boolean sum(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
        return false;
    }
    static boolean sum(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
        return false;
    }
    void sum(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
    public static void main(String[] args) {

        System.out.println(sum(5, 10));
        System.out.println(sum(2, 4, 6));
        System.out.println(sum((int) 2.5, (int) 3.7));
    }
}

