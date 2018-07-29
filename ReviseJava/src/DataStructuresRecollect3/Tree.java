package DataStructuresRecollect3;

public class Tree {

	private Node root;
	
	private class Node {
		private Student data;
		private Node lc;
		private Node rc;
	}
	
	public Tree() {
		root=null;
	}
	
	public void insert(Student s) {
		Node n=new Node();
		n.data=s;
		n.lc=null;
		n.rc=null;
		if(root==null) {
			root=n;
		} else {
			Node x=root;
			Node y=root;
			while(y!=null) {
				x=y;
				if(y.data.getName().compareToIgnoreCase(s.getName())<0) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
			if(x.data.getName().compareToIgnoreCase(s.getName())<0) {
				x.lc=x;
			} else {
				x.rc=x;
			}
		}
	}
	
	public void printNode(Node n) {
		Node x=n;
		while(x!=null) {
			System.out.println(x.data.getName()+" "+x.data.getRollNo());
			printNode(x.lc);
			printNode(x.rc);
		}
	}
	
	public Student getData(Node n) {
		return n.data;
	}
	
	public void getNode(String key) {
		Node x =root;
		while(x!=null) {
			if(key.compareToIgnoreCase(x.data.getName())==0) {
				break;
			} if(key.compareToIgnoreCase(x.data.getName())<0) {
				x=x.lc;
			} else {
				x=x.rc;
			}
		}
		System.out.println(x.data.toString());
	}
}