public class O1_LargestNumber {
    public static int findLargestNumber(int[] arr) {
        if (arr.length == 0) {
            System.out.println("The array must have at least one element.");
        }

        int largestNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }

        return largestNumber;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int largestNumber = findLargestNumber(arr);

        System.out.println("Largest Number: " + largestNumber);
    }
}
