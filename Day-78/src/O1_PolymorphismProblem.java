//Create a class Tele Phone with ring(), lift() , and disconnected () methods
// as abstract methods. Create another class SmartTelephone and
// demonstrate polymorphism
abstract class telephone{
     abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends  telephone{
    void Camera(){
        System.out.println("Clicking photo..");
    }
    void wifi(){
        System.out.println("Wifi is on");
    }
    void hotspot(){
        System.out.println("Hotspot is on, no connected device");
    }
    @Override
    void ring(){
        System.out.println("Ringing...");
    }
    @Override
    void lift(){
        System.out.println("lifting...");
    }
    @Override
    void disconnect(){
        System.out.println("Disconnecting...");
    }
}
public class O1_PolymorphismProblem {
    public static void main(String[] args) {
        SmartTelephone smartphone =new SmartTelephone();
        smartphone.Camera();
        smartphone.hotspot();
        smartphone.wifi();
        telephone t1= new SmartTelephone();
        telephone t2= smartphone;
        t1.ring();
        t1.disconnect();;
        t2.lift();
    }
}