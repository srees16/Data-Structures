package DataStructuresRecollect;

public class DSMainPlay {

	public static void main(String[] args) {
		
		/*Stack s=new Stack();
		s.push(52);
		s.push(75);
		s.push(18);
		s.push(87);
		s.push(25);
		s.push(61);
		s.print();
		*/
		/*Queue q=new Queue();
		q.enque(52);
		q.enque(75);
		q.enque(18);
		q.enque(87);
		q.enque(25);
		q.enque(61);
		q.print();
		System.out.println();
		q.deque();
		q.print();*/
		
		LinkedLists l=new LinkedLists();
		l.insert(83);
		l.insert(56);
		l.insert(35);
		l.insert(48);
		l.insert(14);
		l.print();
		
		/*DoublyLL l=new DoublyLL();
		l.insert(83);
		l.insert(56);
		l.insert(35);
		l.insert(48);
		l.insert(14);
		l.print();
		System.out.println();
		l.delete(56);
		l.print();
		System.out.println();
		l.delete(56);*/
		
		Person p1=new Person("xyz",1);
		Person p2=new Person("abc",4);
		Person p3=new Person("pqr",9);
		Person p4=new Person("lmn",2);
		Person p5=new Person("def",6);
		
		Tree t=new Tree();
		t.insert(p1);
		t.insert(p2);
		t.insert(p3);
		t.insert(p4);
		t.insert(p5);
		
		//t.findParentNode("abc");
		//t.findNode("abc");
	}
}