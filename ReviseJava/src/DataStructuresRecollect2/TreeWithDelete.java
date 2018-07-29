package DataStructuresRecollect2;

public class TreeWithDelete {// Having Delete function
	
	public static void main(String args[]) {
		
	}

	private Node root;
	
	private class Node {
		private Node lc;
		private Student data;
		private Node rc;
	}
	
	public TreeWithDelete() {
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
				if(s.name.compareToIgnoreCase(y.data.getName())<0) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
			if(s.name.compareToIgnoreCase(x.data.getName())<0) {
				x.lc=n;
			} else {
				x.rc=n;
			}
		}
	}
	
	/*public Node delete(Node n,Student s) {
		if(n==null) {
			return null;
		}
		Node x=root;
		Node y=root;
		if(s.getName().compareToIgnoreCase(n.data.getName())<0) {
				n.lc=delete(n.lc,s);
			} else if(s.getName().compareToIgnoreCase(root.data.getName())>0) {
				n.rc=delete(n.rc,s);
			} else {
				if(root.lc==null || root.rc==null) {
					Node temp=null;
					temp=root.lc==null?root.rc:root.lc;
					if(temp==null) {
						return null;
					} else {
						return root;
					}
				} else {
					Node successor=getSuccessor(root);
					root.data=successor.data;
					root.rc=delete(root.rc,s);
					return root;
				}
			}
		return x;
		}
	
	public Node getSuccessor(Node root) {
		if(root==null) {
			return null;
		}
		Node temp=root.rc;
		while(temp!=null) {
			temp=temp.lc;
		}
		return temp;
	}*/
	
	//Delete function
	public Node delete(Node n) {
		if(!isPresent(n.data.getName())) {
			throw new IllegalStateException("Node ain't there buddy!");
		} else {
			if(n.lc==null && n.rc==null) { //Case 1: if child nodes doesn't exist
				n=null;
			} else if(n.lc==null) { //Case 2A: if left child node doesn't exist
				Node temp=n;
				n=n.rc;
				temp=null;
			} else if(n.rc==null) { //Case 2B: if right child node doesn't exist
				Node temp=n;
				n=n.lc;
				temp=null;
			} else {				//Case 3: if both child nodes exist
				Node t=findMin(n.rc);
				n.data=t.data;
				n.rc=t;
			}
		}
		return n;
	}
	
	private Node findMin(Node n) {
		while(n.lc!=null) {
			n = n.lc;
		}
		return n;
	}
	
	private Node finMax(Node n) {
		while(n.rc!=null) {
			n = n.rc;
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
	
	public void findChildren(String key) {
		Node x=root;
		Node y=root;
		while(x.lc!=null) {
			if(key.compareToIgnoreCase(x.data.getName())==0) {
				break;
			} else {
				x=y;
				if(key.compareToIgnoreCase(y.data.getName())<0) {
					y=y.lc;
				} else {
					y=y.rc;
				}
			}
		}
		System.out.println(x.lc.data.getName()+" "+x.lc.data.getRollNo());
		findChildren(x.rc.data.getName()+" "+x.lc.data.getRollNo());
	}
	
	public void printAllNodes(Node n) {
		Node x=root;
		while(x!=null) {
			System.out.println(x.data.getName()+" "+x.data.getRollNo());
			printAllNodes(x.lc);
			printAllNodes(x.rc);
		}
	}
	
	public Student getNodeData(Node n) {
		return n.data; 
	}
}