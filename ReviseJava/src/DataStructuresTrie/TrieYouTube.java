package DataStructuresTrie;

import java.util.*;

public class TrieYouTube {
	
	private class TrieNodeDS {
		Map<Character,TrieNodeDS> children;
		boolean endOfWord;
		public TrieNodeDS() {
			children=new HashMap<>();
			endOfWord=false;
		}
	}
	
	private static TrieNodeDS root;
	
	public TrieYouTube() {
		root=new TrieNodeDS();
	}
	
	public static void insert(String word) {
		TrieNodeDS current=root;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			TrieNodeDS node=current.children.get(ch);
			if(node==null) {
				node=new TrieNodeDS();
				current.children.put(ch, node);
			}
			current=node;
		}
		current.endOfWord=true;
	}
	
	public static boolean search(String word) {
		TrieNodeDS current=root;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			TrieNodeDS node=current.children.get(ch);
			if(node==null) {
				return false;
			}
			current=node;
		}
		return current.endOfWord;
	}

	private static boolean delete(TrieNodeDS current,String word,int index) {
		if(index==word.length()) {
			if(!current.endOfWord) {
				return false;
			}
			current.endOfWord=false;
			return current.children.size()==0;
		}
		char ch=word.charAt(index);
		TrieNodeDS node=current.children.get(ch);
		if(node==null) {
			return false;
		}
		boolean shouldDeleteCurrentNode=delete(node,word,index+1);
		if(shouldDeleteCurrentNode) {
			current.children.remove(ch);
			return current.children.size()==0;
		}
		return false;
	}
	
	public static void main (String [] args) {
		String keys[]={"the", "a", "there", "answer", "any", "by", "bye", "their"};						//Input keys (use only 'a' through 'z' and lower case)
		String output[]={"Not present in Trie","Present in Trie"};
		//root=new TrieNode();
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