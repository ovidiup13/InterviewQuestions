package data_structures.strings;

/**
 * Write a method to replace all spaces in a string with '%20: You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string.
 */
public class URLify {

    private static final char SPACE = ' ';

    public String URLify(char[] a) {

        if(a == null){
            return null;
        }

        int n = a.length;
        if(a[n - 1] == SPACE){
            do{
                n--;
            } while(n != 0 && a[n] == SPACE);
        }

        return null;
    }

}
