public class O2_PowerCalculator {
    public static int calculatePowerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            throw new IllegalArgumentException("Exponent cannot be negative.");
        } else {
            return base * calculatePowerRecursive(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = calculatePowerRecursive(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

    }
}
