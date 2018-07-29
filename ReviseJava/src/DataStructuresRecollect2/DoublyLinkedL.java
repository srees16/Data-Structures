package DataStructuresRecollect2;

public class DoublyLinkedL {//Better Example but add sorting method

	private Node head;
	
	private class Node {
		private Node prev;
		private int data;
		private Node next;
	}
	
	public DoublyLinkedL() {
		head=new Node();
		head.data=0;
		head.prev=null;
		head.next=null;
	}
	
	public void addPre(int item) {
		Node n=new Node();
		n.data=item;
		n.prev=null;
		head.prev=n;
		n.next=head;
		head=n;
	}
	
	public void addPost(int item) {
		Node n=new Node();
		Node xNode=head;
		while(xNode.next!=null) {
			xNode=xNode.next;
		}
		n.data=item;
		n.prev=xNode;
		xNode.next=n;
		n.next=null;
	}
	
	public void delete(int item) {
		if(isPresent(item)) {
			if(head.data==item) {
				head=head.next;
			} else {
				Node x=head;
				Node y=head.next;
				while(true) {
					if(y.data==item || y==null) {
						break;
					} else {
						x=y;
						y=y.next;
					}
				}
				if(y!=null) {
					x.next=y.next;
				}
			}
		} else {
			throw new IllegalStateException("It ain't there duffer");
		}
	}
	
	public void print() {
		Node x=head.next;
		while(x.next!=null) {
			System.out.print(x.data+" ");
			x=x.next;
		}
	}
	
	public boolean isPresent(int item) {
		Node x=head;
		while(x.next!=null) {
			if(x.data==item)
				return true;
			x=x.next;
		}
		return false;
	}
}