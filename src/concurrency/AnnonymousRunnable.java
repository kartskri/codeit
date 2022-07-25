package concurrency;

public class AnnonymousRunnable {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
                System.out.println("Finished");
            }
        };
        Thread myThread = new Thread(runnable);
        myThread.start();
    }
}
