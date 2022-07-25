package concurrency;

public class DaemonThread {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Running -> " + i);
            }

        };

        Thread myThread = new Thread(r);
        myThread.setDaemon(true);
        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
