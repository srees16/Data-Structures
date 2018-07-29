//package RevisionPractice;

public class ExcerciseStatic {
		int ano;
		static int count;
		
		public static void getano () {
			
		}
		public static int findno (int n) {
			return n;
		}
//Static blocks
		static {
			count++;
			System.out.println("Static block 1 called "+count);
		}
		static {
			count++;
			System.out.println("Static block 2 called "+count);
		}
//All types of constructor methods
		ExcerciseStatic () {
			count++;
			System.out.println("Constructor called now! "+count);
		}
		ExcerciseStatic (int y) {
			count++;
			System.out.println("Constructor with a single parameter called now! "+count);
		}
		ExcerciseStatic (String y) {
			count++;
			System.out.println("Void Constructor with a single parameter called now! "+count);
		}
		
}