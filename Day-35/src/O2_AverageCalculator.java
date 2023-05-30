public class O2_AverageCalculator {
    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            return 0.0; // Return 0 if no numbers are passed
        }

        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double average1 = calculateAverage(2.5, 4.8, 6.1);
        System.out.println("Average 1: " + average1); // Output: Average 1: 4.466666666666666

        double average2 = calculateAverage(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("Average 2: " + average2); // Output: Average 2: 3.0

        double average3 = calculateAverage(); // No arguments passed
        System.out.println("Average 3: " + average3); // Output: Average 3: 0.0
    }
}
