package DataStructuresTrie;

import java.util.*;

class TrieOracle { //TriesDS, TrieGit, TrieJavaBlog, TrieOracle, TrieProgCreek
	private TrieNodes root;
	
	TrieOracle() {
		root = new TrieNodes();
	}
   
/*
Adds a word to the Trie
*/
   private void addWord(String word) {
      root.addWord(word.toLowerCase());
   }
   
/*
Get the words in the Trie with the given prefix. Prefix a List containing String objects containing the words in the Trie with the given prefix.
*/
   private List getWords(String prefix) {
      //Find the node which represents the last letter of the prefix
      TrieNodes lastNode = root;
      for (int i=0; i<prefix.length(); i++)
      {
      lastNode = lastNode.getNode(prefix.charAt(i));
      
      //If no node matches, then no words exist, return empty list
      if (lastNode == null) return new ArrayList();      
      }
      
      //Return the words which eminate from the last node
      return lastNode.getWords();
   }
}

class TrieNodes {
   private TrieNodes parent;
   private TrieNodes[] children;
   private boolean isLeaf;     //Quick way to check if any children exist
   private boolean isWord;     //Does this node represent the last character of a word
   private char character;     //The character this node represents

/*
Constructor for top level root node.
*/
   TrieNodes() {
      children = new TrieNodes[26];
      isLeaf = true;
      isWord = false;
   }

   /**
    * Constructor for child node.
    */
   private TrieNodes(char character) {
      this();
      this.character = character;
   }
   
/*
Adds a word to this node. This method is called recursively and adds child nodes for each successive letter in the word, So recursive calls will be made with partial words.
*/
   protected void addWord(String word) {
      isLeaf = false;
      int charPos = word.charAt(0) - 'a';
      
      if (children[charPos] == null) {
    	  children[charPos] = new TrieNodes(word.charAt(0));
    	  children[charPos].parent = this;
      }
      if (word.length() > 1) {
    	  children[charPos].addWord(word.substring(1));
      } else {
    	  children[charPos].isWord = true;
      }
   }
   
/*
Returns the child TrieNode representing the given char, or null if no node exists.
*/
   protected TrieNodes getNode(char c) {
      return children[c - 'a'];
   }
   
/*
Returns a List of String objects which are lower in the hierarchy that this node
*/
   protected List getWords() {
      //Create a list to return
      List list = new ArrayList();
      
      //If this node represents a word, add it
      if (isWord) {
    	  list.add(toString());
      }
      
      //If any children
      if (!isLeaf) {
    	  for (int i=0; i<children.length; i++) //Add any words belonging to any children
      {
         if (children[i] != null) {
        	 list.add(children.length);
         }
     }
}
      return list; 
}
/*
Gets the String that this node represents. For example, if this node represents the character t, whose parent represents the charater a, whose parent represents the 
character c, then the String would be "cat".
*/

   public String toString() {
	   if (parent == null) {
		   return "";
	   } else {
		   return parent.toString() + new String(new char[] {character});
	   }
   }
}