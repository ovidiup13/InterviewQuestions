package data_structures.trees;

public interface Tree {

    void insert(Node node);

    void delete(Node node);

    boolean isPresent(int value);
}
