//Sum of first n natural number
public class O3_SumOfNnumber {
    public static void sum(int n) {
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of first "+n+" numbers are " +sum);
    }
    public static void main(String[] args) {
        sum(3);
        sum(10);
        sum(25);
        sum(50);
    }
}
