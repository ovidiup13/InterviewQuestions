package data_structures.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidateBST {

    // java.util.* has been imported for this problem.
// You don't need any other imports.

    public static boolean validateBSTItr(Node root) {

        List<Integer> inorder = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;

        while(node != null){
            stack.push(node);
            node = node.getLeft();
        }

        while(!stack.isEmpty()){

            Node current = stack.pop();

            //compare with last added
            if(!inorder.isEmpty() && current.getValue() < inorder.get(inorder.size() - 1)){
                return false;
            }

            inorder.add(current.getValue());

            if(current.getRight() != null){

                current = current.getRight();

                while(current != null){
                    stack.push(current);
                    current = current.getLeft();
                }
            }
        }

        return true;
    }

}
