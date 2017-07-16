package data_structures.arrays;

import java.util.ArrayList;

/**
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.
 */
public class RearrangeArray {

    public void arrange(ArrayList<Integer> a) {

        int n = a.size();

        // increment each value by (arr[arr[i]] % n) * n
        // thus
        // old value = arr[i] % n
        // new value = arr[i] / n

        for(int i = 0; i < a.size(); i++){
            int val = (a.get(a.get(i)) % n) * n;
            a.set(i, a.get(i) + val);
        }

        for(int i = 0; i < a.size(); i++){
            a.set(i, a.get(i) / n);
        }
    }

}
