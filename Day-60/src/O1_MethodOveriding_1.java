//Method Overriding

class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B extends A{

}
public class O1_MethodOveriding_1{
    public static void main(String[] args) {
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();
    }
}
