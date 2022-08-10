package reusable;

import java.util.*;

public class ComparatorSort2 {

    public static void main1(String [] s) {
        List<Movie> movies = Arrays.asList(
                new Movie("Lord of the rings", 8.8),
                new Movie("Back to the future", 8.5),
                new Movie("Carlito's way", 7.9),
                new Movie("Pulp fiction", 8.9));

        Comparator<String> c = Comparator.comparing(String::toString);

        movies.sort(Comparator.comparing(Movie::getName));

        System.out.println(movies);

        movies.forEach(System.out::println);
    }


    public static void main(String [] s) {
        Map<String, Integer> map = new TreeMap<>();

        // Inserting custom elements in the Map
        // using put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        System.out.println(entriesSortedByValues(map));

    }

    static <K,V extends Comparable<? super V>>
    SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
                new Comparator<Map.Entry<K,V>>() {
                    @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                        int res = e1.getValue().compareTo(e2.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
