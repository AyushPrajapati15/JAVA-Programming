public class O3_SumOfArrayElements {
    public static void main(String[] args) {
                // Declare and initialize the array
                int[] numbers = { 5, 10, 15, 20, 25 };

                // Initialize sum variable
                int sum = 0;

                // Iterate over each element in the array and add it to the sum
                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                }

                // Print the sum
                System.out.println("Sum of all elements: " + sum);
            }
        }