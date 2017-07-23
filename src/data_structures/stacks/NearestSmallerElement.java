package data_structures.stacks;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Given an array, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.
 * <p>
 * Elements for which no smaller element exist, consider next smaller element as -1.
 */
public class NearestSmallerElement {

    public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {

        if (arr == null || arr.size() == 0) {
            return new ArrayList<>();
        }

        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (Integer e : arr) {

            while (!stack.isEmpty() && stack.peek() >= e) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }

            stack.push(e);
        }

        return result;
    }

}
