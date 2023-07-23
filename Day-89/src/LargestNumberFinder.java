public class LargestNumberFinder extends Thread {
    private int[] numbers;
    private int largest;

    public LargestNumberFinder(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
    }

    public int getLargest() {
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 45, 23 };
        LargestNumberFinder finder1 = new LargestNumberFinder(numbers);

        int[] numbers2 = { 34, 67, 18 };
        LargestNumberFinder finder2 = new LargestNumberFinder(numbers2);

        finder1.start();
        finder2.start();

        // Wait for both threads to complete
        try {
            finder1.join();
            finder2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int largestNumber1 = finder1.getLargest();
        int largestNumber2 = finder2.getLargest();

        System.out.println("Largest number in numbers array: " + largestNumber1);
        System.out.println("Largest number in numbers2 array: " + largestNumber2);

        // Find the overall largest number
        int[] overallNumbers = { largestNumber1, largestNumber2 };
        LargestNumberFinder overallFinder = new LargestNumberFinder(overallNumbers);
        overallFinder.start();
        try {
            overallFinder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int overallLargest = overallFinder.getLargest();
        System.out.println("Overall largest number: " + overallLargest);
    }
}
