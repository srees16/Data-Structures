package DataStructuresTwo;

public class TreeBark {

	private Node root;
	
	private class Node {
		private Person data;
		private Node lc;
		private Node rc;
	}
	
	public TreeBark() {
		root=null;
	}
	
	public void insert(Person pers) {
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
				x.lc=n;
			} else {
				x.rc=n;
			}
		}
	}

	public void printAllNodes(Node n) {
		Node x=n;
		if(x!=null) {
			System.out.println(x.data);
			printAllNodes(x.lc);
			printAllNodes(x.rc);
		}
	}
	
	public Node findNode(String key) {
		Node x=root;
		while(x!=null) {
			if(key.compareToIgnoreCase(x.data.getName())==0) {
				break;
			} if(key.compareToIgnoreCase(x.data.getName())<0) {
				x=x.lc;
			} else {
				x=x.rc;
			}
		}
		return x;
	}
	
	public Node findParentNode(String key) {
		Node x=root;
		Node y=root;
		while(y!=null) {
			if(key.compareToIgnoreCase(y.data.getName())==0) {
				break;
			}
			x=y;
			if(key.compareToIgnoreCase(y.data.getName())<0) {
				y=y.lc;
			} else {
				y=y.rc;
			}
		}
		System.out.println(x.data.getName());
		return x;
	}
	
	public Person printNode(Node n) {
		return n.data;
	}
}