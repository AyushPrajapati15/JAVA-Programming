//Max of array
public class O2_MinArray {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3};
        int max = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}