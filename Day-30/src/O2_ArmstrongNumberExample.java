public class O2_ArmstrongNumberExample {
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == originalNumber;
    }
    public static void main(String[] args) {
        int num = 153;
        boolean result = isArmstrong(num);
        System.out.println(num + " is an Armstrong number? " + result);
    }
}