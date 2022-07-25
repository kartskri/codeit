package concurrency;

public class SynchornizedExchanger implements Runnable {

    protected int ctr = 0;

    public synchronized Integer getObject() {
        return this.ctr;
    }

    public void setObject(Integer object) {
        synchronized (this) {
            this.ctr = object;
        }
    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        SynchornizedExchanger runnable = new SynchornizedExchanger();
        Thread thread = new Thread(runnable, "The Thread");
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Stop Requested");
    }


}
