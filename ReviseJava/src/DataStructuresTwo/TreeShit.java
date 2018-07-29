package DataStructuresTwo;

public class TreeShit {

	private Node root;
	
	private class Node {
		private Person data;
		private Node lc;
		private Node rc;
	}
	
	public TreeShit() {
		root=null;
	}
	
	public void insert(Person pers) {
		Node x=new Node();
		x.data=pers;
		x.lc=null;
		x.rc=null;
		if(root==null) {
			root=x;
		} else {
			Node p=root;
			Node c=root;
			while(c!=null) {
				p=c;
				if(pers.getName().compareToIgnoreCase(c.data.getName())<0) {
					c=c.lc;
				} else {
					c=c.rc;
				}
			}
			if(pers.getName().compareToIgnoreCase(p.data.getName())<0) {
				p.lc=x;
			} else {
				p.rc=x;
			}
		}
	}
	
	public void findNode(String n) {
		Node x=root;
		Node y=root;
		do{
			if(n.compareToIgnoreCase(y.data.getName())==0) {
				break;
			}
			x=y;
			if(n.compareToIgnoreCase(y.data.getName())<0) {
				y=y.lc;
			} else {
				y=y.rc;
			}
			
		} while(y!=null);
		System.out.println(x.data.getName());
	}
	
	public void findChildNode(Node n) {
		Node x=root;
		Node y=root;
		if(y!=null) {
			findChildNode(y.lc);
			findChildNode(y.rc);
		} else {
			while(y!=null) {
				
			}
		}
	}
	
	public Person getData(Node n) {
		return n.data;
	}
	
	public Node showNode(String key) {
		Node c=root;
		while(c!=null) {
			if(key.compareToIgnoreCase(c.data.getName())==0) {
				break;
			}
			if(key.compareToIgnoreCase(c.data.getName())<0) {
				c=c.lc;
			} else {
				c=c.rc;
			}
		}
		return c;
	}
	
	public void printNodesPreOrder(Node n) {
		Node x=n;
		while(x!=null) {
			System.out.println(x.data);
			printNodesPreOrder(x.lc);
			printNodesPreOrder(x.rc);
		}
	}
	
	public void printNodesInOrder(Node n) {
		Node x=n;
		while(x!=null) {
			System.out.println(x.lc);
			printNodesInOrder(x);
			printNodesInOrder(x.rc);
		}
	}
	
	public void printNodesPostOrder(Node n) {
		Node x=n;
		while(x!=null) {
			System.out.println(x.lc);
			printNodesPostOrder(x.rc);
			printNodesPostOrder(x);//
		}
	}
}