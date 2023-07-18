//package com.company;
class C2{
    public int x = 11;
    protected int y =22;
    int z = 33;
    private int a = 44;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class O2_access_modifiers {
    public static void main(String[] args) {
        C2 m = new C2();
//         m.meth1();
        System.out.println(m.x);
        System.out.println(m.y);
        System.out.println(m.z);
//         System.out.println(m.a);      a has private access
    }
}
