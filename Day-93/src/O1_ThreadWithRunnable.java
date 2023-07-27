class RunnableTask implements Runnable {
    private String threadName;

    public RunnableTask(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + " - Number: " + i);
        }
    }
}

public class O1_ThreadWithRunnable {
    public static void main(String[] args) {
        // Create three Runnable objects
        RunnableTask task1 = new RunnableTask("Thread 1");
        RunnableTask task2 = new RunnableTask("Thread 2");
        RunnableTask task3 = new RunnableTask("Thread 3");


        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);


        thread1.start();
        thread2.start();
        thread3.start();
    }
}

