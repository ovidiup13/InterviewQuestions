package data_structures.tries;


public class Trie implements Vocabulary{

    private TrieNode root;

    public Trie(){
        this.root = new TrieNode();
    }

    @Override
    public boolean contains(String word) {
        TrieNode node = search(word);
        return node != null && node.isWord();
    }

    @Override
    public void insert(String word) {
        TrieNode p = root;

        for(int i = 0; i < word.length(); i++){

            Character c = word.charAt(i);
            int index = c - 'a';
            TrieNode[] children = p.getChildren();

            if(children[index] == null){
                TrieNode node = new TrieNode(c);
                children[index] = node;
                p = node;
            } else {
                p = children[index];
            }
        }

        p.setLeaf(true);
        p.setWord(true);
    }

    @Override
    public boolean startsWith(String prefix) {
        return search(prefix) != null;
    }

    private TrieNode search(String word){
        TrieNode p = root;

        for(int i = 0; i < word.length(); i++){
            Character c = word.charAt(i);
            int index = c - 'a';
            TrieNode[] children = p.getChildren();

            if(children[index] == null){
                return null;
            } else {
                p = children[index];
            }
        }

        return p;
    }
}
