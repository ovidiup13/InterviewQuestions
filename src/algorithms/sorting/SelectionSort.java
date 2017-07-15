package algorithms.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelectionSort implements SortingAlgorithm {

    @Override
    public void sort(List<Integer> a) {

        int n = a.size();
        if(n == 0){
            return;
        }

        int minIndex;
        for(int i = 0; i < n - 1; i++){
            minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(a.get(j) < a.get(minIndex)){
                    minIndex = j;
                }
            }

            Common.swap(a, i, minIndex);
        }
    }


    public static void main(String[] args){
        int[] array = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48, 0};
        List<Integer> a = Arrays.stream(array).boxed().collect(Collectors.toList());

        SortingAlgorithm selectionSort = new SelectionSort();
        selectionSort.sort(a);

        Common.printList(a);
    }

}
