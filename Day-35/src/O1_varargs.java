public class O1_varargs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
    public static int sum(int i,int ...arr){
//        same as int [] arr;
        int result=i;
        for (int a: arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of nothing is :"+sum(2));
        System.out.println("The sum of 2 and 5 is :"+sum(2,5));
        System.out.println("The sum of 2,5,9 is :"+sum(2,5,9));
        System.out.println("The sum of 2,5,8,10 is :"+sum(2,5,8,10));
        System.out.println("The sum of 2,5,3,15,4 is :"+sum(2,5,3,15,4));
    }
}