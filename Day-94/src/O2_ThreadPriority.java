// Thread priority
class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    public void run(){
            System.out.println("Thank you: " +
                    this.getName());
    }
}
public class O2_ThreadPriority {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThread1 t1 = new MyThread1("Alice1");
        MyThread1 t2 = new MyThread1("Bob2");
        MyThread1 t3 = new MyThread1("Marry3");
        MyThread1 t4 = new MyThread1("Jack4");
        MyThread1 t5 = new MyThread1("Jerry5 " +
                "(most Important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
