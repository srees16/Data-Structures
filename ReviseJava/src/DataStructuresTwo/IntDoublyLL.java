package DataStructuresTwo;

public class IntDoublyLL {//Good Example

	private Node head;
	
	private class Node {
		private int data;
		private Node prev;
		private Node next;
	}
	
	public IntDoublyLL() {
		head=new Node();
		head.data=0;
		head.prev=null;
		head.next=null;
	}
	
	public void insert(int data) {
		Node n=new Node();
		/*n.data=data;//set the value into the node
		n.prev=null;//set the previous of the node to null, adding the new nodes in the left side
		head.prev=n;//set the previous of the already added node to the new node
		n.next=head;//set the next of the new node to head
		head=n;//set the new added node as head*/
		Node xnode=head;
		while(xnode.next!=null) {
			xnode=xnode.next;
		}
		n.data=data;
		n.prev=xnode;
		xnode.next=n;
		n.next=null;
	}
	
	public void delete(int data) {
		if(head.data==data) {
			head=head.next;
		} else {
			Node x=head;
			Node y=head.next;
			while(true) {
				if(y==null || y.data==data) {
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
	
	public void print() {
		Node x=head.next;
		while(x!=null) {
			System.out.print(x.data+" ");
			x=x.next;
		}
	}
	
	public void sort() {
		int c=0;
		Node a=head.next;
		while(a.next!=null) {
			Node b=head.next;
			while(b.next!=null) {
				if(b.data>b.next.data) {
					c=b.data;
					b.data=b.next.data;
					b.next.data=c;
				}
				b=b.next;
			}
			a=a.next;
		}
	}
}