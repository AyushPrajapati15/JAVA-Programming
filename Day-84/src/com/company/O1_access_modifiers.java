package com.company;
class C1{
    public int x = 10;
    protected int y =20;
    int z = 30;
    private int a = 40;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class O1_access_modifiers {
    public static void main(String[] args) {
        C1 c = new C1();
         c.meth1();
    }
}
