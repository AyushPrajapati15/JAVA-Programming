//Create a class Calculator,Sc calculator,Hybrid calculator
// and group them into a package
package calc;
class Calculator{
    public void calculate(int a, int b){
        System.out.println("Your result is : "+ a+b);
    }
}
class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is : "+ Math.sin(a+b));
    }
}
class HyCalculator{
    public void calculate(int a, int b){
        System.out.println("Your result is : "+ a+b);
        System.out.println("Your result is : "+ Math.sin(a+b));
    }
}
public class O1_PackageProblem {
    public static void main(String[] args) {
        System.out.println("I am main method");
        Calculator C=new Calculator();
        C.calculate(10,20);
        ScCalculator Sc = new ScCalculator();
        Sc.calculate(20,25);
        HyCalculator Hc=new HyCalculator();
        Hc.calculate(55,45);
    }
}