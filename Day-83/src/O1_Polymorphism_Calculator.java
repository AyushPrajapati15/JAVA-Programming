// Calculator program using O1_Polymorphism
import  java.util.Scanner;
class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Base class calculation:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}

class AdditionCalculator extends Calculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("Addition calculation:");
        System.out.println("Addition: " + (a + b));
    }
}

class SubtractionCalculator extends Calculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("Subtraction calculation:");
        System.out.println("Subtraction: " + (a - b));
    }
}

class MultiplicationCalculator extends Calculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("Multiplication calculation:");
        System.out.println("Multiplication: " + (a * b));
    }
}

class DivisionCalculator extends Calculator {
    @Override
    public void calculate(int a, int b) {
        System.out.println("Division calculation:");
        System.out.println("Division: " + (a / b));
    }
}

public class O1_Polymorphism_Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        Calculator calc1 = new AdditionCalculator();

        calc1.calculate(a,b);

        Calculator calc2 = new SubtractionCalculator();
        calc2.calculate(a,b);

        Calculator calc3 = new MultiplicationCalculator();
        calc3.calculate(a,b);

        Calculator calc4 = new DivisionCalculator();
        calc4.calculate(a,b);
    }
}
