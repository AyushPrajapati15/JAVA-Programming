import java.util.Scanner;
public class O1_TaxCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sal;
        float tax;
        System.out.println("Enter your salary");
        sal =sc.nextInt();
        if (sal<=250000){
            tax=0;
        } else if (sal>250000 && sal<=500000) {
            tax = (sal-250000)*0.05f;
        }else if (sal>500000 && sal<=1000000) {
            tax = 12500+(sal-500000)*0.2f;
        }else  {
            tax = 112500+(sal-250000)*0.3f;
        }
        float netSal=sal-tax;
        System.out.println("Your Net salary is"+ netSal);
        System.out.println("Your estimate tax is " + tax);
    }
}