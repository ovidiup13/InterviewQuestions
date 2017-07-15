package data_structures.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ovidi5
 */
public class PrettyJson {

    private static final char CURLY_BRACKET_INNER = '{';
    private static final char CURLY_BRACKET_OUTER = '}';
    private static final char BRACKET_INNER = '[';
    private static final char BRACKET_OUTER = ']';

    private static final char COMMA = ',';
    private static final char TAB = '\t';

    public static void main(String[] args) {
        String s = "{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}";
        prettyJSON(s).forEach(System.out::println);
    }

    public static ArrayList<String> prettyJSON(String a) {

        ArrayList<String> result = new ArrayList<>();

        StringBuilder indentation = new StringBuilder();
        StringBuilder buffer = new StringBuilder();

        //go through each character
        char[] chars = a.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];

            if (c == CURLY_BRACKET_INNER || c == BRACKET_INNER) {
                //print out current buffer and reset
                if(buffer.length() != 0){
                    result.add(buffer.toString());
                    buffer.setLength(0);
                }

                //print out current char
                buffer.append(indentation.toString()).append(c);
                result.add(buffer.toString());
                buffer.setLength(0);

                indentation.append(TAB);
            } else if (c == CURLY_BRACKET_OUTER || c == BRACKET_OUTER) {
                if(buffer.length() != 0){
                    result.add(buffer.toString());
                    buffer.setLength(0);
                }

                //remove last tab
                if (indentation.length() > 0) {
                    indentation.setLength(indentation.length() - 1);
                }

                buffer.append(indentation.toString()).append(c);
                if(i < chars.length - 1 && chars[i+1] == COMMA){
                    buffer.append(COMMA);
                    i++;
                }
                result.add(buffer.toString());
                buffer.setLength(0);

            } else if(c == COMMA){
                //print out current buffer and reset
                buffer.append(c);
                result.add(buffer.toString());
                buffer.setLength(0);
            }
            else if(!Character.isWhitespace(c)) {
                if(buffer.length() == 0){
                    buffer.append(indentation.toString());
                }
                buffer.append(c);
            }

        }

        return result;
    }

}
