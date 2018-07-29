package DataStructuresTwo;

public class PeopleLL {//Need to write code for sorting		<Good example>

	private Node head;
	
	private class Node {
		private Person person;
		private Node next;
	}
	
	public PeopleLL() {
		head=new Node();
		head.person=null;
		head.next=null;
	}
	
	public Person insert(Person p) {
		Node n=new Node();
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
		return p;
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
	
	/*public void sort() {
	int c=0;
	Node a=head.next;
	while(a.next!=null) {
		Node b=head.next;
		while(b.next!=null) {
			if(b.person.getName().compareTo(b.next.person.getName())) {
				c=b.value;
				b.value=b.next.value;
				b.next.value=c;
				}	
				b=b.next;
			}
			a=a.next;
		}
	}*/
	
	public void print() {
		Node a=head.next;
		while(a!=null) {
			System.out.println(a.person.toString());
			a=a.next;
		}
	}
}