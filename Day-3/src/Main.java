import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of 100");
        System.out.println("Enter your 1st marks");
        float marks1=sc.nextInt();
        System.out.println("Enter your 2nd marks");
        float marks2=sc.nextInt();
        System.out.println("Enter your 3rd marks");
        float marks3=sc.nextInt();
        System.out.println("Enter your 4th marks");
        float marks4=sc.nextInt();
        System.out.println("Enter your 5th marks");
        float marks5=sc.nextInt();
        float total= marks1+marks2+marks3+marks4+marks5;
        float percentage = (total/500)*100;
        System.out.println("Your Percentage is :");
        System.out.println(percentage);

    }
}