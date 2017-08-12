package algorithms.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * <p>
 * 0 -> "0"
 * 1 -> "1"
 * 2 -> "abc"
 * 3 -> "def"
 * 4 -> "ghi"
 * 5 -> "jkl"
 * 7 -> "mno"
 * 8 -> "qrs"
 * 9 -> "wxyz"
 */
public class LetterPhone {

    public ArrayList<String> letterCombinations(String a) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        map.put(0, "0");

        ArrayList<String> result = new ArrayList<>();

        if (a == null || a.length() == 0)
            return result;

        ArrayList<Character> temp = new ArrayList<>();
        getString(a, temp, result, map);

        return result;
    }

    private void getString(String digits, ArrayList<Character> temp, ArrayList<String> result, Map<Integer, String> map) {
        if (digits.length() == 0) {
            char[] arr = new char[temp.size()];
            for (int i = 0; i < temp.size(); i++) {
                arr[i] = temp.get(i);
            }
            result.add(String.valueOf(arr));
            return;
        }

        Integer curr = Integer.valueOf(digits.substring(0, 1));
        String letters = map.get(curr);
        for (int i = 0; i < letters.length(); i++) {
            temp.add(letters.charAt(i));
            getString(digits.substring(1), temp, result, map);
            temp.remove(temp.size() - 1);
        }
    }

}
