package data_structures.pointers;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by ovidi on 17/07/2017.
 */
public class RemoveDuplicates {

    public int removeDuplicates(ArrayList<Integer> a) {

        if(a == null){
            return 0;
        }

        int index = 1;
        for(int i = 1; i < a.size(); i++){
            if(a.get(i).intValue() != a.get(i - 1).intValue()){
                a.set(index, a.get(i));
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        RemoveDuplicates rm = new RemoveDuplicates();
        ArrayList<Integer> a = new ArrayList<Integer>() {{
            add(5000);
            add(5000);
            add(5000);
        }};

        System.out.println(rm.removeDuplicates(a));
    }

}
