package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String [] s) {

        StreamMap obj = new StreamMap();

        List<String> lst = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ",
                "Computer", "Science", "gfg");

        List<Integer> lst2 = lst.stream().map(n -> n.length()).collect(Collectors.toList());

        System.out.println(lst2);

    }

    public Integer increment(String a) {
        System.out.println(a.length());
        return a.length();
    }
}
