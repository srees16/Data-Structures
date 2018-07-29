package DataStructuresTwo;

public class IntegerLinkList {

	private Node head;
	
	private class Node {
		private int data;
		private Node next;
	}
	
	public IntegerLinkList() {
		head=new Node();
		head.data=0;
		head.next=null;
	}
	
	public boolean insert(int item) {
		Node n=new Node();
		/*n.data=item;
		n.next=head;
		head=n;
		return true;*/
		Node xnode=head;
		while(xnode.next!=null) {
			xnode=xnode.next;
		}
		n.data=item;
		n.next=null;
		xnode.next=n;
		return true;
	}
	
	public boolean delete(int item) {
		if(head.data==item) {
			head=head.next;
			return true;
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
				return true;
			} else {
				return false;
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
		int a=0;
		Node b=head.next;
		while(b.next!=null) {
			Node c=head.next;
			while(c.next!=null) {
				if(c.data>c.next.data) {
					a=c.data;
					c.data=c.next.data;
					c.next.data=a;
				}
				c=c.next;
			}
			b=b.next;
		}
	}
}