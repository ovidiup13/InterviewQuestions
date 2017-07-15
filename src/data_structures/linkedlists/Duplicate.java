package data_structures.linkedlists;

import java.util.LinkedList;

/**
 * Created by ovidi
 */
public class Duplicate {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("6");
        list.add("1");
        list.add("9");
        list.add("1");

        list = removeDuplicates(list);
    }

    private static LinkedList<String> removeDuplicates(LinkedList<String> list){

        return null;
    }

}
