package DataStructuresTrie;

import java.util.*;

public class TrieDS { //TriesDS, TrieGit, TrieJavaBlog, TrieOracle, TrieProgCreek

    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root;
    public TrieDS() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode node = current.children.get(c);
            if (node == null) {
                node = new TrieNode();
                current.children.put(c, node);
            }
            current = node;
        }
        current.endOfWord = true; //mark the current nodes endOfWord as true
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {	//if node does not exist for given char then return false
                return false;
            }
            current = node;
        }
        return current.endOfWord;	//return true of current's endOfWord is true else return false
    }
    
    //Delete word from trie.
    public void delete(String word) {
        delete(root, word, 0);
    }

    //Returns true if parent should delete the mapping
    private boolean delete(TrieNode current, String word, int index) {
        if (index == word.length()) {
            if (!current.endOfWord) {				//when end of word is reached only delete if currrent.endOfWord is true.
                return false;
            }
            current.endOfWord = false;
            return current.children.size() == 0;	//if current has no other mapping then return true
        }
        char c = word.charAt(index);
        TrieNode node = current.children.get(c);
        if (node == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(node, word, index + 1);
        if (shouldDeleteCurrentNode) { //if true is returned then delete the mapping of character and trienode reference from map
            current.children.remove(c);
            return current.children.size() == 0; //return true if no mappings are left in the map.
        }
        return false;
    }
}