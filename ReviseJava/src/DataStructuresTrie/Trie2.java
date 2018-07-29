package DataStructuresTrie;

public class Trie2 { //Do this or Trie class
	
	private static final int ALPHABET=26;
	private static TrieNode root;
	
	private static class TrieNode {
		boolean isEndOfWord;
		TrieNode children[]=new TrieNode[ALPHABET];
		TrieNode() {
			isEndOfWord=false;
			for(int i=0;i<ALPHABET;i++) {
				children[i]=null;
			}
		}
	}
	
	public static void insert(String word) {
		TrieNode tnode=root;
		for(int level=0;level<word.length();level++) {
			int index=word.charAt(level)-'a';
			if(tnode.children[index]==null)
				tnode.children[index]=new TrieNode();
				tnode=tnode.children[index];
			tnode.isEndOfWord=true;
		}
	}
	
	public static boolean search(String word) {
		TrieNode tnode=root;
		for(int level=0;level<word.length();level++) {
			int index=word.charAt(level)-'a';
			if(tnode.children[index]==null)
				return false;
			tnode=tnode.children[index];
		}
		return (tnode!=null && tnode.isEndOfWord);
	}
	
	public static void main (String [] args) {
		String keys[]={"the", "a", "there", "answer", "any", "by", "bye", "their"};
		String output[]={"Not present in Trie","Present in Trie"};
		root=new TrieNode();
		for(int i=0;i<keys.length;i++) {
			insert(keys[i]);
		}
		if(search("their")==true) {
			System.out.println("then----"+output[1]);
		} else {
			System.out.println("then----"+output[0]);
		}
	}
}