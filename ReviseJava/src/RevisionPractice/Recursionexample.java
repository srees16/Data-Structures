//package RevisionPractice;
import java.util.Scanner;

public class Recursionexample {
	public static void main(String[] args) {
		
		System.out.println("The factorial is " + harmonic(1));
		System.out.println(word("alpha"));
		System.out.println(myfactor(9));
		System.out.println(reversal("welcome"));
		System.out.println(nameback("jackass"));
	}
	//Write a program to reverse a string
		
		public static String reversal (String s) {
			if (s.length()>=1) {
				return reversal (s.substring(1))+s.charAt(0);
			} else {
				return s;
			}
		}
		public static String word (String s) {
			if (s.length()<=1){
				return s;
			} else {
				return word (s.substring(1))+s.charAt(0);
		}
	}

	public static double harmonic(int n) {
		if(n <= 1) {
			return 1;
	    } else {
	        return ( n* harmonic(n - 1));
	    }		
	}	

//Write a program to find the factorial of 25
	
	public static long myfactor (long l) {
		if (l<=1) {
			return 1;
		} else {
			return l*(myfactor(l-1));
		}
	
	}
	
//Write a program to reverse the input string using Recursion
	
		public static String nameback (String t) {
			if (t.length()<=1) {
				return t;
			} else {
				return nameback (t.substring(1))+t.charAt(0);
		}
	}
}