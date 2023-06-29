abstract class parent{
    public parent(){
        System.out.println("Constructor of base class");
    }
    public void sayhello(){
        System.out.println("Hello Alice");
    }
    abstract public void greet();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}
abstract class child2 extends parent{
    public void th(){
        System.out.println("i am good");
    }
}
public class O1_Abstract {
    public static void main(String[] args) {
//        parent p=new parent();
          child ch=new child();
//        child2 ch2=new child2();
        System.out.println();
    }
}
