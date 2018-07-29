package RevisionPractice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.List;
import java.util.HashSet;

public class ArrayListLinkedListWorkout {

	public static void main(String[] args) {
//Start of ArrayList
		long start = System.currentTimeMillis();
		String [] beditems = {"pillow","blanket"};
		ArrayList<String> al = new ArrayList<String> ();
		for (String i:beditems) {
			al.add(i);
		} System.out.println(al);
		int [] beditems2 = {12,24};
		ArrayList more = new ArrayList ();
		for (int i:beditems2) {
			more.add(i);
		} System.out.println(more);
		al.addAll(more);
		al.add("footmat");
		al.set(2, "mosquito net");
		System.out.println("Total bed items are: "+al);
		long end = System.currentTimeMillis();
		System.out.println("Time taken: "+(end-start)+" ms");
//Start of LinkedList
		String [] solarsystem1 = {"Mercury","Venus"};
		String [] solarsystem2 = {"Earth","Mars"};
		LinkedList<String> ss = new LinkedList<String>();
		
		for (String s:solarsystem1) {
			ss.add(s);
		} System.out.println(ss);
		for (String s:solarsystem2) {
			ss.add(s);
		} System.out.println(ss);
		ss.add("Jupiter");
		ss.add("Uranus");
		System.out.println(ss);
		ss.set(5, "Saturn");
		System.out.println("Planets in correct order "+ss);
//Converting the list into string array again
		solarsystem1 = ss.toArray(new String[ss.size()]);
		ListIterator <String> lt = ss.listIterator();
		System.out.println("Iterated list is below:");
		while (lt.hasNext()) {
			System.out.println(lt.next());
		} System.out.println("Without iterator "+ss);
		while (lt.hasPrevious()) { //iterating in reverse order
			System.out.println(lt.previous());
		}
		HashSet hs = new HashSet ();
		hs.add("ass");
		hs.add("ass");
		hs.add("jackass");
		hs.add("bull");
		hs.add("bull");
		hs.add("bullshit");
		hs.add("bullshit");
		
		Iterator i=hs.iterator ();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}