package concurrency;

public class SharedMonitorObjectMain {

    public static void main(String[] args) {
        Object monitor1 = new Object();
        Object monitor2 = new Object();

        SharedMonitorObject smo1 = new SharedMonitorObject(monitor1);
        SharedMonitorObject smo2 = new SharedMonitorObject(monitor1);
        SharedMonitorObject smo3 = new SharedMonitorObject(monitor2);

        smo1.incCounter1();
        smo2.incCounter1();
        smo3.incCounter1();
        smo1.incCounter1();
        smo2.incCounter1();
        smo3.incCounter1();

    }
}
