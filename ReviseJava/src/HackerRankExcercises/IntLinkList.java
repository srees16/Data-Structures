package HackerRankExcercises;

public class IntLinkList {

	private Node head;
	
	private class Node {
		private int data;
		private Node next;
	}
	
	IntLinkList() {
		head=new Node();
		head.next=null;
		head.data=0;
	}
	
	public boolean insert(int item) {
		Node n=new Node();
	//to insert the new nodes at the beginning 
		/*n.data=item;
		n.next=head;
		head=n;
		return true;*/
	//to insert the new nodes at the end
		Node newNode=head;
		while(newNode.next!=null) {
			newNode=newNode.next;
		}
		n.data=item;
		n.next=null;
		newNode.next=n;
		return true;
	}
	
	public boolean delete(int item) {
		if(head.next.data==item) {
			head.next=head.next.next;
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
	
	public void printItems() {
		Node h=head.next;
		while(h!=null) {
			System.out.println(h.data);
			h=h.next;
		}
	}
	
	public void sorting() {
		int c=0;
		Node a=head.next;
		while(a.next!=null) {
			Node b=head.next;
			while(b.next!=null) {
				if(b.data>b.next.data) {
					c=b.data;
					b.data=b.next.data;
					b.next.data=c;
				} b=b.next;
			} a=a.next;
		}
	}
}