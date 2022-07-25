package concurrency;

public class LambdaRunnable {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName);
            System.out.println(threadName  + "Running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName  + "Finished");
        };
        Thread myThread = new Thread(runnable, "One");
        Thread myThread2 = new Thread(runnable, "Two");
        myThread.start();
        myThread2.start();
    }
}
