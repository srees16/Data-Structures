//package RevisionPractice;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
import HackerRankExcercises.HackerRankGround;

public class PracticePlayground {

//Practice Static keyword
//Practice Final keyword
//Practice THIS keyword
/*
 * A void non-static method in a child class can be called in to main class via the object and its method name
 * You cannot instantiate or create an object out of a class which is declared as abstract
 * A method can be made abstract only if its class is declared abstract
 * A constructor in a child class can be called in to main class by just instantiating the object
 *Static method can access only non static member variables
*/
	static {
		counter=1;
	}
	public static void main(String[] args) {
		
		Runtime.getRuntime().gc();
		System.gc();
		
		StaticShit ss=new StaticShit ();
		StaticShit.setJambal(33);
		System.out.println(StaticShit.getJambal());
		StaticShit.methcount();
		ss.givecount();
		ss.givecount("hey");
		ss.givecount("hello");
		ss.givecount("haai");
		StaticShit.methcount();
		System.exit(counter);
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		
		for (Integer x:list)
			System.out.println(x);
		System.out.println("Size of list "+list.size());
		System.out.println(list.contains(8));
		list.remove(0);
		for (Integer x:list)
			System.out.println(x);
		System.out.println("Size of list "+list.size());
		
		Family fm = new mother ();
		fm.familytree();
		
		PracticePlayground pg = new PracticePlayground ();
		interestrate();
		pg.interesting();
		pg.f=501;
		pg.interesting();
		saymyname ("Ram");
		System.out.println(pg.d);
		
		pg.setAccountno(53355);
		System.out.println(pg.getAccountno());
		pg.setCity("Vizag");
		System.out.println(pg.getCity());
		pg.setHolder("Memyself");
		System.out.println(pg.getHolder());
		
		pg.newadmissions("Ram");
		pg.newadmissions("Rahim");
		pg.newadmissions("Ronaldo");
		
		pg.findpi();
		
		mother d = new daughter ();
		mother s = new son ();
		daughter dd = new daughter ();
		
		d.characteristics();
		s.characteristics();
		dd.rani();
		dd.vani();
		
		polygon sq = new square(8,10);
		polygon tr = new triangle(8,18);
		polygon rc = new rectangle(5,8);
		sq.polygonarea();
		tr.polygonarea();
		
		InterfaceMain f1 = new forCircle (3);
		InterfaceMain f2 = new forCircle (4);
		InterfaceMain fr = new forRhombus ();
		
		forRhombus.rhombusarea(12, 11);
		forCircle.circlearea(4);
		
	}//end of main method
	
		static int counter;
		int f = 9;
		double d = 343.4;
		boolean b = true;
		final double PI=3.14;
		
		void findpi () {
			//PI=1.23;
			System.out.println("value of PI is: "+PI);
		}
		static void interestrate () {
			int ir=657;
			System.out.println("Interest rate "+ir);
		}
		void interesting () {
			int f=10;
			System.out.println("Interesting rate "+this.f);
		}
		static String saymyname (String s) {
			System.out.println(s);
			return s;
		}
		PracticePlayground () {
			
		}
		private int accountnos (int ac) {
			return ac;
		}
		void banks () {
			
		}
		private int accountno;
		private String holder;
		private String city;
		
		public int getAccountno() {
			return accountno;
		}
		public void setAccountno(int accountno) {
			this.accountno = accountno;
		}
		public String getHolder() {
			return holder;
		}
		public void setHolder(String holder) {
			this.holder = holder;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		void newadmissions (String u) {
			System.out.println("Student admitted "+counter+" for "+u);
			counter++;
		}
}