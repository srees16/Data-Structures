package DataStructures;

public class DoublyLL {

	private class Node {
		private int value;
		private Node previous;
		private Node next;	
	}
	
	private Node head;
	
	public DoublyLL(int item) {
		head=new Node();
		head.value=item;
		head.next=null;
		head.previous=null;
	}
	
	public boolean add(int value) {
		Node n=new Node();
		n.value=value;
		n.previous=null;
		head.previous=n;
		n.next=head;
		head=n;
		return true;
	}
	
	public boolean remove(int value) {
		if(head.value==value) {
			head=head.next;
			return true;
		} else {
			Node x=head;
			Node y=head.next;
			while(true) {
				if(y==null || y.value==value) {
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
	
	public void printList() {
		Node n=head.next;
		while(n!=null) {
			System.out.println(n.value);
			n=n.next;
		}
	}
	
	/*public void sortList() {
		Node a=head.nextLink;
		int c=0;
		while(a.nextLink!=null) {
			Node b=head.nextLink;
			while(b.nextLink!=null) {
				if(b.value>b.nextLink.value) {
					c=b.value;
					b.value=b.nextLink.value;
					b.nextLink.value=c;
				} b=b.nextLink;
			} a=a.nextLink;
		}
	}*/	
}