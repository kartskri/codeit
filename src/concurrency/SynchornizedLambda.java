package concurrency;

import java.util.function.Consumer;

public class SynchornizedLambda {

    private static Object object = null;

    public static synchronized void setObject(Object o) {
        object = o;
    }

    public static void consumeObject(Consumer consumer) {
        consumer.accept(object);
    }

    public static void main(String[] args) {
        consumeObject((obj) -> {
            synchronized (SynchornizedLambda.class) {
                System.out.println(obj);
            }
        });
    }
}
