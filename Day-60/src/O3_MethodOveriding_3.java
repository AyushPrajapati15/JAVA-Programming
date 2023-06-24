class A2{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B2 extends A2{
    @Override
    public void meth1(){
        System.out.println("I am method 1 of class B");
    }


}
public class O3_MethodOveriding_3{
    public static void main(String[] args) {
        A2 a = new A2();
        a.meth1();

        B2 b = new B2();
        b.meth1();
    }
}