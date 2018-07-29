//package RevisionPractice;
import java.util.Scanner;

public class FreshBrush {

	public static void main(String[] args) {
//3 types of variables: Class variable, instance variable, local variable
//4 types of Methods: Void,non-void (returning),void with parameters, constructor
		/*
		construkor cons=new construkor ();
		System.out.println(cons.getcount());
		construkor conc=new construkor ();
		System.out.println(conc.getcount());
		System.out.println(construkor.getcount());
		*/
		thisKeyword ex = new thisKeyword ();
		System.out.println(ex.a);
		thisKeyword exs = new thisKeyword ();
		System.out.println(exs.a);
		ex.set();

//Add all odd nos from 1-100
		/*
		int sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter smallest no of the range");
		int s=sc.nextInt();
		System.out.println("Enter biggest no of the range");
		int b=sc.nextInt();
		
		for (int i=s;i<=b;i++) {
			if (i%2!=0) {
				sum+=i;
			}
		} System.out.println("Total of all the odd nos in the given range is "+sum);
		*/
//Add all even nos from 1-100
		/*
		int sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter smallest no in a range: ");
		int s=sc.nextInt();
		System.out.print("Enter biggest no of the range: ");
		int b=sc.nextInt();
		for (int i=s;i<=b;i++) {
			if (i%2==0) {
				sum+=i;	
			}
		} System.out.println("Total of all the even nos in the given range is "+sum);
		*/
//Add all nos divisible by 5 within a range or 1-100
		/*
		int add=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter smallest in the range: ");
		int s=sc.nextInt();
		System.out.println("Enter biggest in the range: ");
		int b=sc.nextInt();
		
		for (int i=s;i<=b;i++) {
			if (i%5==0) {
				add+=i;
			}
		} System.out.println("Sum of all nos in the given range that are divisible by 5 is: "+add);
		*/
//Find biggest of 2 nos
		/*
		Scanner s=new Scanner (System.in);
		System.out.println("Enter num a: ");
		int n=s.nextInt();
		System.out.println("Enter num b: ");
		int m=s.nextInt();
			if (n>m) {
				System.out.println(n);
			} else System.out.println(m); */
//Find biggest & smallest of n nos in an array
		
		int array[]={43,65,24,78,98,21,43};
		int temp=array[0];
			for (int i=0;i<array.length;i++) {
				if (temp<array[i]) {
					temp=array[i];
			}
		} System.out.println("Biggest is "+temp);
		for (int i=0;i<array.length;i++) {
			if (temp>array[i]) {
				temp=array[i];
			}
		} System.out.println("Smallest is "+temp);
		
//Write a boolean method called contains(), which takes an array of int and an int; and returns true if the array
//contains the given int.
	//System.out.println(isOdd(34));
	//System.out.println(isEven(33));
	/*
	adding("Jackie",4);
	adding("Romania",5);
	adding("Julie",6);
	
	int pro=calc(3,4,5);
	System.out.println(pro);
	String invitees=fullnames("Lata ","Mala ","Laya ",3);
	System.out.println(invitees+" are friends!!");
	
	reviseshit fre = new reviseshit ();
	fre.fn="Ball";
	fre.ln="Pen";//create an object from any class and you can access that class's variables using that object
	System.out.println(fre.fn+" is not in " +fre.ln);
	
	fre.setFn("Monkey");
	fre.setLn("cap");
	fre.setAge(12);
	System.out.println(fre.fn+fre.ln+" is "+fre.age+" years old");
	
	reviseshit vehicle = new reviseshit ();
	vehicle.setChassisno(13);
	vehicle.setBrand("benz");
	vehicle.setModel("SLS AMG");
	System.out.println(vehicle.brand + " has best model named" + vehicle.model+ " with chassis no" + vehicle.chassisno);
	
	reviseshit ssb=new reviseshit ();
	ssb.name="rana";
	ssb.chestno=2;
	ssb.chassisno=45;
	
	System.out.println(ssb.name+" with "+ ssb.chestno+" is a good bet!");
	ssb.setModel("volvo");
	
	measure(1,24,"hey","jack");
	revising(2,3,5,"ram","rehman");
	
	letsc(2,"tommy");
	*/
//Constructors: 2 types- 1:with parameter overloading 2:with parameter passing
		/*
		construkor cons=new construkor ("horse","arabian");
		construkor coni=new construkor ();
		construkor cony=new construkor (3,"horse","arabian");
		*/
	}//end of main method==================================
	/*
	private static boolean isOdd (int o) {
		if (o%3==0)
			return true;
		else 
			return false;
	}
	static boolean isEven (int e) {
		if (e%2==0)
			return true;
		else
			return false;
	}
	*/
//Write a method called printArray(), which takes an int array and print its contents in the form of {a1, a2, ..., an} 
	
		public static void printArray(int array[]) {
			System.out.println(array+" are elements here!");
		}
		public static void adding (String s,int n) {
			System.out.println("Our pleasure to welcome Mr. "+s+" to this "+n+"th Test match of FIFA cup!");
		}
		public static int calc (int a,int b,int c) {
			return a+b/c;
		}
		public static String fullnames (String a,String b,String c,int i) {
			return a+b+c+i;
		}
		public static String measure (int m, int n, String s, String p) {
			return m+s+n+p;
		}
		public static void revising (int x, int y, int z, String r, String w) {
			System.out.println(r+" and "+w+" have "+x+" years gap with "+y+" work experience having "+z+" months in this domain");
		}
		public static void letsc (int x, String u) {
			System.out.println(u+" is "+x+" feet tall!");
		}
}