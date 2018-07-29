package DataStructuresRecollect2;

public class MyDSMain {

	public static void main(String[] args) {
		
		/*Stack s=new Stack();
		s.push(43);
		s.push(85);
		s.push(51);
		s.push(65);
		s.push(32);
		System.out.println(s.stackTop());
		s.pop();
		s.print();
		System.out.println();
		System.out.println(s.search(61));*/
		
		Student s1=new Student("Bob",01);
		Student s2=new Student("Rob",02);
		Student s3=new Student("Jam",03);
		Student s4=new Student("Sam",04);
		Student s5=new Student("Tom",05);
		
		StackObject so=new StackObject();
		so.push(s1);
		so.push(s2);
		so.push(s3);
		so.push(s4);
		so.push(s5);
		//System.out.println(so.stackTop());
		so.print();
		so.pop();
		System.out.println("=======");
		so.print();
		
		/*Queue q=new Queue();
		q.enq(35);
		q.enq(53);
		q.enq(22);
		q.enq(75);
		q.enq(68);
		q.print();
		q.deq();
		System.out.println("=======");
		q.print();
		System.out.println();
		System.out.println(q.search(21));*/
		
		/*Student s1=new Student("Bob",01);
		Student s2=new Student("Rob",02);
		Student s3=new Student("Jam",03);
		Student s4=new Student("Sam",04);
		Student s5=new Student("Tom",05);
		
		QueueObject q=new QueueObject();
		q.enq(s1);
		q.enq(s2);
		q.enq(s3);
		q.enq(s4);
		q.enq(s5);
		q.print();
		q.deq();
		q.print();*/
		
		//LinkedList ll = new LinkedList();
		/*ll.insertPre(56);
		ll.insertPre(22);
		ll.insertPre(68);
		ll.insertPre(35);
		ll.insertPre(73);
		ll.insertPre(15);
		ll.print();*/
		/*System.out.println("==========");
		ll.insertPost(56);
		ll.insertPost(22);
		ll.insertPost(68);
		ll.insertPost(35);
		ll.insertPost(73);
		ll.insertPost(15);
		ll.print();*/
		
		DoublyLinkedL ll=new DoublyLinkedL();
		/*ll.addPost(56);
		ll.addPost(22);
		ll.addPost(68);
		ll.addPost(35);
		ll.addPost(73);
		ll.addPost(15);
		ll.print();*/
		
		/*ll.addPre(56);
		ll.addPre(22);
		ll.addPre(68);
		ll.addPre(35);
		ll.addPre(73);
		ll.addPre(15);
		ll.print();
		System.out.println("==========");
		ll.delete(68);
		ll.print();*/
		
		/*Student s1=new Student("Bob",01);
		Student s2=new Student("Rob",02);
		Student s3=new Student("Jam",03);
		Student s4=new Student("Sam",04);
		Student s5=new Student("Tom",05);
		Student s6=new Student("Ram",06);
		LinkedListObject lo=new LinkedListObject();
		lo.addPre(s1);
		lo.addPre(s2);
		lo.addPre(s3);
		lo.addPre(s4);
		lo.addPre(s5);
		lo.addPre(s6);
		lo.print();
		System.out.println("=======");*/
		/*lo.addPost(s1);
		lo.addPost(s2);
		lo.addPost(s3);
		lo.addPost(s4);
		lo.addPost(s5);
		lo.addPost(s6);
		lo.print();*/
		//System.out.println("==");
		/*lo.delete("ram");
		lo.print();*/
		
		TreeInt t=new TreeInt();
		t.insert(45);
		t.insert(66);
		t.insert(96);
		t.insert(32);
		
	}
}