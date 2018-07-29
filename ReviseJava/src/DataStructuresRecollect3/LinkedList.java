package DataStructuresRecollect3;

public class LinkedList { //Better improved example

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

	public boolean insertPost(int item) {
		Node n=new Node();
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
		if(isPresent(item)) {
			Node x=head;
			if(head.data==item) {
				head=head.next;
			} else {
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
			throw new IllegalStateException("The item is not present in the linked list!");
		}
	}
	
	public boolean isPresent(int item) {
		Node n=head.next;
		while(n!=null) {
			if(n.data==item) {
				return true;
			}
			n=n.next;
		}
		return false;
	}
	
	public void print() {
		Node x=head.next;
		while(x!=null) {
			System.out.print(x.data+", ");
			x=x.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
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
		System.out.println();
		ll.delete(22);
		ll.print();
		System.out.println();
		System.out.println(ll.isPresent(35));
		ll.delete(65);
	}
}