//package RevisionPractice;

import java.math.BigInteger;

public class RecursionPractice {

	public static void main(String[] args) {
		System.out.println(findfactorial(9));
		System.out.println(factory(3));
		System.out.println(RecursionPractice(5));
	}
	
	public static long findfactorial (int n) {
		if (n<=1) {
			return 1;	
		} else {
			return n*findfactorial(n-1);
		}
	}
	public static int factory (int f) {
		if (f<=1) {
			return 1;
		} else return f*factory(f-1);
	}
	
	static int RecursionPractice (int f) {
		if (f<=1) {
			return 1;
		} else return f*factory(f-1);
	}
}