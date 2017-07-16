package data_structures.arrays;

import java.util.ArrayList;

/**
 * Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.
 * Do it in place.
 */
public class ZeroMatrix {

    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        //rows
        int n = a.size();
        if(n == 0){
            return;
        }

        //cols
        int m = a.get(0).size();

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // check if we need to zero first row
        for(int j = 0; j < m; j++){
            if(a.get(0).get(j) == 0){
                firstRowZero = true;
                break;
            }
        }

        // check if we need to zero first col
        for(int i = 0; i < n; i++){
            if(a.get(i).get(0) == 0) {
                firstColZero = true;
                break;
            }
        }

        // mark rows and cols
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(a.get(i).get(j) == 0){
                    a.get(0).set(j, 0);
                    a.get(i).set(0, 0);
                }
            }
        }

        // zero rows and cols
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(a.get(i).get(0) == 0 || a.get(0).get(j) == 0){
                    a.get(i).set(j, 0);
                }
            }
        }

        if(firstColZero){
            for(int i = 0; i < a.size(); i++){
                a.get(i).set(0, 0);
            }
        }

        if(firstRowZero){
            for(int j = 0; j < a.get(0).size(); j++){
                a.get(0).set(j, 0);
            }
        }

    }

}
