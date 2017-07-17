package data_structures.strings;


public class LongestPalindromicSubstring {

    //O(n^3) solution
    public String bruteForce(String a) {

        if (a == null) {
            return null;
        }

        int n = a.length();
        if (n <= 1) {
            return a;
        }

        // generate all substrings and keep track of max
        int maxLength = -1;
        String p = null;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                int length = 2 * i + j - 1;

                if (length < maxLength) {
                    continue;
                }

                String s = a.substring(i, i + j);

                if (isPalindrome(s) && maxLength < s.length()) {
                    maxLength = s.length();
                    p = s;
                }

            }
        }

        return p;
    }

    private boolean isPalindrome(String s) {
        int n = s.length();

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }

}
