package algorithms.sorting;

import java.util.List;


class Common {

    static void swap(List<Integer> a, int i, int j){
        if(i == j){
            return; // no swap
        }

        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }

    static void printList(List<Integer> a){
        a.forEach(i -> System.out.print(i + " "));
    }

}
