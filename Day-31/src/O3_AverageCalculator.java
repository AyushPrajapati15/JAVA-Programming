public class O3_AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        double average = calculateAverage(numbers);

        System.out.println("The average of the numbers is: " + average);
    }
}
