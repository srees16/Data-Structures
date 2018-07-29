//package RevisionPractice;

public class StaticShit {
		
	static int count;
	int dambill=90;
	String firstname;
	String lastname;
	
	public static int jambill=890;
	protected static int kambill=900;
	private static int jambal;
	
	public static int getJambal() {
		return jambal;
	}
	public static void setJambal(int jambal) {
		StaticShit.jambal = jambal;
	}
	private int dambill (int d) {
		return d;
	}
/*
 If a static variable v is not initialized in the class and need to be initialized in the constructor or a method, its
 suggested that the static variable v be created in a static block
 */
	static {
		count=0;
		//count++;
		System.out.println("Static block called: "+count);
	}
	static {
		count++;
		System.out.println("Static block 2 called: "+count);
	}
	String s;
		StaticShit () {
			count++;
			System.out.println("Constructor called "+count);
		}
		void givecount () {
			count++;
			System.out.println("Void non-static called "+count);
		}
		void givecount (String name) {
			s=name;
			count++;
			System.out.println("Void non-static with a parameter called "+count+" "+s);
		}
		public static void methcount () {
			count++;
			System.out.println("Void static called "+count);
		}
		StaticShit (String fn, String ln) {
			firstname=fn; lastname=ln;
		}
		StaticShit (String fn) {
			//firstname="Mr "+fn; lastname=" ";
			this (fn," ");
		}
}