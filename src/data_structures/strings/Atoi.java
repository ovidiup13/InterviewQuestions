package data_structures.strings;

/**
 * Implement atoi to convert a string to an integer.
 */
public class Atoi {

    public int atoi(final String a) {

        if (a == null || a.length() < 1) {
            return 0;
        }

        int n = a.length();
        String trimmed = a.trim();

        int i = 0;
        char flag = '+';
        if (a.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (a.charAt(0) == '+') {
            i++;
        }

        double result = 0;

        while (i < n && a.charAt(i) >= '0' && a.charAt(i) <= '9') {
            result = (result * 10 + a.charAt(i) - '0');
            i++;
        }

        if (flag == '-') {
            result = -result;
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }

}
