//package RevisionPractice;

public class FinalexampleMain {
	
	public static void main(String[] args) {
		
		double PI = 534.54;
		methodem e = new methodem ();
		System.out.println(e.PI);
	}
}
	
		class methodem {
		double PI=3.14;
			
		methodem () {
			double PI=23.5;
		}
}
/*
FINAL keyword:
1. Final class cant be subclassed (which means it cant be extended to any other class)
2. Final method cant be overridden by subclass ()
3. Final variable can be initialized only once (an instance variable declared final cant overwrite main class variable 
even by using the THIS keyword)
*/