//Thread using runnable interface
class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<10){
            System.out.println("I am a thread 1 not a threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run()
    {
        int i=0;
        while (i<10){
            System.out.println("I am a thread 2 not a threat 2");
            i++;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread g1 = new Thread(t1);

        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread g2 = new Thread(t2);

        g1.start();
        g2.start();
    }
}
