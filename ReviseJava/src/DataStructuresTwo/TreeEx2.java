package DataStructuresTwo;

public class TreeEx2 {

	private class Node {
		private Node lc;
		private Person data;
		private Node rc;
	}
	
	private Node root;
	
	public TreeEx2() {
		root=null;
	}
	
	public void insert(Person p) {
		Node n=new Node();
		n.data=p;
		n.lc=null;
		n.rc=null;
		if(root==null) {
			root=n;
		} else {
			Node x=root;
			Node y=root;
			while(y!=null) {
				x=y;
				if(p.getName().compareToIgnoreCase(y.data.getName())<0) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
			if(p.getName().compareToIgnoreCase(x.data.getName())<0) {
				x.lc=n;
			} else {
				x.rc=n;
			}
		}
	}
	
	public void printAllNodes(Node x) {
		Node z=x;
		if(z!=null) {
			System.out.println(x.data.getName()+" "+x.data.getAge());
			printAllNodes(x.lc);
			printAllNodes(x.rc);
		}
	}
	
	public Node findNode(String key) {
		Node x=root;
		while(x!=null) {
			if(key.compareToIgnoreCase(x.data.getName())==0) {
				break;
			}
			if(key.compareToIgnoreCase(x.data.getName())<0) {
				x=x.lc;
			} else {
				x=x.rc;
			}
		}
		return x;
	}
	
	public Node findParentNode(String key) {
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
		return p;
	}
	
	public Person getData(Node n) {
		return n.data;
	}
}