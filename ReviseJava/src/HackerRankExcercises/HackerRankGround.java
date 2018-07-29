package HackerRankExcercises;

import java.math.BigInteger;
import java.util.Scanner;

public class HackerRankGround {

	public static void main(String[] args) {
		

/*If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
*/
		/*
		Scanner scans = new Scanner (System.in);
		System.out.println("Alphanumeric plz");
		String str = scans.next();
		int num = scans.nextInt();
		//scans.close(); I dint get this why!
		
		System.out.println("string is " + str);
		System.out.println("int is " + num);
		*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. ");
		int n = sc.nextInt();            
		String ans="";
		if(n%2==1 || n>=6 && n<=20){
			ans = "Weird";
		}
		else if (n >=2 && n<=5 || n>20) {
			ans = "Not Weird";
		}
		System.out.println(ans);*/

//Java Stdin and Stdout II
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Input please: ");
		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = scan.next();
		scan.close();

		System.out.println("Int: " + i);
		System.out.println("Double: " + d);
		System.out.println("String: " + s);*/
		
//Example of BigInteger class/method
		/*
		Scanner ss = new Scanner (System.in);
		BigInteger b1=ss.nextBigInteger();
		BigInteger b2=ss.nextBigInteger();
		
		BigInteger add = b1.add(b2);
		BigInteger multiply = b1.multiply(b2);
		System.out.println(add);
		System.out.println(multiply);
		*/
//Given an integer,N,print its first 10 multiples.Each multiple Nxi (where 1<=i<=10) should be printed on a new line in
// the form: N x i = result.
		/*
		System.out.println("Enter value of N: ");
		Scanner ss = new Scanner (System.in);
		int N=ss.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.println(N +" x " +i+" = "+N*i);
		}*/
	}
}