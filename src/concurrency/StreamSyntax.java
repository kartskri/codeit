package concurrency;

import java.util.Arrays;
import java.util.List;

public class StreamSyntax {

    private static long counter;

    private static void wasCalled() {
        counter++;
    }


    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc1", "abc2", "abc3");

        long size = list.stream().map(element -> {
            wasCalled();
            return element.substring(0, 3);
        }).skip(2).count();


    }
}
