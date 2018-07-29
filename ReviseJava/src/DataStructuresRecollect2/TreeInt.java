package DataStructuresRecollect2;

public class TreeInt {

	private Node root;
	
	private class Node {
		private int data;
		private Node lc;
		private Node rc;
	}
	
	public TreeInt() {
		root=null;
	}
	
	public void insert(int data) {
		Node n=new Node();
		n.data=data;
		n.lc=null;
		n.rc=null;
		if(root==null) {
			root=n;
		} else {
			Node x=root;
			Node y=root;
			while(y!=null) {
				x=y;
				if(y.data<=data) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
			if(x.data<=data) {
				x.lc=n;
			} else {
				x.rc=n;
			}
		}
	}
	
	public void delete(int data) {
		
	}

	public void print(Node n) {
		Node x=root;
		while(x!=null) {
			System.out.println(x.data);
			print(x.lc);
			print(x.rc);
		}
	}
}