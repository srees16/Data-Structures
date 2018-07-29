package DataStructuresRecollect2;

public class LinkedListObject {//correct the isPresent and print methods

	private Node head;
	
	private class Node {
		private Student data;
		private Node prev;
		private Node next;
	}
	
	public LinkedListObject() {
		head=new Node();
		head.prev=null;
		head.next=null;
	}
	
	public void addPre(Student stu) {
		Node n=new Node();
		n.data=stu;
		n.prev=null;
		n.next=head;
		head=n;
	}
	
	public void addPost(Student stu) {
		Node n=new Node();
		Node xNode=head;
		while(xNode.next!=null) {
			xNode=xNode.next;
		}
		n.data=stu;
		n.prev=xNode;
		xNode.next=n;
		n.next=null;
	}
	
	public void delete(String stu) {
		Node n=head.next;
		if(!isPresent(stu)) {
			throw new IllegalStateException("You cant delete wat aint there!");
		} else {
			if(stu.compareToIgnoreCase(n.data.getName())==0) {
				head=head.next;
			} else {
				Node x=head;
				Node y=head.next;
				while((y!=null) && !(stu.compareToIgnoreCase(y.data.getName())==0)) {
					x=y;
					y=y.next;
				}
				if(y!=null) {
					x.next=y.next;
				}
			}
		}
	}
	
	public void print() {
		Node x=head;
		while(x.next!=null) {
			System.out.println(x.data);
			x=x.next;
		}
	}
	
	public boolean isPresent(String s) {
		Node n=head;
		if(s.compareToIgnoreCase(n.data.getName())==0) {
			return true;
		} else {
			Node x=head;
			Node y=head.next;
			while((y!=null) && !(s.compareToIgnoreCase(y.data.getName())==0)) {
				x=y;
				y=y.next;
			}
			if(y!=null) {
				return true;
			}
		}
		return false;
	}
}