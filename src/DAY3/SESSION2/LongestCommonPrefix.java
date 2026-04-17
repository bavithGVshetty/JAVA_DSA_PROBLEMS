package DAY3.SESSION2;

class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }
}

public class LongestCommonPrefix {
    private TrieNode root;

    public LongestCommonPrefix() {
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
        node.isEnd = true;
    }

    public String lCP(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        for (String word : str) {
            insert(word);
        }
        StringBuilder sb = new StringBuilder();
        TrieNode node = root;
        while (true) {
            int count = 0;
            int index = -1;
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null) {
                    count++;
                    index = i;
                }
            }
            if (count != 1 || node.isEnd) {
                break;
            }
            sb.append((char) (index + 'a'));
            node = node.children[index];
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        LongestCommonPrefix trie = new LongestCommonPrefix();
        String[] input = { "flower", "flow", "flight" };
        System.out.println(trie.lCP(input));

    }

}
