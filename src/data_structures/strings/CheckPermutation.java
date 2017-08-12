package data_structures.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, write a method that checks if one string is a permutation of the other.
 */
public class CheckPermutation {

    /**
     * O(n) time, O(n) space; where n is the length of the strings
     */
    boolean checkPermutation(String a, String b) {

        if (a == null || b == null) {
            throw new NullPointerException();
        }

        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> frequencies = getFrequency(a);

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);

            if (frequencies.containsKey(c)) {
                int count = frequencies.get(c);
                if (count == 0) {
                    return false;
                }

                frequencies.replace(c, count - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    private Map<Character, Integer> getFrequency(String a) {
        if (a == null) {
            return null;
        }

        Map<Character, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (frequencies.containsKey(c)) {
                frequencies.replace(c, frequencies.get(c) + 1);
                continue;
            }

            frequencies.put(c, 1);
        }

        return frequencies;
    }

}
