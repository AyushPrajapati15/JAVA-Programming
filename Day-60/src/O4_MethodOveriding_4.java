class A3{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B3 extends A3{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public  class O4_MethodOveriding_4{
    public static void main(String[] args) {
        A3 a = new A3();
        a.meth2();

        B3 b = new B3();
        b.meth2();
    }
}