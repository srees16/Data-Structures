package DataStructuresRecollect2;

public class TreeRecollect {

	private Node root;
	
	private class Node {
		private Student data;
		private Node lc;
		private Node rc;
	}
	
	private TreeRecollect() {
		root=null;
	}
	
	public Node insert(Student stu) {
		Node n=new Node();
		n.data=stu;
		n.lc=null;
		n.rc=null;
		if(root==null) {
			root=n;
		} else {
			Node x=root;
			Node y=root;
			while(y!=null) {
				x=y;
				if(stu.getName().compareToIgnoreCase(y.data.getName())<0) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
			if(stu.getName().compareToIgnoreCase(x.data.getName())<0) {
				x.lc=n;
			} else {
				x.rc=n;
			}
		}
		return n;
	}
	
	public Node delete(Node n) {
		if(!isPresent(n.data.getName())) {
			throw new IllegalStateException("Node ain't there buddy!");
		} else {
			if(n.lc==null && n.rc==null) {
				n=null;
			} else if(n.lc!=null) {
				Node temp=n;
				n=n.lc;
				temp=null;
			} else if(n.rc!=null) {
				Node temp=n;
				n=n.rc;
				temp=null;
			} else {
				Node t=findMin(n.rc);
				n.data=t.data;
				n.rc=t;
			}
		}
		return n;
	}
	
	private Node findMin(Node n) {
		while(n.rc!=null) {
			n=n.rc;
		}
		return n;
	}
	
	private Node findMax(Node n) {
		while(n.lc!=null) {
			n=n.lc;
		}
		return n;
	}

	private boolean isPresent(String key) {
		Node x=root;
		if(key.compareToIgnoreCase(x.data.getName())==0) {
			return true;
		} else {
			Node y=root;
			while(y!=null) {
				x=y;
				if(key.compareToIgnoreCase(y.data.getName())<0) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
			if(key.compareToIgnoreCase(x.data.getName())<0) {
				x.lc=x;
			} else {
				x.rc=x;
			}
		}
		return true;
	}

	public void printAllNodes(Student stu) { //Inorder Traversal
		Node x=root;
		while(x!=null) {
			System.out.println(x.lc.data);
			printAllNodes(x.data);
			printAllNodes(x.rc.data);
		}
	}
	
	public void findNode(String key) {
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
		System.out.println(x.data.toString());
	}
}