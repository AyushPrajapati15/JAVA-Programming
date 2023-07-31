class FactorialRecursiveThread extends Thread {
    private int number;
    private long result;
    public FactorialRecursiveThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        result = calculateFactorialRecursive(number);
    }
    public long getResult() {
        return result;
    }
    private long calculateFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorialRecursive(n - 1);
        }
    }
}
class FactorialIterativeThread extends Thread {
    private int number;
    private long result;

    public FactorialIterativeThread(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        result = calculateFactorialIterative(number);
    }
    public long getResult() {
        return result;
    }
    private long calculateFactorialIterative(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5;

        FactorialRecursiveThread recursiveThread = new FactorialRecursiveThread(number);
        FactorialIterativeThread iterativeThread = new FactorialIterativeThread(number);

        recursiveThread.start();
        iterativeThread.start();

        try {
            recursiveThread.join();
            iterativeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long recursiveResult = recursiveThread.getResult();
        long iterativeResult = iterativeThread.getResult();

        System.out.println("Factorial of " + number + " using recursive method: " + recursiveResult);
        System.out.println("Factorial of " + number + " using iterative method: " + iterativeResult);
    }
}
