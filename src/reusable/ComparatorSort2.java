package reusable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort2 {

    public static void main(String [] s) {
        List<Movie> movies = Arrays.asList(
                new Movie("Lord of the rings", 8.8),
                new Movie("Back to the future", 8.5),
                new Movie("Carlito's way", 7.9),
                new Movie("Pulp fiction", 8.9));

        Comparator<String> c = Comparator.comparing(String::toString);

        movies.sort(Comparator.comparing(Movie::getName));

        System.out.println(movies);


    }
}
