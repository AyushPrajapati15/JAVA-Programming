import java.util.Scanner;

public class O2_HandlingExceptions {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=55;
        marks[1]=70;
        marks[2]=8;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index");
        int i=sc.nextInt();
        System.out.println("Enter thew number you want " +
                "to divide the value with");
        int num=sc.nextInt();
        try {
        System.out.println("the value of array index is: "+marks[i]);
        System.out.println("The value of array/number is: "+marks[i]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds" +
                    "Exception occurred");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception occurred");
            System.out.println(e);
        }

    }
}
