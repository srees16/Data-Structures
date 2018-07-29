package DataStructures;

public class DataStructuresMain {

	public static void main(String[] args) {
		
		/*IntStack s=new IntStack();
		if(!s.isFull()) {
			s.push(11);
			s.push(13);
			s.push(15);
			s.push(19);
		}
		s.print();*/
		/*System.out.println(s.pop());
		System.out.println(s.pop());*/
		
		/*PersonStack ps=new PersonStack();
		Person p1=new Person("Raju","01");
		Person p2=new Person("Rani","02");
		Person p3=new Person("Rama","03");
		ps.push(p1);
		ps.push(p2);
		ps.push(p3);
		ps.print();
		System.out.println(ps.pop());*/
		
		/*IntQ q=new IntQ();
		q.enQ(75);
		q.enQ(44);
		q.enQ(23);
		q.enQ(18);
		q.print();
		System.out.println("===");
		System.out.println(q.deQ());
		System.out.println(q.deQ());
		System.out.println(q.deQ());*/
		
		/*PersonQ pq=new PersonQ();
		Person p1=new Person("Raju","01");
		Person p2=new Person("Rani","02");
		Person p3=new Person("Rama","03");
		pq.enQ(p1);
		pq.enQ(p2);
		pq.enQ(p3);
		pq.show();
		System.out.println(pq.deQ());*/
		
		IntLinkedList2 list=new IntLinkedList2();
		list.add(35);
		list.add(51);
		list.add(73);
		list.add(27);
		list.add(11);
		list.printList();
		System.out.println("===========");
		list.sortList();
		list.printList();
		list.remove(51);
		list.printList();
		
		/*Person p1=new Person("Raju","01");
		Person p2=new Person("Rani","02");
		Person p3=new Person("Rama","03");
		
		PersonLinkedList plist=new PersonLinkedList(p1);
		plist.addPerson(p2);
		plist.addPerson(p3);
		plist.printNames();*/
		
		/*Persons p1=new Persons("raju",01);
		Persons p2=new Persons("mantri",02);
		Persons p3=new Persons("rani",03);
		Persons p4=new Persons("bhatudu",03);
		Persons p5=new Persons("senadhipati",03);
		
		BinaryST bst=new BinaryST();
		bst.insert(p3);
		bst.insert(p2);
		bst.insert(p1);
		bst.insert(p4);
		bst.insert(p5);
		bst.showAll(bst.findNode("mantri"));*/
		
		/*MaxHeap mheap=new MaxHeap();
		mheap.insert(12);
		mheap.insert(7);
		mheap.insert(6);
		mheap.insert(10);
		mheap.insert(8);
		mheap.insert(20);
		mheap.print();*/
		
		/*MinHeap miheap = new MinHeap();
		miheap.insert(12);
		miheap.insert(7);
		miheap.insert(6);
		miheap.insert(10);
		miheap.insert(8);
		miheap.insert(20);
		miheap.print();*/
	}
}