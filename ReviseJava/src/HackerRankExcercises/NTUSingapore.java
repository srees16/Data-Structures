package HackerRankExcercises;
import java.util.Scanner;

public class NTUSingapore {
	
	public static void main(String[] args) {
		
		/*thisExcercise te = new thisExcercise ();
		System.out.println(te.t);
		te.t=450;
		System.out.println(te.t);
		
		System.gc();
		Runtime.getRuntime().gc();*/
		/*
		FinalexampleMain fe = new Finalexample1 ();
		FinalexampleMain fee= new Finalexample2 ();
		*/
		
//System.out.println("The factorial for " +10+" is " + guitar (10));

//Enter n numbers & find sum of only odd nos the input
		
		/*int x;
		int sum=0;
		Scanner scan = new Scanner (System.in);
		System.out.println("How many numbers: ");
		int i = scan.nextInt();
		for (int p=1;p<=i;p++) {
			System.out.println("Enter "+p+" number: ");
			x = scan.nextInt();
			if(x%2==1) {
				sum+=x;
			}
		}
		System.out.println("sum is "+sum);*/
		
//Enter n numbers & find sum of only odd nos the input
		/*int a;
		int summ=0;
		Scanner scans = new Scanner (System.in);
		System.out.println("How many numbers: ");
		int j = scans.nextInt();
		for (int p=1;p<=j;p++) {
			System.out.println("Enter "+p+" number: ");
			a = scans.nextInt();
			if(a%2==0) {
				summ+=a;
			}
		}
		System.out.println("sum is "+summ);*/
/*		
Write a program called GradesAverage, which prompts user for the number of students, reads it from the keyboard,and
saves it in an int variable called numStudents.It then prompts user for the grades of each of the students and saves
them in an int array called grades.Your program shall check that the grade is between 0 and 100.
*/
/*
*Algorithm*
1-ask user to input no of students
2-take that input n store in a variable
3-ask user those many times to input grade for the no of students he entered earlier at 1
4-terminate asking beyond the entered no of students
5-do calculation for average of the grades n print it
*/
		
		/*double sum=0;
		double avg=0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter No of students");
		int no = scan.nextInt();
		for (int i=1; i<=no; ++i) {
			System.out.println("Enter grade for student "+i+" : ");
			int m = scan.nextInt();
				while (m>100) {
					System.out.println("Invalid grade, try again");
					m = scan.nextInt();
				}
			sum+=m;
			avg=sum/i;
		} System.out.println("Average is "+avg);*/
		
//Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50;
//or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
		/*
		Scanner input = new Scanner (System.in);
		System.out.println("Enter marks");
		int mark = input.nextInt();
		if (mark>=50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("DONE");	
		*/
//Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” 
//otherwise.The program shall always print “BYE!” before exiting.
		/*
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		if (number%2==1) {
			System.out.println("The no is ODD!");
		}
		else {
			System.out.println("The no is EVEN!");
		}
		System.out.println("BYE");
		*/
/*Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" 
is 1, 2,... , 9, or other, respectively. Use (a) a "nested-if" statement; (b) a "switch-case" statement.*/
		/*
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int number = sfc.nextInt();
		
		switch (number) {
			case 1:	System.out.println("One");
			break;
			case 2:	System.out.println("Two");
			break;
			case 3:	System.out.println("Three");
			break;
			case 4:	System.out.println("Four");
			break;
			case 5:	System.out.println("Five");
			break;
			case 6:	System.out.println("Six");
			break;
			case 7:	System.out.println("Seven");
			break;
			case 8:	System.out.println("Eight");
			break;
			case 9:	System.out.println("Nine");
			break;
			default: System.out.println("Other");
			break;
			}
		*/
		/*
		if (number ==1) {
			System.out.println("One");
		}
		else if (number ==2){
			System.out.println("Two");
		}
		else if (number ==3){
			System.out.println("Three");
		}
		else if (number ==4){
			System.out.println("Four");
		}
		else if (number ==5){
			System.out.println("Five");
		}
		else if (number ==6){
			System.out.println("Six");
		}
		else if (number ==7){
			System.out.println("Seven");
		}
		else if (number ==8){
			System.out.println("Eight");
		}
		else if (number ==9){
			System.out.println("Nine");
		}
		else if (number >=10){
			System.out.println("Other");
		}
		*/

/*Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” if the int variable "day" is
0, 1, ..., 6, respectively.  Otherwise, it shall print “Not a valid day”. Use (a) a "nested-if" statement;
(b) a "switch-case" statement.
*/
		/*
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Day");
		int day = sc.nextInt();
		
		if (day == 1) {
			System.out.println("Sunday");
		}
		else if (day == 2) {
			System.out.println("Monday");
		}
		else if (day == 3) {
			System.out.println("Tuesday");
		}
		else if (day == 4) {
			System.out.println("Wednesday");
		}
		else if (day == 5) {
			System.out.println("Thursday");
		}
		else if (day == 6) {
			System.out.println("Friday");
		}
		else if (day == 7) {
			System.out.println("Saturday");
		}
		else if (day >= 8) {
			System.out.println("Not a valid day");
		} */
		/*
		switch (day) {
		
		case 1:	System.out.println("Sunday");
			break;
		case 2:	System.out.println("Monday");
			break;
		case 3:	System.out.println("Tuesday");
			break;
		case 4:	System.out.println("Wednesday");
			break;
		case 5:	System.out.println("Thursday");
			break;
		case 6:	System.out.println("Friday");
			break;
		case 7:	System.out.println("Saturday");
			break;
		default: System.out.println("Not a valid day");
			break;
		} */
		
/*Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.
The output shall look like:
		The sum is 5050
		The average is 50.5

		int avg=0;
		int c=0;
		int s=0;
		for (int i=1; i<=100; i++) {
			s+=i;
			c++;
			avg=s/c;
		}
		System.out.println("The sum is " + s);
		System.out.println("The avg is " + avg);
*/
		
//Using FOR loop, adding only odd numbers
		/*
		double sum = 0;
		double avg;
		int count=0;
		int hn = 5; //(For initiating without scanner input)
		
		for (int i=1; i<=hn; ++i) {
			if (i%2!=0) {
				sum += i;
				count++;
			}
		}
		avg = sum/count;
		
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + avg);
		System.out.println("The count is " + count);
		*/
		
//Using WHILE loop
		/*
		int ln=0, hn=50;
		double sum=0;
		double avgs;
		while (ln<=hn) {
			sum+=ln; //same as sum = sum+ln
			ln++;
		}
		avgs = sum/100;
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + avgs);
		*/
		/*
//Using DO-WHILE loop
		double sum=0;
		double avg;
		
		Scanner fn = new Scanner (System.in);
		System.out.println("Enter lowest no. ");
		int ln = fn.nextInt();
		Scanner sn = new Scanner (System.in);
		System.out.println("Enter highest no. ");
		int hn = sn.nextInt();
		
		do {
			sum+=ln;
			ln++;
		} while (ln<=hn);
		avg = sum/100;
		
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + avg);
		*/
		
//Modify the program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.
		/*
		int sum = 0;
		double avg;
		int count=0;
		
		Scanner nos = new Scanner (System.in);
		System.out.println("Enter lowest no. ");
		int ln = nos.nextInt();
		System.out.println("Enter highest no. ");
		int hn = nos.nextInt();
		
		for (int i=ln; i<=hn; ++i) {
			if (i%7==0) {
				sum += i;
				count++;
			}	
		} avg = sum/count;
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + avg);
		System.out.println("The count is " + count);
		*/
		
//Modify it to find the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100
		/*
		int sum = 0;
		double avg;
		int count=0;
		int ln = 1;
		int hn = 100;
		
		for (int i=ln; i<=hn; ++i) {
				sum += i*i;
				count++;
		} avg = sum/count;
		
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + avg);
		System.out.println("The count is " + count);
		*/
//Write a program to compute the product of integers 1 to 10 (i.e., 1×2×3×...×10)
		/*
		long product = 1;
		double avg;
		int count = 0;
		int ln = 1;
		int hn = 14; //For initiating without scanner input
		
		for (int i=ln; i<=hn; ++i) {
			product*=i; //same as product = product*i
				count++;
		}
		System.out.println("The product is " + product);
		System.out.println("The no of elements are: " + count);
		*/
		
//Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000.
//The program shall compute the sum from left-to-right as well as from the right-to-left.
		/*
		This is same as below FOR loop
		{{for (int x=1; x<=50000; x++) {
			l2rsum += (double)(1)/x; //same as l2rsum = l2rsum+((double)(1)/x) 
		} System.out.println(l2rsum);}}
		*/
		/*
		double fn=1;
		int maxn = 50000;
		double l2rsum = 0;
		double r2lsum = 0;
		
		for (double toll=1; toll<=maxn; toll++) {
			l2rsum +=(fn/toll); //same as l2rsum = l2rsum+(fn/toll)
		} System.out.println("The L2R sum of harmonic progression for "+maxn + " numbers is " + l2rsum);
		for (double tool=1; tool<=maxn; tool++) {
			r2lsum += fn/(maxn-tool+1); //r2lsum = r2lsum+fn/(maxn-tool+1)
		} System.out.println("The R2L sum of harmonic progression for "+maxn + " numbers is " + r2lsum);
		
		System.out.println("The difference between L2R and R2L is " + (r2lsum-l2rsum));
		*/
		//System.out.println(harmonic(9)); //Method for this output is at the bottom under Recursion
/*
	public static long guitar (long h) { //Recursion example
		
		if (h<=1)
			return 1;
		else return (h * guitar(h-1));
	}
	*/
//Using Recursion
	/*
	public static double harmonic (double n) {
		if (n<=1) {
			return 1;
		} else {
			return (1/n)+harmonic(n-1);
		}
		
	}
	*/
/*
* Write a program called GaddiMuddiDoddi which prints the numbers 1 to 110, 11 numbers per line.
* The program shall print "Gaddi" in place of the numbers which are multiples of 3, "Muddi" for multiples of 5,
* "Doddi" for multiples of 7, "GaddiMuddi" for multiples of 3 and 5, and so on.
* The output shall look like:
1 2 Gaddi 4 Muddi Gaddi Doddi 8 Gaddi Muddi 11 etc
*/		
		/*for (int x=1; x<=110; x+=1) {
			if (x%3==0 && x%5==0) {
				System.out.print(" GaddiMuddi");
			} else if (x%3==0) {
				System.out.print(" Gaddi");
			} else if (x%5==0) {
				System.out.print(" Muddi");
			} else if (x%7==0) {
				System.out.print(" Doddi");
			} else if (x%3!=0 || x%5!=0 || x%7!=0) {
				System.out.print(" " +x + "");
			} if (x%11==0) {
				System.out.println("");
			}
		}*/
		
//Write a program to find the sum of square roots for n natural numbers
		/*
		int s=0;
		for (int i=1;i<=4;i++) {
			s+=(int)Math.pow(i, 2);
		}
		System.out.println(s);
		*/
		//tribonacci(7);
		
//Write a program to display Fibonacci series. For ex: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.

		/*int index = 0;
		int next = 1;
		int incr = 0;

		System.out.print( index + ", " + next );

		for ( int i = index; i < 10; ++i) {
		incr = index + next;
		System.out.print(", " + incr );
		index = next;
		next = incr;
		}*/
		
//Write a program to extract each digit from an int, in the reverse order. For 12345, output should be 54321
		/*int x=785;
		while (x>0) {
			int d = x/10;
			int k = x%10; 
			x=d;
			System.out.print(k);
		}*/
		/*int n = 654;  //Prefer this bcoz its more intuitive
		while (n>0) {
			int digit = n%10;
			System.out.print(digit);
			n = n/10; 
			digit=n;
			}*/
		
		/*int no=4356;
		while(no>0) {
			int digit=no%10;
			System.out.print(digit);
			no=no/10;
			digit=no;
		}*/

//Write a program called SquareBoard that displays the following n×n (n=5) pattern using two nested for-loops.
		
		/*for (int i=0; i<7;i++) {
			for (int j=0; j<=7; j++) {
				System.out.print("# ");
			} System.out.println();
		}
		
		for (int i=0; i<=8;i++) {
			for (int j=0; j<i; j++) {
				System.out.print("# ");
			} System.out.println();
		}
		
		for (int row=0; row<=5; row++) {
			for (int col=0; row+col<5; col++) {
				System.out.print(" # ");
			} System.out.println();
		}*/
		
		/*
		for (int row=0; row<=5; row++) {
			for (int col=5; col>=row; col--) {
				System.out.print(" # ");
			} System.out.println();
		}
		*/
		/*
		for (int row=0; row<=5; row++) {
			for (int col=5; col<=row-5; --col) {
				System.out.print(" # ");
			} System.out.println();
		}
		*/
//Write a program to produce the multiplication table of 1 to 9 as shown using two nested for-loops
		/*
		System.out.print("* | ");
		for (int i=1; i<=10;i++) {
			System.out.print("  "+i);
		} System.out.println();
		for (int j=1;j<=35; j++) {
			System.out.print("-");
		}
		for (int s=1; s<=10;s++) {
				System.out.println();
				System.out.print(""+s+ " | ");
			
				for (int m=1;m<20;m++) {
					if (m%2==0) {
						System.out.print("  "+m);
			}
		}
	}*/
//Print multiples of 2

		/*
		for (int n=0; n<=20; n++) {
			if (n%2==0) {
				System.out.print(" "+ n);
			}
		} */

//Write a program called KeyboardScanner to prompt user for an int, a double, and a String.
		/*
		Scanner sn = new Scanner (System.in);
		System.out.println("Enter Name");
		String name = sn.nextLine();
		System.out.println("Luck No plz");
		int no = sn.nextInt();
		System.out.println("Time in your watch");
		double db = sn.nextDouble();
		double sum = no+db/2;
		System.out.println("So Mr. " + name +" the best time to go out today is " + sum );
		*/
//Write a program called CircleComputation, which prompts user for a radius (in double) and compute the area and
//circumference of the circle rounded to 2 decimal places.
		/*
		//Formula for Circumference = 2PIr
		//Formula for Area = PIr^2
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Radius of Circle");
		double radius = sc.nextDouble();
		double area = Math.PI*(radius*radius);
		double circumference = 2*Math.PI*radius;
		System.out.println("Area is "+area+ " circumference is "+ circumference);
		*/
//Modify the above exercise. The program shall repeatedly prompt for the radius, until the user enters -1.
		/*
		int number;
		String ans="";
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("Enter any number NOT less than 0!");
			int num = sc.nextInt();
		while (num>0) {
			double area = Math.PI*(num*num);
			double circumference = 2*Math.PI*num;
			System.out.println("Area is "+area+ " circumference is "+ circumference);
			num= sc.nextInt();
		}
		System.out.println("You wanna continue? Yes/No");
			ans = sc.next();
		} while (ans.equalsIgnoreCase("yes"));*/
		
		
//Write a program called PhoneKeyPad, which prompts user for a String (case insensitive), and converts to a sequence of
//keypad digits. Use a nested-if (or switch-case) in this exercise.
		/*
		String ss="F";
		if (ss=="A" || ss=="B" || ss=="A") {
			System.out.println("1");
		} else if (ss=="C" || ss=="D" || ss=="E") {
			System.out.println("2");
		} else if (ss=="F" || ss=="G" || ss=="H") {
			System.out.println("3");
		}
		*/
		System.out.println();
		//System.out.println(backwards("ritas"));
		//System.out.println(word("tap"));
		//System.out.println(words("jacks"));
		//System.out.println(palincheck("radar"));
		//palintest(s);
}//End of Main Method
	
