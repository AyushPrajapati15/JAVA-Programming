// multiplication table of n
public class O1_multiplication {
    public static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
//            System.out.format("%d x %d = %d",n,i,n-i);
        }
    }
    public static void main(String[] args) {
        multiplication(5);
        System.out.println();
        multiplication(8);
        System.out.println();
        multiplication(19);
    }
}