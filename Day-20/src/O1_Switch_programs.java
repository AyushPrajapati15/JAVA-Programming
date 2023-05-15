import java.util.Scanner;
public class O1_Switch_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage ");
        double percentage = sc.nextDouble();
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else {
            switch ((int) (percentage / 10)) {
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
                    break;
            }
        }
        System.out.println("Grade: " + grade);

    }
}
