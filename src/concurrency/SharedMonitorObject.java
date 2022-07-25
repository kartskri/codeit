package concurrency;

public class SharedMonitorObject {

    private Object monitor = null;
    private volatile int counter = 0;

    public SharedMonitorObject(Object monitor) {
        if (monitor == null) {
            throw new IllegalArgumentException(
                    "Monitor Object cannot be Null"
            );
        }
        this.monitor = monitor;
    }

    public void incCounter1() {
        synchronized (this.monitor) {
            this.counter++;
            System.out.println(monitor.toString() + " -- " + this.counter);
        }
    }

    public void incCounter() {
        this.counter++;
        System.out.println( this.counter);
    }

}
