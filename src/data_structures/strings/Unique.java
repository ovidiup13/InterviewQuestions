package data_structures.strings;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * Created by ovidi
 */
public class Unique {

    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        boolean isUnique = isUnique("abcdefghijklmnopqrstuvxyz");
        long stop1 = System.currentTimeMillis();

        System.out.println(stop1 - start1);

        long start2 = System.currentTimeMillis();
        boolean isUnique2 = isUnique("abcdefghijklmnopqrstuvxyz");
        long stop2 = System.currentTimeMillis();

        System.out.println(stop2 - start2);

    }

    private static boolean isUnique(String s) {

        Map<Character, Integer> chars = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (chars.containsKey(c)) {
                return false;
            }
            chars.putIfAbsent(c, 1);
        }

        return true;
    }

    private static boolean isUnique2(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                char c2 = s.charAt(j);
                if (c == c2) {
                    return false;
                }
            }
        }

        return true;
    }

}
