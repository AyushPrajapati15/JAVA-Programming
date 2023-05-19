//Min array
public class O3_MinArray {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 2, 10, 3};

        int min = numbers[0]; // Assume the first element is the minimum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The minimum element is: " + min);
    }
}