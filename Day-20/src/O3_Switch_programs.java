import java.util.Scanner;
public class O3_Switch_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no ");
        int num1 = sc.nextInt() ;
        System.out.println("Enter 2nd no ");
        int num2 = sc.nextInt();
        String comparison;

        switch (Integer.compare(num1, num2)) {
            case -1:
                comparison = "smaller than";
                break;
            case 0:
                comparison = "equal to";
                break;
            case 1:
                comparison = "greater than";
                break;
            default:
                comparison = "invalid";
                break;
        }

        System.out.println("Number 1 is " + comparison + " Number 2");

    }
}
