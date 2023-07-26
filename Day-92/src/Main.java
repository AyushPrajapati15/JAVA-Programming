//constructor in thread
class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank you");
    }
}

public class Main {
    public static void main(String[] args) {
        Mythr t1=new Mythr("Alice");
        Mythr t2 =new Mythr("Bob");
        t1.start();
        t2.start();
        System.out.println("The id of the thread " +
                "t1 is " + t1.getId());
        System.out.println("The name of the thread " +
                "t1 is "+t1.getName());
        System.out.println("The id of the thread " +
                "t2 is " + t2.getId());
        System.out.println("The name of the thread" +
                " t2 is "+t2.getName());
    }
}