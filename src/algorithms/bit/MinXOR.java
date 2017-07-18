package algorithms.bit;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an array of N integers, find the pair of integers in the array which have minimum XOR value.
 * Report the minimum XOR value.
 */
public class MinXOR {

    public int findMinXor(ArrayList<Integer> A) {

        int n = A.size();
        Collections.sort(A);

        int minXOR = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            minXOR = Math.min(minXOR, A.get(i) ^ A.get(i - 1));
        }

        return minXOR;

    }

}
