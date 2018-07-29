//package RevisionPractice;

import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;

public class HashMap {
/*
 * 4 Implementations of the Map interface
 * HashMap	Hashtable	LinkedHashMap	TreeMap
 */
	public static void main(String[] args) {
		/*
		HashMap hmap = new HashMap ();
		TreeMap<Integer,String> t = new TreeMap();
		t.put(4, "Ajay");
		t.put(3, "Ramu");
		t.put(1, "Cjay");
		t.put(2, "Bijay");
		t.put(1, "Sonia");
		
		for (Integer i:t.keySet()) {
			System.out.println("Keys: "+i);
		}
		for (String s:t.values()) {
			System.out.println("Values: "+s);
		}*/
		ArrayList a = new ArrayList ();
		a.add("Bablu");
		a.add(34);
		a.set(1, "bubblegum");
		
		ListIterator it = a.listIterator();
			while (it.hasNext()) {
			System.out.print(it.nextIndex()+" ");
			System.out.println(it.next());
			//a.add("doggy");
			//a.set(1, "Ram");
		}
	}
}