package concurrency;

public class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Running");
        System.out.println("Finished");
    }

    public static void main(String [] args) {
        Thread threadBeginner = new Thread(new MyRunnable());
        threadBeginner.start();
    }
}
