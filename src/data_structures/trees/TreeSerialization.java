package data_structures.trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TreeSerialization {

    private static final String SPLITTER = ",";
    private static final String NULL_NODE = "N";

    public String serializeTree(Node root) {
        return buildString(new StringBuilder(), root).toString();
    }

    private StringBuilder buildString(StringBuilder sb, Node root) {
        if (root == null) {
            sb.append(NULL_NODE).append(SPLITTER);
            return sb;
        }

        sb.append(root.getValue()).append(SPLITTER);
        buildString(sb, root.getLeft());
        buildString(sb, root.getRight());

        return sb;
    }

    public Node restoreTree(String str) {
        return buildTree(new LinkedList<String>(Arrays.asList(str.split(SPLITTER))));
    }

    private Node buildTree(Queue<String> items) {
        String elem = items.poll();

        if (elem.equals(NULL_NODE)) {
            return null;
        }

        Node node = new Node(Integer.valueOf(elem));
        node.setLeft(buildTree(items));
        node.setRight(buildTree(items));

        return node;
    }

}
