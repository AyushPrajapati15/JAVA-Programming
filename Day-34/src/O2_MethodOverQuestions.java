public class O2_MethodOverQuestions {
    public static int add(int a, int b) {
        return a + b;
    }
    public static String add(String a, String b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int result1 = add(5, 10);
        System.out.println("Result of adding two integers: " + result1);

        String result2 = add("Hello", "World");
        System.out.println("Result of concatenating two strings: " + result2);

        int result3 = add(1, 2, 3);
        System.out.println("Result of adding three integers: " + result3);
    }
}