// Thread priority
class O1_Priority extends Thread{
    public void run(){
        System.out.println("I'm thread : "
                +Thread.currentThread().getName());
        System.out.println("I'm thread :"
                +Thread.currentThread().getPriority());

    }
    public static void main(String [] args){
        O1_Priority t1=new O1_Priority();
        O1_Priority t2= new O1_Priority();
        t1.setPriority(Thread.MIN_PRIORITY);
        // setting priority of t1 thread to MIN_PRIORITY (1)
        t2.setPriority(Thread.MAX_PRIORITY);
        // setting priority of t2 thread to MAX_PRIORITY (10)
        t1.start();
        t2.start();
    }
}