package data_structures.tries;


@SuppressWarnings("WeakerAccess")
public class TrieNode {

    private Character character;
    private TrieNode[] children;
    private boolean isLeaf;
    private boolean isWord;

    public TrieNode(){
        this.children = new TrieNode[26];
    }

    public TrieNode(Character character){
        this.character = character;
        this.children = new TrieNode[26];
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public TrieNode[] getChildren() {
        return children;
    }
}
