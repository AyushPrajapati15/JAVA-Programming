// getpriority(),setpriority(),getstate(),current thread
class th extends Thread {
    public void run() {
        System.out.println("Good morning");
    }
}

class thr extends Thread {
    public void run() {
            System.out.println("Welcome");
    }
}

public class O1_Threadproblems2 {
    public static void main(String[] args) {
        th t1 = new th();
        thr t2 = new thr();
        t1.start();
//        t2.start();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}