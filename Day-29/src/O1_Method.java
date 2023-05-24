public class O1_Method {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
                    z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a =5,b=10;
        int a1=8,b1=2;
//        Method invocation using object creation
//        O1_Method obj=new O1_Method();
//         c= obj.logic(a,b);
        int c =logic(a,b);
        int c1 =logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}