package HackerRankExcercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigInteger;

public class Arrayexs {

	public static void main(String[] args) {

		
//Check if n is prime no
				/*
				//This fails since 2 and 3 show as NOT PRIME whereas they are primes!
				int n=87;
				if (n%2==0 || n%3==0) {
					System.out.println("N is NOT prime");
				} else {
					System.out.println("N is prime");
				}
				*/
		/*int n=13;
		int m=n/2;
		int flag=0;
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println("N is composite no!");
				flag=1;
				break;
			}
		}
		if (flag==0) {
			System.out.println("N is prime no");
		}*/
		
		//System.out.println(isPrime(4));

//Find biggest of n elements/nos
		
		/*int myarray[]={10,22,145,6,43,66};
		int t = myarray[0];
		for (int i=0;i<myarray.length;i++) {
			if (t<myarray[i]) {
				t=myarray[i];
			}
		} System.out.println(t);*/
		
//Find maximum of n elements/nos using Collections
		/*
		ArrayList<Integer> orey = new ArrayList<Integer>();
		orey.add(18);
		orey.add(72);
		orey.add(34);
		orey.add(41);
		orey.add(25);
		orey.add(96);
		System.out.println(orey);
		Collections.sort(orey); //this will sort the elements in the array by ascending order
		System.out.println(orey);
		System.out.println(orey.get(orey.size()-1));
		*/
//Find maximum of 3 elements
		/*
		if (a>b && a>c) {
			System.out.println(a);
		} else if (b>a && b>c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		} */
		
//Write a program which reads in n grades (of int between 0 and 100, inclusive) and displays the average, minimum, maximum
//median and standard deviation.
		/*
		double sum=0;
		double avg;
		double max;
		double min;
		String ans="";
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of students:");
		int nos=sc.nextInt();
		while (nos>1) {
			for (int i=1;i<=nos;++i) {
				System.out.println("Enter the grade for student " +i+":");
				int g = sc.nextInt();
				sum+=g;
				avg=sum/i;
				max=sum;
				min=sum;
				}System.out.println("Total is: " +sum);
			}
			System.out.println("Do you want to play? YES/NO");
			ans=sc.nextLine();
			while (ans.equalsIgnoreCase("yes")); */
		}
	/*static boolean isPrime(int n) {
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				return false;
			}
		}  return true;
	}*/
}