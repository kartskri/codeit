package concurrency;

public class StoppableRunnable implements Runnable {

    private boolean stopRequested = false;

    public synchronized void requestStop() {
        this.stopRequested = true;
    }

    public synchronized boolean isStopRequested() {
        return this.stopRequested;
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while (!isStopRequested()) {
            sleep(1000);
            System.out.println("---");
        }
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable, "The Thread");
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        stoppableRunnable.requestStop();
        System.out.println("Stop Requested");
    }
}
