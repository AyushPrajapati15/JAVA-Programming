//Creating a celphone class
class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Alice...");
    }

}
public class O2_cellPhone {
    public static void main(String[] args) {
        cellphone asus=new cellphone();
        asus.callFriend();
        asus.ringing();
        asus.vibrate();
    }
}
