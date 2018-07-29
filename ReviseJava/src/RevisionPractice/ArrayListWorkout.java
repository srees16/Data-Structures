//package RevisionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListWorkout {

	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<String> ();
		
		alist.add("banana");
		alist.add("citrus");
		alist.add("drink");
		alist.add(0, "apple");
		for (String s:alist) {
			System.out.println(s);
		} System.out.println("Size of the array is "+alist.size());
		alist.set(3, "danimma");
		for (String s:alist) {
			System.out.println(s);//this prints the arraylist as list items
		} System.out.println("Size of the array is "+alist.size());
		System.out.println(alist); //this prints the arraylist in array format
		
		ArrayList alltypes = new ArrayList ();
		alltypes.add(34);
		alltypes.add("hey ya");
		alltypes.add(23.53);
		alltypes.add('c');
		System.out.println(alltypes);
		
		alltypes.set(1, "Hey there!");
		System.out.println("Size of all type array is "+alltypes.size());
		Iterator ite = alltypes.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		ArrayList al = new ArrayList ();
		al.addAll(alltypes);
		System.out.println("New list is "+al);
		
		String st = "Jai Hind";
		al.add(st);
		al.remove(2);
		System.out.println("New list is "+al);
		
		if (al.contains("Hey there!")) {
			System.out.println("The searched item is present");
		}
		if (al.containsAll(alltypes)) {
			System.out.println("All elements present in new list AL");
		}
		//al.clear();
		if (al.isEmpty()) {
			System.out.println("Items now present are "+al);	
		}
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add("Mercury");
		list1.add(1.15);
		list1.add('A');
			System.out.println("List 1 items "+list1);
		
		ArrayList list2 = new ArrayList();
		list2.add(2);
		list2.add("Earth");
		list2.add(2.25);
		list2.add('B');
			System.out.println("List 2 items "+list2);
		list2.set(1, "Venus");
		list1.addAll(list2);//adding all the elements in list 2 to list 1
			System.out.println("Combined list items "+list1);
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("Mars");
		list3.add("Jupiter");
		list1.addAll(list3);
			System.out.println("New Combined list items "+list1);
		list3.addAll(list1);
			System.out.println("New Combined list items in List 3 "+list3);
			System.out.println("Size of the combined list is "+list1.size());
		
		String [] p1= {"Mercury","Venus","Earth"};
		String [] p2= {"Jupiter","Saturn"};
		
		ArrayList<String> planet1 = new ArrayList<String> ();
		for (String i:p1) {
			planet1.add(i);
		}
		planet1.add("Mars");
		System.out.println(planet1);
		
		ArrayList<String> planet2 = new ArrayList<String> ();
		for (String i :p2) {
			planet2.add(i);
		}
		planet2.add("Neptune");
		System.out.println(planet2);
		
		planet1.addAll(planet2);
		System.out.println(planet1);
		//Converting the arraylist to string array p1
		p1 = planet1.toArray(new String [planet1.size()]);
		for (String b:p1) {
			System.out.println(b);
		}
		long n = (long) 1E6;
		
		ArrayList all= new ArrayList ();
		long ms = System.currentTimeMillis();
		for (int i=0;i<n;i++) {
			all.add(i);
		} System.out.println("Time taken "+(System.currentTimeMillis()-ms)+" ms");
		
		LinkedList ll= new LinkedList ();
		long ns = System.currentTimeMillis();
		for (int j=0;j<n;j++) {
			ll.add(j);
		} System.out.println("Time taken "+(System.currentTimeMillis()-ns)+" ms");
		
	//Calculate the time taken for completion of operation
		long start = System.currentTimeMillis();
		ArrayList v = new ArrayList ();
		for (int i=0;i<10000000;i++) {
			v.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Array list Time taken "+(end-start)+" ms");
		
		long starts = System.currentTimeMillis();
		LinkedList w = new LinkedList ();
		for (int j=0;j<1000000;j++) {
			w.add(j);
		}
		long ends = System.currentTimeMillis();
		System.out.println("Linked list Time taken "+(ends-starts)+" ms");
	}
}