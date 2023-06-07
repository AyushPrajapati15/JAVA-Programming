//create a class tommy_vercetti for rockstar game capable of hitting(print hitting) ,
// running(print running), firing(print firing).
class   tommy_vercetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class O3_Tommy {
    public static void main(String[] args) {
        tommy_vercetti player1=new tommy_vercetti();
        player1.hit();
        player1.run();
        player1.fire();
    }
}
