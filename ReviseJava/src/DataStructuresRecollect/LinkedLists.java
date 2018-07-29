package DataStructuresRecollect;

public class LinkedLists {
	
	private Node head;
	
	private class Node {
		private Node next;
		private int data;
	}
	
	public LinkedLists() {
		head=new Node();
		head.data=0;
		head.next=null;
	}
	
	public boolean insert(int item) {
		Node n=new Node();
		/*n.data=item;
		n.next=head;
		head=n;*/
		Node xNode=head;
		while(xNode.next!=null) {
			xNode=xNode.next;
		}
		n.data=item;
		n.next=null;
		xNode.next=n;
		return true;
	}
	
	public void delete(int item) {
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
			if(y.data==item) {
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
}