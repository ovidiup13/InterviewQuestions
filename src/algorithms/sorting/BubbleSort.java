package algorithms.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(List<Integer> a) {

        int n = a.size();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                if(a.get(j) > a.get(j + 1)){
                    Common.swap(a, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args){

        int[] array = new int[]{3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        List<Integer> a = Arrays.stream(array).boxed().collect(Collectors.toList());

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a);

        Common.printList(a);
    }
}