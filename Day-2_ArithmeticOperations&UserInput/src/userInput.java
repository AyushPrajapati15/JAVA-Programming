import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();// it scans the 1st number from the user
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();// it scans the 2nd number from the user
        int sum = num1 +num2;
        System.out.println("The sum of num1 & num2 is");
        System.out.println(sum); // prints the sum
//        System.out.println("Enter the string you want to print");
//        String str = sc.nextLine();//used to print the entire string
//        System.out.println(str);
        System.out.println("Enter the string you want to print");
        String str1 = sc.next(); // next used to print the first word of a string
        System.out.println(str1);

}
}

