package data_structures.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ovidi
 */
public class RotateMatrix {

    public static void main(String[] args) {

    }

    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();

        for(int i = 0; i < n / 2; i++){
            for(int j = 0; j < (n+1) / 2; j++){
                swap(a, i, j, n - 1 - i, j);
                swap(a, n - 1 - i, j, n - 1 - i, n - 1 - j);
                swap(a, n - 1 - i, n - 1 - j, i, n - 1 - j);
            }
        }

    }

    public static void swap(ArrayList<ArrayList<Integer>> a, int i1, int j1, int i2, int j2){
        int temp = a.get(i1).get(j1);
        a.get(i1).set(j1, a.get(i2).get(j2));
        a.get(i2).set(j2, temp);
    }
}
