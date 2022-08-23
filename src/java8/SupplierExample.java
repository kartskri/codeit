package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String args[])
    {

        // This function returns a random value.
        Supplier<List<Integer>> randomValue = () -> {
            List<Integer> lst = Arrays.asList(new Integer[]{0,1,2,3,4});
            return lst;
        };

        // Print the random value using get()
        System.out.println(randomValue.get());
    }

}
