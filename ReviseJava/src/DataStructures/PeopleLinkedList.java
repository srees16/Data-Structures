package DataStructures;

import DataStructures.IntLinkedList.Node;

public class PeopleLinkedList {

private Node head;
	
	class Node {
		private Person person;
		private Node next;
	}
	
	public PeopleLinkedList(Person person) {
		head = new Node();
		head.person=person;
		head.next=null;
	}
	
	public boolean insertItem(Person person) {
		Node n = new Node();
		/*n.value=0;
		n.next=head;
		head=n;
		return true;*/
		Node newNode;
		newNode=head;
		while(newNode.next!=null) {
			newNode=newNode.next;
		}
		n.person=person;
		n.next=null;
		newNode.next=n;
		return true;
	}
	
	public boolean deleteItem(String name) {
		if(name.equals(head.person.getName())) {
			head=head.next;
			return true;
		} else {
			Node x=head;
			Node y=head.next;
			while((y!=null) && !(y.person.getName().equals(name))) {
				x=y;
				y=y.next;
			} if(y!=null) {
				x.next=y.next;
				return true;
			} else {
				return false;
			}
		}
	}
	
	/*public void sort() {
		Node n=head.next;
		int c=0;
		while(n.next!=null) {
			Node b=head.next;
			while(b.next!=null) {
				if(b.value>b.next.value) {
					c=b.value;
					b.value=b.next.value;
					b.next.value=c;
				}
				b=b.next;
			}
			n=n.next;
		}
	}*/
	
	public void printList() {
		Node n= head;
		while(n!=null) {
			System.out.println(n.person);
			n=n.next;
		}
	}
}