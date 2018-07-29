package DataStructuresTwo;

public class myTree {

	private Node root;
	
	private class Node {
		private Node lc;
		private Person data;
		private Node rc;
	}
	
	public myTree() {
		root=null;
	}
	
	public void add(Person pers) {
		Node n=new Node();
		n.data=pers;
		n.lc=null;
		n.rc=null;
		if(root==null) {
			root=n;
		} else {
			Node x=root;
			Node y=root;
			while(y!=null) {
				x=y;
				if(pers.getName().compareToIgnoreCase(y.data.getName())<0) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
			if(pers.getName().compareToIgnoreCase(x.data.getName())<0) {
				x.lc=x;
			} else {
				x.rc=x;
			}
		}
	}
	
	public void print(Node n) {
		Node x=n;
		while(x!=null) {
			System.out.println(x.data);
			print(x.lc);
			print(x.rc);
		}
	}
	
	public Node findNode(String key) {
		Node n=root;
		while(n!=null) {
			if(key.compareToIgnoreCase(n.data.getName())==0) {
				break;
			}
			if(key.compareToIgnoreCase(n.data.getName())<0) {
				n=n.lc;
			} else {
				n=n.rc;
			}
		}
		return n;
	}
	
	public void findParentNode(String key) {
		Node p=root;
		Node c=root;
		do {
			if(key.compareToIgnoreCase(c.data.getName())==0) {
				break;
			}
			p=c;
			if(key.compareToIgnoreCase(c.data.getName())<0) {
				c=c.lc;
			} else {
				c=c.rc;
			}
		} while(c!=null);
		System.out.println(p.data.getName());
	}
	
	public Person getData(Node n) {
		return n.data;
	}
}