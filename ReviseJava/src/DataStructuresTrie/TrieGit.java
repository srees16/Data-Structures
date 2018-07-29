package DataStructuresTrie;

import java.util.*;

public class TrieGit { //TriesDS, TrieGit, TrieJavaBlog, TrieOracle, TrieProgCreek

	private class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root;
    
    public TrieGit() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current=root;
        for (int i=0;i<word.length();i++) {
            char c=word.charAt(i);
            TrieNode node=current.children.get(c);
            if(node==null) {
                node=new TrieNode();
                current.children.put(c, node);
            }
            current=node;
        }
        current.endOfWord=true;
    }

    public boolean search(String word) {
        TrieNode current=root;
        for (int i=0;i<word.length();i++) {
            char c=word.charAt(i);
            TrieNode node=current.children.get(c);
            if (node==null) {
                return false;
            }
            current=node;
        }
        return current.endOfWord;
    }

    public void delete(String word) {
        delete(root, word, 0);
    }

    private boolean delete(TrieNode current, String word, int index) {	//Returns true if parent should delete the mapping
        if(index==word.length()) {
            if(!current.endOfWord) {
                return false;
            }
            current.endOfWord=false;
            return current.children.size()==0; //if current has no other mapping then return true
        }
        char c=word.charAt(index);
        TrieNode node=current.children.get(c);
        if (node==null) {
            return false;
        }
        boolean shouldDeleteCurrentNode=delete(node,word,index + 1);
        if (shouldDeleteCurrentNode) {  //if true is returned then delete the mapping of character and trienode reference from map
            current.children.remove(c);
            return current.children.size()==0; //return true if no mappings are left in the map
        }
        return false;
    }
    
    public static void main(String[] args) {
		
		TrieGit trie=new TrieGit();
		trie.insert("hi");
		trie.insert("hello");
		trie.insert("hey");
		System.out.println(trie.search("hello"));
		trie.delete("hello");
		System.out.println(trie.search("hello"));
	}
}