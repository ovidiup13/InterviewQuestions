package data_structures.strings;

import java.util.Arrays;


public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("    the sky     is blue"));
    }

    public static String reverse(String s){

        //split into word array
        String[] words = s.split("\\s+");

        //reverse array
        for(int i = 0, j = words.length - 1; i < j; i++, j--){
            String word = words[i];
            words[i] = words[j];
            words[j] = word;
        }

        //build the string
        StringBuilder sb = new StringBuilder();
        Arrays.stream(words).forEach(word -> {
            sb.append(word).append(" ");
        });

        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }

}
