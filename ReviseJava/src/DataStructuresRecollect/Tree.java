package DataStructuresRecollect;

public class Tree {
	
	private Node root;
	
	private class Node {
		private Person data;
		private Node lc;
		private Node rc;
	}
	
	public Tree() {
		root=null;
	}
	
	public void insert(Person per) {
		Node n=new Node();
		n.data=per;
		n.lc=null;
		n.rc=null;
		if(root==null) {
			root=n;
		} else {
			Node x=root;
			Node y=root;
			while(y!=null) {
				x=y;
				if(per.getName().compareToIgnoreCase(y.data.getName())<0) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
			if(per.getName().compareToIgnoreCase(x.data.getName())<0) {
				x.lc=n;
			} else {
				x.rc=n;
			}
		}
	}
	
	public Node findNode(String key) {
		Node x=root;
		while(x!=null) {
			if(key.compareToIgnoreCase(x.data.getName())==0) {
				break;
			} else {
				if(key.compareToIgnoreCase(x.data.getName())<0) {
					x=x.lc;
				} else {
					x=x.rc;
				}
			}
		}
		return x;
	}
	
	//Does the same as above	
	/*public Node findParentNode(String key) {
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
			System.out.println(x.data.getName());
		}
		return x;
	}*/
	
	public void printNodes(Node n) {
		Node x=n;
		while(x!=null) {
			System.out.print(x.data.getName()+" "+x.data.getAge());
			printNodes(x.lc);
			printNodes(x.rc);
		}
	}
	
}