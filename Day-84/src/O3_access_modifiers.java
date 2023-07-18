//package com.company;
class C3{
    public int x = 21;
    protected int y =31;
    int z = 41;
    private int a = 51;

}
class C4 extends C3{
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//        System.out.println(a);
    }
}
public class O3_access_modifiers {
    public static void main(String[] args) {
        C4 m = new C4();
         m.meth1();
    }
}
