//Create an abstract class Pen with methods write() and refill()
// as abstract method.Use the Pen Class to create a Concrete
// class fountain Pen with additional method change Nib()
abstract class Pen{
    abstract void write();
    abstract void refil();
}
class fountainPen extends Pen{
    @Override
    void write(){
        System.out.println("Writing");
    }
    @Override
    void refil(){
        System.out.println("Refilling");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}
public class O1_AbstractClass {
    public static void main(String[] args) {
        fountainPen pen= new fountainPen();
        pen.write();
        pen.refil();
        pen.changeNib();
    }
}