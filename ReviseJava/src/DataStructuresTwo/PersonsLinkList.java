package DataStructuresTwo;

public class PersonsLinkList {

	private Node head;
	
	private class Node {
		private Node next;
		private Person value;
	}
	
	public PersonsLinkList() {
		head=new Node();
		head.value=null;
		head.next=null;
	}
	
	public void insert(Person p) {
		Node n=new Node();
		/*n.value=p;
		n.next=head;
		head=n;*/
		Node xnode=head;
		while(xnode.next!=null) {
			xnode=xnode.next;
		}
		n.value=p;
		n.next=null;
		xnode.next=n;
	}
	
	public void delete(String name) {
		if(head.next.value.getName()==name) {
			head.next=head.next.next;
		} else {
			Node x=head;
			Node y=head.next;
			while((y!=null) && !(y.value.getName().equals(name))) {
				x=y;
				y=y.next;
			}
			if(y!=null) {
				x.next=y.next;
			}
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