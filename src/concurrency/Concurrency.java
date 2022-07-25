package concurrency;

public class Concurrency {

    public static void main(String[] s ) {

        MyThread threadBeginner = new MyThread();
        threadBeginner.start();
    }
}
