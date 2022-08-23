import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nisum {


    /*

    Joe to Everyone (5:53 PM)
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left to right.



Example:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: {2,3,7}
Explanation: The sum of elements
from 2nd position to 4th position
is 12.
     */

    List<Integer> targetMethod(List<Integer> integerList, Integer targetSum) {
        List<Integer> output = new ArrayList<>();
        boolean found = false;
        //Collections.sort(integerList);
        for (Integer i = 0; i < integerList.size(); i ++ ) {
            Integer cumsum = 0;
            cumsum = cumsum + integerList.get(i);
            for (Integer  j = i+1;  j < integerList.size(); j++) {
                cumsum = cumsum + integerList.get(j);
                //System.out.println(cumsum);
                if (cumsum < targetSum) {
                    continue;
                }
                if (cumsum == targetSum) {
                    output = integerList.subList(i, j+1);
                    found = true;
                    return output;
                }

                if (cumsum > targetSum) {
                    break;
                }
            }

        }
        return null;
    }


    public static void main(String [] args) {
        List lst = Arrays.asList(1,2,3,7,5);
        Integer targetSum = 12;
        List<Integer> output = new Nisum().targetMethod(lst, targetSum);
        System.out.println(output);
        




    }
}
