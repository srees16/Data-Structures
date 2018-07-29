package DataStructuresTwo;

public class IntLL {
	
	private Node head;
	
	private class Node {
		private int value;
		private Node next;
	}
	
	public IntLL() {
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
		Node node=head;
		while(node.next!=null) {
			node=node.next;
		}
		n.value=item;
		n.next=null;
		node.next=n;
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
	
	public void sort() {
		int c=0;
		Node a=head.next;
		while(a.next!=null) {
			Node b=head.next;
			while(b.next!=null) {
				if(b.value<b.next.value) {
					c=b.value;
					b.value=b.next.value;
					b.next.value=c;
				}	
				b=b.next;
			}
			a=a.next;
		}
	}
	
	public void print() {
		Node z=head.next;
		while(z!=null) {
			System.out.println(z.value);
			z=z.next;
		}
	}
}