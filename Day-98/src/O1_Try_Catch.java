//Exception handling
import java.util.Scanner;

public  class O1_Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=1000;
        System.out.println("Enter the number you want to" +
                " divide with 1000");
        int b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Failed to divide");
            System.out.println(e);
        }
    }
}