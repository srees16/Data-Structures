package DataStructuresRecollect3;

public class DoublyLinkedList {

	private Node head;
	
	private class Node {
		private Node prev;
		private int data;
		private Node next;
	}
	
	public DoublyLinkedList() {
		head=new Node();
		head.data=0;
		head.prev=null;
		head.next=null;
	}
	
	public void insertPre(int item) {
		Node n=new Node();
		n.data=item;
		n.prev=null;
		head.prev=n;
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
		n.prev=xNode;
		n.next=null;
		xNode.next=n;
	}
	
	public void delete(int item) {
		if(isPresent(item)) {
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
				if(y.data==item) {
					x.next=y.next;
				}
			}
		} else {
			throw new IllegalStateException("Operation invalid boss!");
		}
	}
	
	public boolean isPresent(int item) {
		Node x=head;
		while(x!=null) {
			if(x.data==item) {
				return true;
			}
			x=x.next;
		}
		return false;
	}
	
	public void print() {
		Node x=head.next;
		while(x!=null) {
			System.out.print(x.data+" ");
			x=x.next;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList ll = new DoublyLinkedList();
		/*ll.insertPre(56);
		ll.insertPre(22);
		ll.insertPre(68);
		ll.insertPre(35);
		ll.insertPre(73);
		ll.insertPre(15);
		ll.print();*/
		
		ll.insertPost(56);
		ll.insertPost(22);
		ll.insertPost(68);
		ll.insertPost(35);
		ll.insertPost(73);
		ll.insertPost(15);
		ll.print();
		System.out.println("==");
		ll.delete(22);
		ll.print();
		System.out.println();
		System.out.println(ll.isPresent(35));
		ll.delete(65);
	}
}