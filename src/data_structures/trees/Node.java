package data_structures.trees;

public class Node {

    private int value;
    private Node parent;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    private boolean hasLeft() {
        return left != null;
    }

    private boolean hasRight() {
        return right != null;
    }

    private boolean isRoot() {
        return parent == null;
    }

    private boolean isLeaf() {
        return right == null && left == null;
    }

    private boolean isInternal() {
        return right != null || left != null;
    }

    public boolean isLeftChild() {
        return parent.getLeft() == this;
    }

    public boolean isRightChild() {
        return parent.getRight() == this;
    }

}
