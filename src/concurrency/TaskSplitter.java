package concurrency;

import java.util.concurrent.*;

public class TaskSplitter implements Callable<String> {

    private final String param;

    public TaskSplitter(String param) {
        this.param = param;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Woken up " + Thread.currentThread().getName());
        return (param);
    }

    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(16);
        System.out.println("0");
        final Future<String> res1 = executorService.submit(new TaskSplitter("param1"));
        final Future<String> res2 = executorService.submit(new TaskSplitter("param2"));
        System.out.println("1");

        try {
            String obj1 = res1.get();
            String obj2 = res2.get();
            System.out.println(obj1 + " - " + obj2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}

