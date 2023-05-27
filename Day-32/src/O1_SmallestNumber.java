// Smallest among three number
public class O1_SmallestNumber{
    public static int findSmallest(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        return smallest;
    }

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        int number3 = 7;

        int smallestNumber = findSmallest(number1, number2, number3);
        System.out.println("The smallest number is: " + smallestNumber);
    }
}
