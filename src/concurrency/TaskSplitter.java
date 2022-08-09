package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class TaskSplitter implements Callable<String> {

    private final String param;

    public TaskSplitter(String param) {
        this.param = param;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(2000);
        System.out.println("Woken up " + Thread.currentThread().getName());
        return (param);
    }

    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(16);
        System.out.println("0");

        List<Future<String>> resLst = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            resLst.add(executorService.submit(new TaskSplitter("param" + (i + 1))));
        }

        try {
            for (int i = 0; i < 16; i++) {
                resLst.get(i).get();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}

