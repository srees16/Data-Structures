//package RevisionPractice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListWorkout {

	public static void main(String[] args) {
		
		LinkedList list1 = new LinkedList ();
		list1.add("Anil");
		list1.add(2);
		list1.add('A');
		list1.add(12.3);
		list1.set(1, 1);
		System.out.println(list1);
		System.out.println(list1.size());
		
		Long mills;
		mills = System.currentTimeMillis();
		LinkedList list2 = new LinkedList ();
		list2.add("Bunny");
		list2.add(2);
		list2.add('B');
		list2.add(12.5);
		list2.addFirst("Banny");
		System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1.size()+" items in "+list1);
		
		if (list1.containsAll(list2)) {
			System.out.println("All elements in List 2 are present in List 1!!"+list1);
		} System.out.println("Time taken: "+(System.currentTimeMillis()-mills)+" ms");
		if (list1.contains("Anil")) {
			System.out.println("The item u searching for is present");
		} else {
			System.out.println("Item not found");
		}
		list2.remove("Banny");
		System.out.println(list2+" here!");
		
		String randomthings [] = {"Australia", "Brazil", "Canada","Denmark"};
		List <String> countries = new LinkedList<String>();
		for (String a:randomthings) {//converting array into list
			countries.add(a);
		} System.out.println(countries);
		
		String randomthings2 [] = {"Pacific", "Atlantic", "Indian","Arabian"};
		List <String> oceans = new LinkedList<String>();
		for (String b:randomthings2) {
			oceans.add(b);
		} System.out.println(oceans);
		countries.addAll(oceans);
		countries.remove(1);
		countries.add(1, "Bharat");
		System.out.println(countries);
		System.out.println("Total list "+countries +" of size "+countries.size());
		
		String [] myassets = {"Bike", "Watch","Pants", "Shirts","Jeans","trolley"};
		List <String> thingsiown = new LinkedList <String>();
		thingsiown.add("laptop");
		thingsiown.add("waterbottle");
		for (String h:myassets) {
			thingsiown.add(h);
		} System.out.println(thingsiown);
		//Converting the list back to array
		myassets = thingsiown.toArray(new String[thingsiown.size()]);
			for (String z:myassets) {
				System.out.print(" "+z);
			} System.out.println("Size is "+myassets.length);
	//Practicing more with LinkedList converstion to array n vice versa
		String [] rbg = {"red","blue","green"};
		for (String r:rbg) {
			System.out.println(r);
		}
		List<String> colors = new LinkedList<String>();
		colors.add("yellow");
		colors.add("pink");
		for (String p:rbg) {
			colors.add(p);
		} colors.set(3, "radium");
		System.out.println(colors);
		rbg = colors.toArray(new String[colors.size()]);
		for (String r:rbg) {
			System.out.println(r);
		}
//More practicing with linkedlist conversion to array and vice versa
		String [] nv = {"Fish", "Chicken", "mutton", "crabs"};
		List<String> nonvegfud = new LinkedList<String> ();
		nonvegfud.add("Eggs");
		for (String v:nv) {
			nonvegfud.add(v);
		} System.out.println(nonvegfud);
		
		nv = nonvegfud.toArray(new String[nonvegfud.size()]);
		for (String v:nv) {
			System.out.println(v);
		}
	//Merging 2 Linked lists
		LinkedList l1 = new LinkedList ();
		l1.add("rice");
		l1.add("Curry");
		System.out.println(l1);
		LinkedList l2 = new LinkedList ();
		l2.add("pappu");
		l2.add("curd");
		System.out.println(l2);
		
		l1.addAll(l2);
		System.out.println("Full course meal is combo of "+l1);
	//Merge 2 String arrays into from single Linkedlist
		String [] danceform1 = {"Kathak-UP", "Odissi-Odiya","Manipuri-Manipur"};
		String [] danceform2 = {"Kathakali-Kerala", "Kuchipudi-Andhra Pradesh","Sattriya-Assam"};
		List <String> Indiandances = new LinkedList<String> ();
		for (String d:danceform1) {
			Indiandances.add(d);
		} System.out.println(Indiandances);
		for (String d:danceform2) {
			Indiandances.add(d);
		} System.out.println(Indiandances);
	//Merge 2 String arrays into single Linkedlist from 2 seperate linked lists
		String [] fruits = {"Apple","Banana","Citrus"};
		String [] veggies = {"Cabbage","brinjal","Potato"};
		LinkedList<String> edible1 = new LinkedList<String>();
		LinkedList<String> edible2 = new LinkedList<String>();
		for (String f:fruits) {
			edible1.add(f);
		} System.out.println(edible1);
		for (String f:veggies) {
			edible2.add(f);
		} System.out.println(edible2);
		edible1.addAll(edible2);
		if (edible1.containsAll(edible2)) {
			System.out.println("All items from edible1 copied to edible2"+edible1);
		} else {
			System.out.println("Items not copied");
		}
		if (edible1.contains("Gongura")) {
			System.out.println("Gongura is present");
		} else {
			System.out.println("Searched item is NOT present");
		}
	}//end of main method
		private static void removing (int p, int o) {
			
		}
}