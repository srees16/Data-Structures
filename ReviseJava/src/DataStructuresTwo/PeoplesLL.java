package DataStructuresTwo;

public class PeoplesLL {

	private Node head;
	
	private class Node {
		private Person person;
		private Node next;
	}
	
	public PeoplesLL() {
		head=new Node();
		head.person=null;
		head.next=null;
	}
	
	public boolean insert(Person p) {
		Node n = new Node();
		/*n.person=p;
		n.next=head;
		head=n;
		return true;*/
		Node xnode=head;
		while(xnode.next!=null) {
			xnode=xnode.next;
		}
		n.person=p;
		n.next=null;
		xnode.next=n;
		return true;
	}
	
	public boolean delete(String name) {
		if(head.next.person.getName().equals(name)) {
			head.next=head.next.next;
			return true;
		} else {
			Node x=head.next;
			Node y=head.next.next;
			while((y!=null) && !(y.person.getName().equals(name))) {
				x=y;
				y=y.next;
			}
			if(y!=null) {
				x.next=y.next;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public void print() {
		Node x=head.next;
		while(x!=null) {
			System.out.println(x.person.toString());
			x=x.next;
		}
	}
	
	/*public void sort() {
		
	}*/
}