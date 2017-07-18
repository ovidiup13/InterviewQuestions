package data_structures.pointers;

import java.util.ArrayList;

/**
 * Given n non-negative integers a1, a2, ..., an,
 * where each represents a point at coordinate (i, ai).
 * 'n' vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * <p>
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Your program should return an integer which corresponds to the maximum area of water that can be contained
 * ( Yes, we know maximum area instead of maximum volume sounds weird. But this is 2D plane we are working with for simplicity ).
 */
public class ContainerMostWater {

    public int maxArea(ArrayList<Integer> a) {

        int n = a.size();
        int max = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            max = Math.max(max, Math.min(a.get(left), a.get(right)) * (right - left));

            if (a.get(left) < a.get(right)) {
                left++;
            } else {
                right--;
            }

        }

        return max;
    }

}
