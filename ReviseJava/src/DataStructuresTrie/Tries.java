package DataStructuresTrie;

public class Tries {//Do this

	private static final int ALPHABET=26;		// Alphabet size (# of symbols)
	private static TrieNode root;
	
	private static class TrieNode {		// Trie node
		TrieNode children[]=new TrieNode[ALPHABET];
		boolean isEndOfWord;			//isEndOfWord is true if the node represents end of a word
		TrieNode() {
			isEndOfWord=false;
			for(int i=0;i<ALPHABET;i++) {
				children[i]=null;
			}
		}
	}

	private static void insert(String key) { // If not present, inserts key into trie if the key is prefix of trie node,just marks leaf node
		TrieNode t=root;
		for(int level=0;level<key.length();level++) {
			int index=key.charAt(level)-'a';	//a has value of 97,B=98-97=1, B takes index 1 in the array!
			if(t.children[index]==null)
				t.children[index]=new TrieNode();
				t=t.children[index];
			t.isEndOfWord=true;		//mark last node as leaf
		}
	}
	
	private static boolean search(String key) {// Returns true if key presents in trie, else false
		TrieNode tnode=root;
		for(int level=0;level<key.length();level++) {
			int index=key.charAt(level)-'a';
			if(tnode.children[index]==null)
				return false;
			tnode=tnode.children[index];
		}
		return (tnode!=null && tnode.isEndOfWord);
	}
	
	public static void main (String [] args) {
		String keys[]={"the", "a", "there", "answer", "any", "by", "bye", "their"};						//Input keys (use only 'a' through 'z' and lower case)
		String output[]={"Not present in Trie","Present in Trie"};
		root=new TrieNode();
		for(int i=0;i<keys.length;i++) {					//Construct trie
			insert(keys[i]);
		}
		if(search("their")==true) {						//Search for different keys
			System.out.println("then----"+output[1]);
		} else {
			System.out.println("then----"+output[0]);
		}
	}
}