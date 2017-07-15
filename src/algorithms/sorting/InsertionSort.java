package algorithms.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertionSort implements SortingAlgorithm {

    @Override
    public void sort(List<Integer> a) {

        int n = a.size();

        for(int i = 1; i < n; i++){
            int j = i;
            while(j >= 1 && a.get(j) < a.get(j-1)){
                Common.swap(a, j, j-1);
                j--;
            }
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48, 0};
        List<Integer> a = Arrays.stream(array).boxed().collect(Collectors.toList());

        SortingAlgorithm insertionSort = new InsertionSort();
        insertionSort.sort(a);

        Common.printList(a);
    }


}
