package HackerRankExcercises;

import DataStructures.Person;

public class PersonsLinkList {

	private Node head;
	
	public class Node {
		private Person person;
		Node next;
	}
	
	public PersonsLinkList(Person person) {
		head.person=person;
		head.next=null;
		head=new Node();
	}
	
	public boolean addName(Person name) {
		Node n=new Node();
		/*n.person=name;
		n.next=head;
		head=n;
		return true;*/
		
		Node newNode=head;
		while(newNode.next!=null) {
			newNode=newNode.next;
		}
		n.person=name;
		n.next=null;
		newNode.next=n;
		return true;
	}
	
	public void printList() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.person);
			n=n.next;
		}
	}
	
	public boolean deleteName(String name) {
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