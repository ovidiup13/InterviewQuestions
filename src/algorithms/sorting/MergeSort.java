package algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * // TODO: fix this
 */
public class MergeSort implements SortingAlgorithm {

    @Override
    public void sort(List<Integer> a) {
        mergeSort(a);
    }

    private void mergeSort(List<Integer> a) {
        int n = a.size();

        if(n == 0 || n == 1){
            return;
        }

        int k = (int) Math.floor(n/2);

        List<Integer> s1 = a.subList(0, k);
        List<Integer> s2 = a.subList(k, n);
        mergeSort(s1);
        mergeSort(s2);

        List<Integer> helper = new ArrayList<>(s1.size() + s2.size());
        merge(a, s1, k);
    }

    private void merge(List<Integer> original, List<Integer> helper, int mid){
        int n = helper.size();

        int left = 0, right = mid;
        int current = 0;
        while(left < mid && right < n){
            if(helper.get(left) <= helper.get(right)){
                original.set(current, helper.get(left));
                left++;
            } else {
                original.set(current, helper.get(right));
                right++;
            }
            current++;
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48, 0};
        List<Integer> a = Arrays.stream(array).boxed().collect(Collectors.toList());

        SortingAlgorithm mergeSort = new MergeSort();
        mergeSort.sort(a);

        Common.printList(a);
    }

}
