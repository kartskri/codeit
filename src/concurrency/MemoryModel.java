package concurrency;

public class MemoryModel {

    public static void main(String[] args) {
        Runnable runnable = new MMThread();

        Thread thread1 = new Thread(runnable, "Thread 1");
        Thread thread2 = new Thread(runnable, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
class MMThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            synchronized (this) {
                ctr++;
            }
        }

        System.out.println(Thread.currentThread().getName() + " --- " + ctr);
    }

    int ctr = 0;


}