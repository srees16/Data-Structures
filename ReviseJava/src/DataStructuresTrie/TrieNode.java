package DataStructuresTrie;

import java.util.LinkedList;

class TrieNodeLearn {
		
	private class TryNode {
		char data;
		boolean endOfWord;
		int count;
		LinkedList<TryNode> childList;
	
		TryNode(char c) {
			childList=new LinkedList<>();
			endOfWord=false;
			count=0;
			data=c;
		}
	
		public TryNode getChild(char c) {
			if(childList!=null) {
				for(TryNode eachChild:childList) {
					if(eachChild.data==c) {
						return eachChild;
					}
				}
			}
			return null;
		}
	}
	
	private TryNode root;
	
	public TrieNodeLearn() {
		root=new TryNode(' ');
	}
	
	public void insert(String word) {
		TryNode current=root;
		for(char c:word.toCharArray()) {
			TryNode child=current.getChild(c);
			if(child!=null) {
				current=child;
			} else {
				current.childList.add(new TryNode(c));
				current=current.getChild(c);
			}
			current.count++;
		}
		current.endOfWord=true;
	}
	
	
	
}
	class TryMain {
		
		public static void main(String[] args) {
			
		}
}