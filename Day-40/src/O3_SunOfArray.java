//recursive function to calculate the sum of elements in an integer array.
public class O3_SunOfArray {
    public static int sumOfArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumOfArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumOfArray(arr, 0);
        System.out.println("Sum of array elements: " + sum);
    }

}
