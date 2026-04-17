package DAY3.SESSION1;

// Try Retrieval
class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26];
        isEndOfWord = false;
    }

}

public class TrieImplementaion {

    private TrieNode root;

    public TrieImplementaion() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    // Search
    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }

    public static void main(String[] cmd) {

        TrieImplementaion trie = new TrieImplementaion();

        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.startsWith("app"));

    }

}
