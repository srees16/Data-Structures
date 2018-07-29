package DataStructures;

public class IntLinkedList2 {

	private class Node {
		private int value;
		private Node nextLink;	
	}
	
	private Node head;
	
	public IntLinkedList2() {
		head=new Node();
		head.value=0;
		head.nextLink=null;
	}
	
	public boolean add(int value) {
		Node n=new Node();
		/*n.value=value;
		n.nextLink=head;
		head=n;
		return true;*/
		Node newNode=head;
		while(newNode.nextLink!=null) {
			newNode=newNode.nextLink;
		}
		n.value=value;
		n.nextLink=null;
		newNode.nextLink=n;
		return true;
	}
	
	public boolean remove(int value) {
		if(head.value==value) {
			head=head.nextLink;
			return true;
		} else {
			Node x=head;
			Node y=head.nextLink;
			while(true) {
				if(y==null || y.value==value) {
					break;
				} else {
					x=y;
					y=y.nextLink;
				}
			}
			if(y!=null) {
				x.nextLink=y.nextLink;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public void printList() {
		Node n=head.nextLink;
		while(n!=null) {
			System.out.println(n.value);
			n=n.nextLink;
		}
	}
	
	Node a=head.nextLink;
	public void sortList() {
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
	}
}