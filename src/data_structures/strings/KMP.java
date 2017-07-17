package data_structures.strings;

public class KMP {

    int find(String text, String pattern) {

        int[] border = createBorder(pattern);
        int t = 0;
        int p = 0;

        while (t < text.length() && p < pattern.length()) {
            if (text.charAt(t) == pattern.charAt(p)) {
                t++;
                p++;
            } else {
                if (p != 0) {
                    p = border[p - 1];
                } else {
                    t++;
                }
            }
        }

        if(p == pattern.length()){
            return t - pattern.length();
        }

        return -1;
    }

    private int[] createBorder(String pattern) {
        int n = pattern.length();
        int[] border = new int[n];
        int j = 0;

        // only increment i when necessary
        for (int i = 1; i < n; ) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                border[i] = j + 1;
                j++;
                i++;
            } else {
                if (j != 0) {
                    j = border[j - 1];
                } else {
                    border[i] = 0;
                    i++;
                }
            }
        }

        return border;
    }

    public static void main(String[] args) {

        KMP kmp = new KMP();
        String pattern = "abcdabca";
        String text = "abcdcabcdabxcaabcdabca";

        System.out.println(kmp.find(text, pattern));
    }

}
