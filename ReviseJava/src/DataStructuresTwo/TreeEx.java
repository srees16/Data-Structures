package DataStructuresTwo;

public class TreeEx {
	/*In Order Traversal:print with left child,then root,then right child
	Pre Order Traversal:print root,then left child, and then right child
	Post Order Traversal:print left, then right and then root
	*/
		/*
		 * method to insert an object
		 * method to delete an object
		 * method to find childs of a parent
		 * method to find parent of a child
		 * method to traverse 'in order'
		 * 
		 */
	private Node root;
	
	private class Node {
		private Person data;
		private Node lc;
		private Node rc;
	}
	
	public TreeEx() {
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
				if(per.getName().compareTo(y.data.getName())<0) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
			if(per.getName().compareTo(x.data.getName())<0) {
				x.lc=n;
			} else {
				x.rc=n;
			}
		}
	}
	
	public void print(Node x) {
		Node z=x;
		if(z!=null) {
			System.out.println(z.data);
			print(z.lc);
			print(z.rc);
		}
	}
	
	public Node showNode(String key) {
		Node r=root;
		while(r!=null) {
			if(key.compareToIgnoreCase(r.data.getName())==0) {
				break;
			} if(key.compareToIgnoreCase(r.data.getName())<0) {
				r=r.lc;
			} else {
				r=r.rc;
			}
		}
		return r;
	}
	
	public Node findParent(String key) {
		Node x=root;
		Node y=root;
		do {
			if(key.compareToIgnoreCase(y.data.getName())==0) {
				break;
			}
			x=y;
			if(key.compareToIgnoreCase(x.data.getName())<0) {
				y=y.lc;
			} else {
				y=y.rc;
			}
		}
		while(y!=null);
		System.out.println(x.data.getName());
		if(y!=null) {
			return x;
		} else {
			return null;
		}
	}
}