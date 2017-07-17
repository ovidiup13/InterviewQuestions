package data_structures.tries;


public interface Vocabulary {

    boolean contains(String word);

    void insert(String word);

    boolean startsWith(String prefix);
}
