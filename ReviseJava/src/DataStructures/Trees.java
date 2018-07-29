package DataStructures;

public class Trees {
	
	private Node root;
	
	private class Node {
		private Node lc;
		private Person pers;
		private Node rc;
	}
	
	public Trees() {
		root=null;
	}
	
	public void insert(Person pers) {
		Node n=new Node();
		n.pers=pers;
		n.lc=null;
		n.rc=null;
		if(root==null) {
			root=n;
		} else {
			Node x=root;
			Node y=root;
			while(y!=null) {
				x=y;
				if(pers.getName().compareToIgnoreCase(y.pers.getName())<0) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
			if(pers.getName().compareToIgnoreCase(x.pers.getName())<0) {
				x.lc=n;
			} else {
				x.rc=n;
			}
		}
	}
	
	public Node showNodeName(String key) {
		Node r=root;
		while(r!=root) {
			if(key.compareToIgnoreCase(r.pers.getName())==0) {
				break;
			} if(key.compareToIgnoreCase(r.pers.getName())<0) {
				r=r.lc;
			} else {
				r=r.rc;
			}
		}
		return r;
	}
	
	public void findChildren(Node n) {
		Node x=root;
		if(x!=null) {
			System.out.println(x.pers);
			findChildren(x.lc);
			findChildren(x.rc);
		}
	}
	
	public Person getData(Node n) {
		return n.pers;
	}
	
	public Node findParent(String key) {
		Node x=root;
		Node y=root;
		do {
			if((key.compareTo(y.pers.getName())==0)) {
				break;
			}
			x=y;
			if(key.compareToIgnoreCase(y.pers.getName())<0) {
				y=y.lc;
			}
			else {
				y=y.rc;
			}
		} while(y!=null);
		System.out.println(x.pers.getName());
		if(y!=null) {
			return x;
		} else {
			return null;
		}
	}
	
	public void showInOrder() {
		
	}
	
	public void showPreOrder() {
		
	}
	
	public void showPostOrder() {
		
	}
}