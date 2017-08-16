package data_structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public ArrayList<Integer> levelorder(Node root) {

        ArrayList<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            Node node = queue.poll();

            result.add(node.getValue());

            if(root.getLeft() != null){
                queue.add(root.getLeft());
            }

            if(root.getRight() != null){
                queue.add(root.getRight());
            }
        }

        return result;
    }

}
