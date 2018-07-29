package DataStructuresRecollect;

public class DoublyLL {

	private Node head;
	
	private class Node {
		private Node prev;
		private int data;
		private Node next;
	}
	
	public DoublyLL() {
		head=new Node();
		head.data=0;
		head.prev=null;
		head.next=null;
	}
	
	public void insert(int item) {
		Node n=new Node();
		/*n.data=item;
		n.prev=null;
		head.prev=n;
		n.next=head;
		head=n;*/
		Node xNode=head;
		while(xNode.next!=null) {
			xNode=xNode.next;
		}
		n.data=item;
		n.prev=xNode;
		n.next=null;
		xNode.next=n;
	}
	
	public void delete(int item) {
		if(!isPresent(item)) {
			throw new IllegalStateException("Input not found");
		} else {
			if(head.data==item) {
				head.next=head;
			} else {
				Node x=head;
				Node y=head.next;
				while(true) {
					if(y==null || y.data==item) {
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
		}
	}
	
	public void print() {
		Node x=head.next;
		while(x!=null) {
			System.out.print(x.data+" ");
			x=x.next;
		}
	}
	
	public boolean isPresent(int item) {
		Node x=head;
		if(x.data==item) {
			return true;
		}
		Node y=head.next;
		while(y!=null) {
			if(y.data==item) {
				return true;
			} else {
				y=y.next;
			}
		}
		return false;
	}
}