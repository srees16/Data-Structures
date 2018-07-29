package DataStructures;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NTUSingapore2 {

	public static void main(String[] args) {
		
/*Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.
The program shall always print “DONE” before exiting.*/
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks:");
		int m=sc.nextInt();
		if(m>=50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		System.out.println("Done");*/
		
/*Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise. The program
shall always print “BYE!” before exiting.*/
		
		/*System.out.println("Enter a no");
		int oe=sc.nextInt();
		if(oe%2==0) {
			System.out.println("Even No!");
		} else {
			System.out.println("Odd No!");
		}
		System.out.println("Bye!");*/
		
/*Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or 
other, respectively. Use (a) a "nested-if" statement; (b) a "switch-case" statement.*/
		
		/*System.out.println("Enter a no");
		int word=sc.nextInt();
		
		switch(word) {
		case 1: System.out.println("One");
		break;
		case 2: System.out.println("Two");
		break;
		case 3: System.out.println("Three");
		break;
		case 4: System.out.println("Four");
		break;
		case 5: System.out.println("Five");
		break;
		default: System.out.println("I cant count man!");
		break;
		}
		*/
		/*System.out.println("Enter Initials of country");
		String s=sc.nextLine();
		
		switch(s) {
		case "In": System.out.println("India");
		break;
		case "Us": System.out.println("USA!");
		break;
		default: System.out.println("Cant verify the country!");
		}*/

//Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.
		
		/*int sum = 0,count=0;
		double avg = 0;
		for(int i=1;i<=100;i++) {
			sum=sum+i;
			count++;
			avg=sum/count;
		}
		System.out.println("sum is "+sum);
		System.out.println("average is "+avg);*/
		
		/*int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the highest no");
		int hn=sc.nextInt();
		System.out.println("Enter the lowest no");
		int ln=sc.nextInt();
		while(ln<=hn) {
			if(ln%2!=0)
				sum+=ln;
				ln++;
		}
		System.out.println("Sum is "+sum);*/
		
		/*double sum=0;
		double avg=0;
		double count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the highest no");
		double hn=sc.nextDouble();
		System.out.println("Enter the lowest no");
		double ln=sc.nextDouble();
		do {
			if(ln%2!=0)
				sum=sum+ln;
				++ln;
				avg=sum/ln;
		} while(ln<=hn);
		System.out.println("Sum is "+sum+ " and average is "+avg);*/
		
//Modify the program to find the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100
		
		/*double sum=0;
		double avg=0;
		double count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the highest no");
		double hn=sc.nextDouble();
		System.out.println("Enter the lowest no");
		double ln=sc.nextDouble();
		do {
			sum+=ln*ln;
			++ln;
			avg=sum/ln;
		} while(ln<=hn);
		System.out.println("Sum is "+sum+ " and average is "+avg);*/

/*Write a program called Product1ToN to compute the product of integers 1 to 10 (i.e., 1×2×3×...×10). Try computing the product from 1 to 11,
1 to 12, 1 to 13 and 1 to 14. Write down the product obtained and explain the results.*/
		
		/*long prod=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N: ");
		long n=sc.nextLong();
		for(int i=1;i<=n;i++) {
			prod*=i;
		}
		System.out.println("Product1ToN is "+prod);*/
				
/*Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000. The program shall compute the
sum from left-to-right as well as from the right-to-left. Obtain the difference between these two sums and explain the difference. Which sum 
is more accurate?*/
		
		/*int bn=10;
		int fn=1;
		int n=0;
		for(int i=1;i<=n;i++) {
			n=n+(1/n);
			
		}*/
/*Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. The program shall print "Coza" in place of the 
numbers which are multiples of 3, "Loza" for multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on.*/
		
		/*int lb=1, ub=110;
		for(int i=lb;i<=ub;++i) {
			if(i%3==0 && i%5==0) {
				System.out.println("CozaBoza ");
			} else if(i%3==0) {
				System.out.print("Loza ");
			} else if(i%5==0) {
				System.out.print("Woza ");
			} else if(i%3!=0 || i%5!=0) {
				System.out.print(""+i+" ");
			} if(i%11==0) {
				System.out.println(" ");
			}
		}*/
/*Write a program for Fibonacci sequence*/
		
		/*int index=0,next=1,incr=0;
		System.out.print(index+", "+next);
		for(int i=1;i<10;++i) {
			incr=index+next;
			System.out.print(", "+incr);
			index=next;
			next=incr;
		}*/
/*Write a program for Tribonacci sequence*/
		
		/*int a=0;
		int b=1;
		int c=2;
		int d=0;
		System.out.print(a+","+b+","+c);
		for(int i=1;i<5;++i) {
			d=a+b+c;
			System.out.print(","+d);
			a=b;
			b=c;
			c=d;
		}*/
		
//Write a program to reverse a number and print it
		
		/*int n=5742;
		while(n>0) {
			int digit=n%10;
			System.out.print(digit);
			n=n/10;
		}*/
//Write a program called SquareBoard that displays the following n×n (n=5) pattern using two nested for-loops.
		
		for(int i=0;i<5;++i) {
			for(int j=0;j<=5;j++) {
				System.out.print("# ");
			} System.out.println();
		}
		System.out.println("======");
		for(int i=0;i<=5;++i) {
			for(int j=i;j<=5;j++) {
				System.out.print("# ");
			} System.out.println();
		}
		System.out.println("======");
		for(int i=0;i<=5;++i) {
			for(int j=0;j<=i;j++) {
				System.out.print("# ");
			} System.out.println();
		}
		
	}
}