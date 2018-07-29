package HackerRankExcercises;

public class DoubleLList {

	private Node head;
	
	private class Node {
		private Node previous;
		private int value;
		private Node next;
	}
	
	public DoubleLList(int item) {
		head.previous=null;
		head.next=null;
		head.value=item;
		head=new Node();
	}
	
	public boolean insert(int item) {
		Node n =new Node();
		n.value=item;
		n.previous=null;
		head.previous=n;
		n.next=head;
		head=n;
		return true;
	}
	
	public void printAll() {
		
	}
}