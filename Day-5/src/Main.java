// Operators
public class Main {
    public static void main(String[] args) {
        int i = 10;
        int j = 15 + i;
        int k = 15 - i;
        int l = 15 * i;
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        int a = 10;
        int b = 5;
        int c = 0;
        boolean d = true;
        boolean e = false;

        // Arithmetic Operators
        c = a + b;
        System.out.println("a + b = " + c);

        c = a - b;
        System.out.println("a - b = " + c);

        c = a * b;
        System.out.println("a * b = " + c);

        c = a / b;
        System.out.println("a / b = " + c);

        c = a % b;
        System.out.println("a % b = " + c);

        // Assignment Operators
        c = a;
        System.out.println("c = " + c);

        c += a;
        System.out.println("c += a = " + c);

        c -= a;
        System.out.println("c -= a = " + c);

        c *= a;
        System.out.println("c *= a = " + c);

        c /= a;
        System.out.println("c /= a = " + c);

        c %= a;
        System.out.println("c %= a = " + c);

        // Comparison Operators
        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }

        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a <= b");
        }

        if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a >= b");
        }

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

        if (a <= b) {
            System.out.println("a <= b");
        } else {
            System.out.println("a > b");
        }

        if (a != b) {
            System.out.println("a != b");
        } else {
            System.out.println("a == b");
        }

        // Logical Operators
        if (d && e) {
            System.out.println("d && e is true");
        } else {
            System.out.println("d && e is false");
        }

        if (d || e) {
            System.out.println("d || e is true");
        } else {
            System.out.println("d || e is false");
        }

        if (!(d && e)) {
            System.out.println("!(d && e) is true");
        } else {
            System.out.println("!(d && e) is false");
        }

        // Bitwise Operators
        c = a & b;
        System.out.println("a & b = " + c);

        c = a | b;
        System.out.println("a | b = " + c);

        c = a ^ b;
        System.out.println("a ^ b = " + c);

        c = ~a;
        System.out.println("~a = " + c);

        c = a << 2;
        System.out.println("a << 2 = " + c);

        c = a >> 2;
        System.out.println("a >> 2 = " + c);

        c = a >>> 2;
        System.out.println("a >>> 2 = " + c);
    }
}