//Calculator program
import java.util.Scanner;
public class O2_Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        float num1=sc.nextFloat();
        System.out.println("Enter second number");
        float num2=sc.nextFloat();
        System.out.println("Enter your choice: +,-,*,/ ");
        String ch = sc.next();
        float res;

        switch (ch){
            case "+":
                System.out.println("The sum of num1 and num2 is");
                res=num1+num2;
                System.out.println(res);
                break;
            case "-":
                System.out.println("The diff of num1 and num2 is");
                res=num1-num2;
                System.out.println(res);
                break;
            case "*":
                System.out.println("The mul of num1 and num2 is");
                res=num1*num2;
                System.out.println(res);
                break;
            case "/":
                System.out.println("The div of num1 and num2 is");
                res=num1/num2;
                System.out.println(res);
                break;
            default:
                System.out.println("Invalid operator");
        }


    }
}
