package DataStructures;

public class IntLinkedList {

	private Node head;
	
	class Node {
		private int value;
		private Node next;
	}
	
	public IntLinkedList() {
		head = new Node();
		head.value=0;
		head.next=null;
	}
	
	public boolean insertItem(int item) {
		Node n = new Node();
		/*n.value=0;
		n.next=head;
		head=n;
		return true;*/
		Node newNode;
		newNode=head;
		while(newNode.next!=null) {
			newNode=newNode.next;
		}
		n.value=item;
		n.next=null;
		newNode.next=n;
		return true;
	}
	
	public boolean deleteItem(int item) {
		if(head.next.value==item) {
			head.next=head.next.next;
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
			} if(y!=null) {
				x.next=y.next;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public void sort() {
		Node n=head.next;
		int c=0;
		while(n.next!=null) {
			Node b=head.next;
			while(b.next!=null) {
				if(b.value>b.next.value) {
					c=b.value;
					b.value=b.next.value;
					b.next.value=c;
				}
				b=b.next;
			}
			n=n.next;
		}
	}
	
	public void printList() {
		Node n= head.next;
		while(n!=null) {
			System.out.println(n.value);
			n=n.next;
		}
	}
}