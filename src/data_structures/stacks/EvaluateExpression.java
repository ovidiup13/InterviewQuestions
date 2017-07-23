package data_structures.stacks;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {

    public int evalRPN(ArrayList<String> a) {

        if(a == null || a.size() == 0){
            return 0;
        }

        int n = a.size();

        Stack<Integer> stack = new Stack<>();

        for(String elem : a){

            if(!isOperand(elem)){
                stack.push(Integer.parseInt(elem));
                continue;
            }

            // operand found
            int op1 = stack.pop();
            int op2 = stack.pop();

            int result = applyOperation(op2, op1, elem);
            stack.push(result);
        }

        return stack.pop();
    }

    private int applyOperation(int a, int b, String op){
        switch(op){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
            default:
                return 0;
        }
    }

    private boolean isOperand(String s){
        return s.equals("*") || s.equals("/") || s.equals("-") || s.equals("+");
    }

}
