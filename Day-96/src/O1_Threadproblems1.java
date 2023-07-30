//Wap to print "good morning" and "Welcome" continuously on the screen using
// threads and delay welcome execution by 100 ms and goodmorning by 150ms
class goodMorning extends Thread{
    public void  run(){
        while (true){
            try {
                Thread.sleep(150);
            }catch (Exception e){
                System.out.println(e);
            }
        System.out.println("Good morning");
        }
    }
}
class welcome extends Thread{
    public void  run() {
        while (true) {
            try {
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println(e);
            }

            System.out.println("Welcome");
        }
    }
}
public class O1_Threadproblems1 {
    public static void main(String[] args) {
        goodMorning t1 =new goodMorning();
        welcome t2=new welcome();
        t1.start( );
        t2.start();
    }
}