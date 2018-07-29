package DataStructuresRecollect2;

public class LinkedList {

	private Node head;
	
	private class Node {
		private int data;
		private Node next;
	}
	
	public LinkedList() {
		head=new Node();
		head.data=0;
		head.next=null;
	}
	
	public void insertPre(int item) {
		Node n=new Node();
		n.data=item;
		n.next=head;
		head=n;
	}
	
	public void insertPost(int item) {
		Node n=new Node();
		Node xNode=head;
		while(xNode.next!=null) {
			xNode=xNode.next;
		}
		n.data=item;
		n.next=null;
		xNode.next=n;
	}

	public void delete(int item) {
		if(head.data==item) {
			head=head.next;
		} else {
			Node x=head;
			Node y=head.next;
			while(true) {
				if(y==null && y.data==item) {
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
		while(x.next!=null) {
			System.out.print(x.data+" ");
			x=x.next;
		}
	}
}