package data_structures.stacks;

import java.util.Stack;

/**
 * Write a program to validate if the input string has redundant braces?
 * Return 0/1
 * 0 -> NO 1 -> YES
 * <p>
 * Input will be always a valid expression
 * <p>
 * and operators allowed are only + , * , - , /
 */
public class RedundantBraces {

    public int braces(String a) {

        if (a == null || a.length() == 0) {
            return 0;
        }

        int n = a.length();
        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = a.charAt(i);

            if (c == '+' || c == '/' || c == '*' || c == '-' || c == '(') {
                chars.push(c);
            } else if (c == ')') {
                if (chars.peek() == '(') {
                    return 1;
                }

                while (!chars.isEmpty() && chars.peek() != '(') {
                    chars.pop();
                }

                chars.pop();
            }
        }

        return 0;
    }

}
