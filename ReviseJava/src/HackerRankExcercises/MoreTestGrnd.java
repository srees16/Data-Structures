package HackerRankExcercises;
import java.util.Scanner;

public class MoreTestGrnd {

	public static void main(String[] args) {
		/*
		int x=1234;
		while (x>0) {
			int digit=x%10;
			System.out.print(""+digit);
			x=x/10;
			digit=x;
		}
		*/
		/*
		thisExcercise te = new thisExcercise ();
		te.oncemore();
		te.t=8322;
		te.oncemore();*/
		//thisExcercise tex = new thisExcercise (3345,"poppy");
		System.out.println(thepalin("yummuy"));	
		//System.out.println(isOdd(323));
		//System.out.println(isEven(349));
		//System.out.println(hasEight(16));

//To sum the even nos from the user's input
		/*
		int sum=0;
		int a=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the count of your numbers: ");
		int n=sc.nextInt();
		while (n>0) {
			for (int i=1;i<=n;i++) {
				System.out.println("Enter " + i +" number ");
				a=sc.nextInt();
			if (a%2==0) {
				sum+=a;  //sum=sum+a
				}
			} System.out.println(sum);
			System.out.println("Do you want to continue playing? Yes/No");
			String s=sc.next();
			while (s.equalsIgnoreCase("no"));
		} System.out.println("Thanks for Playing!!"); */
	}
	
//Write a program called TestPalindromicWord, that prompts user for a word and prints ""xxx" is|is not a palindrome"	
	public static boolean mypalin (String [] c){
		int m = 0;
		int n = c.length - 1;
		while (n > m) {
			if (c[m] != c[n]) {
				return false;
	            }
	      	++m;
	        --n;
	} return true;
}
	public static boolean thepalin (String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}

//Write a boolean method called isOdd() which takes an int as input and returns true if the it is odd.
	/*
	public static boolean isOdd (int o) {
		if (o%2!=0)
			return true; //condition if odd, then true
		else
			return false;
	}
//Write a boolean method called isEven() which takes an int as input and returns true if the it is odd. 
	public static boolean isEven (int e) {
		if (e%2==0)
			return true;
		else
			return false;
	}
//Write a boolean method which takes an int as input and returns true if the number contains the digit 8 (e.g., 18, 808)
	/*
	public static boolean hasEight (String ae) {
		
	} */
}