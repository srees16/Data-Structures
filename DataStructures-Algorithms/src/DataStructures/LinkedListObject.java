package DataStructures;

public class LinkedListObject {

	private class Node {
		private Person person;
		private Node next;
	}
	
	private Node head;
	
	public LinkedListObject(Person person) {
		head=new Node();
		head.person=person;
		head.next=null;
	}
	
	public boolean addPerson(Person person) {
		Node node=new Node();
		Node newNode=head;
		while(newNode.next!=null) {
			newNode=newNode.next;
		}
		node.person=person;
		node.next=null;
		newNode.next=node;
		return true;
	}
	
	public void printNames() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.person);
			n=n.next;
		}
	}
	
	public boolean deletePerson(String name) {
		if(name.equals(head.person.getName())) {
			head=head.next;
			return true;
		} else {
			Node x=head;
			Node y=head.next;
			while((y!=null) && (y.person.getName().equals(name))) {
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
}
