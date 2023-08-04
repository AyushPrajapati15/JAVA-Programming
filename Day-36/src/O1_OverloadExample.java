// Define a class
public class O1_OverloadExample {
    static boolean printValue(int value) {
        System.out.println("Printing an integer value: " + value);
        return false;
    }
    static boolean printValue(double value) {
        System.out.println("Printing a double value: " + value);
        return false;
    }
    static boolean printValue(String value) {
        System.out.println("Printing a string value: " + value);
        return false;
    }
    public static void main(String[] args) {

        System.out.println(printValue(10));
        System.out.println(printValue(3.14));
        System.out.println(printValue("Hello"));
    }
}
