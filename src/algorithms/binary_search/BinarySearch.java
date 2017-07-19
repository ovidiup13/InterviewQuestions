package algorithms.binary_search;

import java.util.List;

public class BinarySearch {

    public int find(List<Integer> arr, int k) {

        int n = arr.size();
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int elem = arr.get(mid);

            if (elem == k) {
                return mid;
            } else if (elem < k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int recursiveFind(List<Integer> arr, int k, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;
        int elem = arr.get(mid);

        if (elem == k) {
            return mid;
        } else if (elem < k) {
            return recursiveFind(arr, k, low, mid - 1);
        }

        return recursiveFind(arr, k, mid + 1, high);
    }

}