	public static String backwards (String b) {
		if (b.length()<=1) {
			return b;
		} else {
			return backwards (b.substring(1))+b.charAt(0);
		}
	}
	
// This throws error due to incorrect code, need to fix it. Program is to write code to find if an input string is a palindrome or not.
	/*
	static String s = "radar";
	public static String palintest (String s) {
		String x = palintest (s.substring(1))+s.charAt(0);
		if (s.equals(x)) {
			System.out.println("yes palindrome");
		} else {
			System.out.println("Nope!");
		} return s;
	}*/
	
	public static boolean palincheck (String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}

	public static String word (String s) {
		if (s.length()<=1){
			return s;
		} else {
			return word (s.substring(1))+s.charAt(0);
	}
}

//Write a program called ReverseString, which prompts user for a String, and prints the reverse of the String.	
	
	public static String words (String s) {
		if (s.length()<=1){
			return s;
		} else {
			return word (s.substring(1))+s.charAt(0);
	}
}
	public static String reverseword (String g) {
		if (g.length()>1)
			return reverseword(g.substring(1))+g.charAt(0);
		return g;
	}
//Write a program to print Tribonacci series. Ex 0,1,2,3,6,11...
	
	/*public static void tribonacci (int t) {
		int a=0;
		int b=1;
		int c=2;
		int d=0;
		System.out.print(a + " , " + b+ " , " + c);
		for (int i=1;i<=t;i++) {
			d=a+b+c; //same as series=series+(a+b+c)
			System.out.print (" , " + d);
			a=b;
			b=c;
			c=d;
		}
	}*/

}