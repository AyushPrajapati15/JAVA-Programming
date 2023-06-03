// function to find the average of a set of numbers passed as arguments
public class O2_AverageCalculator {
    public static double calculateAverage(double... numbers) {
        int count = numbers.length;
        double sum = 0;

        for (double num : numbers) {
            sum += num;
        }

        double average = sum / count;
        return average;
    }

    public static void main(String[] args) {
        double avg = calculateAverage(4.5, 2.5, 6.5, 8.5, 1.5);
        System.out.println("Average: " + avg);
    }
}
