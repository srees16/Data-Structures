package DataStructuresTrie;

import java.util.*;

public class TrieJavaBlog {//Same as TrieSanfoundry  //TriesDS, TrieGit, TrieJavaBlog, TrieOracle, TrieProgCreek
	
	private class Trienode {
	    char data; 
	    boolean isEnd; 
	    int count;  
	    LinkedList<Trienode> childList; 
	 
	    public Trienode(char c) {
	        childList=new LinkedList<>();
	        isEnd=false;
	        data=c;
	        count=0;
	    }  
	    
	    public Trienode getChild(char c) {
	        if(childList!=null) {
	        	for(Trienode eachChild:childList) {
	        		if(eachChild.data == c) {
	        			return eachChild;
	        		}   
	        	}
	        }
	        return null;
	    }
	}

	private Trienode root;

    public TrieJavaBlog() {
        root = new Trienode(' '); 
    }
    
    public void insert(String word) {
        if (search(word) == true)
            return;        
        Trienode current = root; 
        for(char c:word.toCharArray()) {
        	Trienode child = current.getChild(c);
            if (child!=null)
                current=child;
            else {
            	current.childList.add(new Trienode(c)); //If child not present, adding it io the list
                current = current.getChild(c);
            }
            current.count++;
        }
        current.isEnd = true;
    }
    
    public boolean search(String word) {
    	Trienode current = root;  
        for (char ch : word.toCharArray()) {
            if (current.getChild(ch) == null)
                return false;
            else
                current = current.getChild(ch);
        }
        if (current.isEnd == true) 
            return true;
        return false;
    }
    
    public void remove(String word) {
        if (search(word)==false) {
            System.out.println(word +" is not present in Trie");
            return;
        }             
        Trienode current = root;
        for (char ch : word.toCharArray()) { 
        	Trienode child = current.getChild(ch);
            if (child.count == 1) {
                current.childList.remove(child);
                return;
            }
            else {
                child.count--;
                current = child;
            }
        }
        current.isEnd = false;
    }
  
    public static void printAllWordsInTrie(Trienode root,String s) {
    	Trienode current = root;
    	if(root.childList==null || root.childList.size()==0)
    		return;
      Iterator<Trienode> iter=current.childList.iterator();
     while(iter.hasNext())
     {
    	 Trienode node= (Trienode) iter.next();
      s+=node.data;
      printAllWordsInTrie(node,s);
      if(node.isEnd==true)
      { 
       System.out.print(" "+s);
       s=s.substring(0,s.length()-1);
      }
      else
      {
       s=s.substring(0,s.length()-1);
      }
     }
      
    }
    /*public static void main(String[] args) {            
    	TrieJavaBlog t = new TrieJavaBlog();       
        t.insert("dear");
        t.insert("deal");
        t.insert("do");
        t.insert("he");
        t.insert("hen");
        t.insert("heat");
        //t.remove("dear");
        t.remove("Duffer");
        System.out.println("hen present in trie : "+t.search("hen"));
        System.out.println("hear present in trie : "+t.search("hear"));
        System.out.println("deal present in trie : "+t.search("deal"));
        System.out.println("========================");
        System.out.println("Printing all word present in trie : ");
        printAllWordsInTrie(t.root,"");
    }*/
    
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        Trie t = new Trie(); 
        System.out.println("Trie Test\n");          
        char ch;
        /*  Perform tree operations  */
        do {
            System.out.println("\nTrie Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
 
            int choice = scan.nextInt();            
            switch (choice) {
            case 1 : 
                System.out.println("Enter string element to insert");
                t.insert( scan.next());                     
                break;                          
            case 2 : 
                System.out.println("Enter string element to delete");
                try {
                    t.remove(scan.next()); 
                }                    
                catch (Exception e) {
                    System.out.println(e.getMessage()+" not found ");
                }
                break;                         
            case 3 : 
                System.out.println("Enter string element to search");
                System.out.println("Search result : "+ t.search(scan.next()));
                break;                                          
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
 
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }

}