package concurrency;

public class MyThread extends Thread {

    public void run() {
        System.out.println("Running");
        System.out.println("Finished");
    }

    public static void main(String [] args) {
        MyThread threadBeginner = new MyThread();
        threadBeginner.start();
    }
}
