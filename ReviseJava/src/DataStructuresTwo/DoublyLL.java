package DataStructuresTwo;

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
		Node xnode=head;
		while(xnode.next!=null) {
			xnode=xnode.next;
		}
		n.data=item;
		n.prev=xnode;
		n.next=null;
		xnode.next=n;
	}
	
	public void delete(int item) {
		if(head.data==item) {
			head=head.next;
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
	
	public void print() {
		Node z=head.next;
		while(z!=null) {
			System.out.print(z.data+" ");
			z=z.next;
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