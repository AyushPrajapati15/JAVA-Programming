class A1{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B1 extends A1{
    @Override
    public void meth1(){
        System.out.println("I am method 1 of class B");
    }


}
public class O2_MethodOveriding_2{
    public static void main(String[] args) {
        A1 a = new A1();
        a.meth1();

        B1 b = new B1();
        b.meth1();
    }
}