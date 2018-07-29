package DataStructuresTwo;

public class IntLinkList {

	private Node head;
	
	private class Node {
		private int value;
		private Node next;
	}
	
	public IntLinkList() {
		head=new Node();
		head.value=0;
		head.next=null;
	}
	
	public boolean insert(int item) {
		Node n=new Node();
		/*n.value=item;
		n.next=head;
		head=n;
		return true;*/
		Node xnode=head;
		while(xnode.next!=null) {
			xnode=xnode.next;
		}
		n.value=item;
		n.next=null;
		xnode.next=n;
		return true;
	}
	
	public boolean delete(int item) {
		if(head.value==item) {
			head=head.next;
			return true;
		} else {
			Node x=head;
			Node y=head.next;
			while(true) {
				if(y==null || y.value==item) {
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
		Node f=head.next;
		while(f!=null) {
			System.out.println(f.value);
			f=f.next;
		}
	}
	
	public void sort() {
		int c=0;
		Node a=head.next;
		while(a.next!=null) {
			Node b=head.next;
			while(b.next!=null) {
				if(b.value>b.next.value) {
					c=b.value;
					b.value=b.next.value;
					b.next.value=c;
				}
				b=b.next;
			}
			a=a.next;
		}
	}
}