package algorithms.bit;

import java.util.List;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {

    public int singleNumber(final List<Integer> a) {

        int n = a.size();
        int sum = 0;

        for (Integer number : a) {
            sum ^= number;
        }

        return sum;
    }

}
