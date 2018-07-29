package HackerRankExcercises;

import java.util.*;

public class Tries2 {
	
	public static void main (String[] args) {
		final List<String> setOfStrings=new ArrayList<>();
		setOfStrings.add("pqrs");
		setOfStrings.add("pprs");
		setOfStrings.add("psst");
		setOfStrings.add("qqrs");
		setOfStrings.add("pqrs");
		
		Trie trie=new Trie();
		setOfStrings.forEach(trie::insert);
		System.out.println(trie.query("qqrs"));
		System.out.println(trie.query("bac"));
		//trie.update("qqrs", "oops");
		trie.delete("qqrs");
		System.out.println(trie.query("qqrs"));
	}
}
	class Trie {
		
		final TrieNode root;
		
		public Trie() {
			this.root=new TrieNode();
		}
		
		public int query(final String s) {
			TrieNode current=root;
			for(int i=0;i<s.length();i++) {
				if(current==null) {
					return 0;
				}
				current.next(s.charAt(i));
			}
			return current.terminating;
		}
		
		public void insert(final String s) {
			TrieNode current=root;
			for(int i=0;i<s.length();i++) {
				if(current.trieNodes[s.charAt(i)-'a']==null) {
					current.trieNodes[s.charAt(i)-'a']=new TrieNode();
				}
				current.next(s.charAt(i));
			}
			current.terminating++;
		}
		
		public void delete(final String s) {
			TrieNode current=root;
			for(int i=0;i<s.length();i++) {
				if(current==null) {
					throw new RuntimeException();
				}
				current.next(s.charAt(i));
			}
			if(current.terminating!=0) {
				current.terminating--;
			} else {
				throw new RuntimeException();
			}
		}
		
		public void update(final String old,final String newString) {
			delete(old);
			insert(newString);
		}
	
	class TrieNode {
		int terminating;
		final TrieNode trieNodes[]=new TrieNode[26];
		
		public TrieNode next(final char c) {
			return trieNodes[c-'a'];
			}
		}
	}
