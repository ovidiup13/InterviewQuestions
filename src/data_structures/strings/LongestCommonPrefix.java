package data_structures.strings;

import java.util.ArrayList;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
 * <p>
 * As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 * <p>
 * Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(ArrayList<String> a) {

        int n = a.size();
        if (n == 0) {
            return "";
        }

        int min = Integer.MAX_VALUE;

        // find min length
        for (String anA : a) {
            min = Math.min(anA.length(), min);
        }

        StringBuilder sb = new StringBuilder();

        // keep first element
        String s = a.get(0);

        // go through all chars in first element, from 0 to min length
        for (int i = 0; i < min; i++) {
            char c = s.charAt(i);

            // check next elements in array
            for (int j = 1; j < n; j++) {
                String next = a.get(j);
                if (next.charAt(i) != c) {
                    return sb.toString();
                }
            }

            // all elements have the same char in position i
            // add to sb, move to next char
            sb.append(c);
        }

        return sb.toString();
    }

}
