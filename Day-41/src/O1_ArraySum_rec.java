// recursive function to calculate the sum of all elements in an integer array.
public class O1_ArraySum_rec {
        public static int arraySum(int[] arr, int index) {
            if (index < 0) {
                return 0;
            } else {
                return arr[index] + arraySum(arr, index - 1);
            }
        }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("The array contains: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        int sum = arraySum(array, array.length - 1);
        System.out.println("Sum: " + sum);
    }
    }