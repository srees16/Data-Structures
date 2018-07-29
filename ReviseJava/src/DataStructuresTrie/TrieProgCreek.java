package DataStructuresTrie;

class TrieNodeSS { //No remove method, but can take Startswith method  //TriesDS, TrieGit, TrieJavaBlog, TrieOracle, TrieProgCreek
	
	TrieNodeSS[] arr;
    boolean isEnd;
    public TrieNodeSS() {
        this.arr = new TrieNodeSS[26];
    }
}
 
public class TrieProgCreek {
    private TrieNodeSS root;
 
    public TrieProgCreek() {
        root = new TrieNodeSS();
    }
 
    // Inserts a word into the trie.
    public void insert(String word) {
    	TrieNodeSS p = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(p.arr[index]==null){
            	TrieNodeSS temp = new TrieNodeSS();
                p.arr[index]=temp;
                p = temp;
            }else{
                p=p.arr[index];
            }
        }
        p.isEnd=true;
    }
 
    // Returns if the word is in the trie.
    public boolean search(String word) {
    	TrieNodeSS p = searchNode(word);
        if(p==null){
            return false;
        }else{
            if(p.isEnd)
                return true;
        }
 
        return false;
    }
 
    // Returns if there is any word in the trie that starts with the given prefix.
    public boolean startsWith(String prefix) {
    	TrieNodeSS p = searchNode(prefix);
        if(p==null){
            return false;
        }else{
            return true;
        }
    }
 
    public TrieNodeSS searchNode(String s){
    	TrieNodeSS p = root;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            int index = c-'a';
            if(p.arr[index]!=null){
                p = p.arr[index];
            }else{
                return null;
            }
        }
 
        if(p==root)
            return null;
 
        return p;
    }
}