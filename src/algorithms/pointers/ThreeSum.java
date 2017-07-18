package algorithms.pointers;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers.
 * <p>
 * Assume that there will only be one solution
 */
public class ThreeSum {

    public int threeSumClosest(ArrayList<Integer> a, int b) {

        if (a == null || a.size() == 0) {
            return 0;
        }

        int n = a.size();
        int diff = Integer.MAX_VALUE;
        int minSum = 0;

        Collections.sort(a);

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {

                int sum = a.get(i) + a.get(j) + a.get(k);

                int d = Math.abs(sum - b);

                if (d == 0) {
                    return sum;
                }

                if (diff > d) {
                    diff = d;
                    minSum = sum;
                }

                if (sum <= b) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return minSum;

    }

}
