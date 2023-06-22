//rogram using super keyword
class aClass{
    int a;
    public int getA() {
        return a;
    }
    aClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class bClass extends aClass{ bClass(int c){ super(c);
    System.out.println("I am a constructor"); }
}
public class O2_Super {
    public static void main(String[] args) {
        aClass e = new aClass(65);
        bClass d = new bClass(5);
        System.out.println(e.getA());
    }
}