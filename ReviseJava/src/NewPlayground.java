import java.util.*;
import java.util.jar.Manifest;
import java.util.EnumSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class NewPlayground {
	/*
	public static int factorials (int F){
		if (F<=1)
			return 1;
		else return (F * factorials(F-1));
	}*/
	public static void main(String[] args) {
		
		
		
		GUILesson newindw = new GUILesson ();
		newindw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newindw.setSize(350,200);
		newindw.setVisible(true);
		
		
		GUILesson prompt = new GUILesson ();
		prompt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prompt.setSize(334,432);
		prompt.setVisible(true);
		
		/*
		GUILesson prompt = new GUILesson ();
		prompt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prompt.setSize(300,450);
		prompt.setVisible(true);
		*/
		
		GUILesson prompt1 = new GUILesson ();
		prompt1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prompt1.setSize(300,450);
		prompt1.setVisible(true);
		
		
		String noa = JOptionPane.showInputDialog("Type A: ");
		String nob = JOptionPane.showInputDialog("Type B: ");
		
		double fn = Integer.parseInt(noa);
		double sn = Integer.parseInt(nob);
		double tot = fn+sn;
		
		JOptionPane.showMessageDialog (null, "The Total is "+tot, "The Calc", JOptionPane.PLAIN_MESSAGE);
		
		
		FinalKeyword initval = new FinalKeyword (10);
		for (int indx = 0; indx < 5; indx++) {
			initval.multiply();
			System.out.printf("%s" , initval);	
		}
		
		/*
		innertostring instr = new innertostring (31,12,16);
		outertostring outrstr = new outertostring ("Dick" , instr);
		System.out.println(outrstr);
		
		tut42practice datehere = new tut42practice (15,06,47);
		tut43practice freedomdate = new tut43practice ("British", datehere);
		System.out.println(freedomdate);
		
		Tostringex gstrng = new Tostringex (31,3,16);
		tut43 tutobj = new tut43 ("Zorro", gstrng);
		System.out.println(tutobj);
		*/
		/*
		Thread byintrface = new Thread(new ThreadRunnable());
		Thread byintrface1 = new Thread(new ThreadRunnable());
		byintrface.start();
		byintrface1.start();
		*/
		/*
		Thread intrass = new Thread (new Runnable(){

			public void run() {
				for (double d = 1; d <5; d++) {
					System.out.println(Thread.currentThread().getId()+ " Value " + d);
				} try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			
		});
		
		intrass.start();
		*/
		/*
		Thread intfc = new Thread (new Threadagainrunnable());
		intfc.start();
		Thread intfc1 = new Thread (new Threadagainrunnable());
		intfc1.start();
		*/
		/*
		Jthreadex athread = new Jthreadex ();
		athread.start();
		Jthreadex athread2 = new Jthreadex ();
		athread2.start();
		JThreadagain letsc = new JThreadagain ();
		letsc.start();
		*/
		/*
		for (exOfEnum ppl : exOfEnum.values())
			System.out.printf("%s\t%s\t%S\n" , ppl , ppl.getage() , ppl.getgender());
		
		System.out.println("---------");
		
		for (onemorenum family : onemorenum.values())
			System.out.printf("%s\t%S\t%S\t%s\n", family, family.getage(), family.getqual(), family.getplace());
		
		System.out.println("---------");
		
		for (onemorenum family : EnumSet.range(onemorenum.Raji , onemorenum.Mammy))
			System.out.printf("%s\t%S\t%S\t%s\n", family, family.getage(), family.getqual(), family.getplace());
		*/
		/*
		TimeClass timeobj = new TimeClass ();
		timeobj.thetime(20 , 45, 46);
		System.out.println(timeobj.toString());
		*/
		/*
		TimeClass fortime = new TimeClass ();
		System.out.println(fortime.militarytime());
		fortime.time(6, 45, 13);
		System.out.println(fortime.militarytime());
		System.out.println(fortime.twelvehrfrmt());
		*/
		/*
		System.out.println("----");
		HashSet <String> myset = new HashSet <String> ();
		myset.add("fd");
		myset.add("re");
		myset.add("ds");
		myset.add("fg");
		myset.add("fr");
		Iterator <String> itr = myset.iterator();
		while (itr.hasNext())
		System.out.println(itr.next());
		*/
		//System.out.println(System.currentTimeMillis() + " ms");
		/*
		Random dice = new Random ();
		int watuget;
		
		for (int roll=1; roll<10; roll++){
			watuget = 1+dice.nextInt(6);
		System.out.println(watuget);
		}
		*/
		/*
		try {
			int numarray [] = {1,2,3,4,5,6,7,8,9,10};
			String namearray [] = {"Sree", "SS", "SreeS", "SP", "Prati", "SPBha", "Pratibha", "S. Pratibha"};
				for (String names : namearray) {
			System.out.println("S No.\t Name");
				for (int indx=0 ; indx<numarray.length ; indx++) {
			System.out.println(numarray[indx] + "\t" + namearray[indx]);
				}
			}	
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			
		}
		*/
		/*int numseq=1;
		
		do {
			System.out.println(numseq);
			numseq++;
		}	while (numseq<=10); */
		/*
		int array [] = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000,1000000000};
		int initvalue=0;
		System.out.println("S No.\tValue");
		for (int indx=0 ; indx < array.length ; indx++) {
		System.out.println(indx + "\t" + array[indx]);
		initvalue+=array[indx];	
		}
		System.out.println("=======");
		System.out.println("Total value of array is = " + initvalue);
		/*
		double amount;
		double principal=100;
		double rate=0.1;
		
		for (long day=1; day<=10; day++){
		amount = principal*Math.pow(1+rate, day);
		System.out.println(day + "  " + amount);
		}
		/*
		int evennos;
		for (evennos = 0; evennos <= 10; evennos++){
		System.out.println("Even" + evennos++);
		System.out.println("-----");
		}
		*/
		/*
		Scanner anumb = new Scanner (System.in);
		int grade;
		int total=0;
		int counter=0;
		int avg;

		while (counter < 10){
		grade = anumb.nextInt();
		total = grade+total;
		counter++;
		}
		avg = total/10;
		System.out.println("Here is your avg: " + avg);
		*/
		/*
		int rank = 2 ; int glass = 10; String section = "A";
		System.out.println((rank<5 && rank==2 || rank>1) && (glass == 10) || (section == "B")? "Right" : "Wrong");
		*/
		/*
		Scanner scanrank = new Scanner (System.in);
		System.out.println("What is your rank?");
		int rank = scanrank.nextInt();			
			if (rank == 1) 
				System.out.println("First rank");
			else 
				if (rank > 1 && rank <=3) 
					System.out.println("thats fine, you in top 3!");
					
				if (rank >3 && rank <=10)
					System.out.println("Bad but not so bad!" + rank + " is acceptable");
					
				if (rank>10)
					System.out.println("Well, that aint acceptable!");
		*/
		/*
		Scanner scans = new Scanner (System.in);
		lesson16 weaponobj = new lesson16 ();
		System.out.println("Which one do you like");
		String liked = scans.nextLine();
		
		weaponobj.groundmachines(liked);
		weaponobj.whatulike();
		*/
		/*
		Scanner fruitscan = new Scanner (System.in);
		//lesson16 object = new lesson16 ();
		System.out.println("Wats ur fav fruit?");
		String myfruit = fruitscan.nextLine();
		//object.eating(myfruit);
		//object.favfruit();
		lesson16.eating(myfruit);
		lesson16.favfruit();
		*/
		/*
		Scanner namehere = new Scanner (System.in);
		System.out.print("Enter your name: ");
		String name = namehere.nextLine();
		Lesson15.sitevisit(name); //This class n its method are directly accessed since modifier of Lesson15 was STATIC
		/* Below object is created to be used in case the modifier in the class Lesson 15 is NOT Static
		Lesson15 lesobj = new Lesson15 ();
		lesobj.sitevisit(name);
		*/
		/*
		Scanner markscan = new Scanner (System.in);
		System.out.println("Enter your marks");
		int marks = markscan.nextInt();
		switch (marks){
		case 90:
			System.out.println("Top performer");
			break;
		case 35:
			System.out.println("Just pass!");
			break;
		default:
			System.out.println("in between");
		}*/
		/*
		Scanner intscan = new Scanner (System.in);
		System.out.println("Enter the number to know its factorial");
		int F = intscan.nextInt();
		System.out.println("The factorial for the number " + F + " is " + factorials(F));
		*/
		/*
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter X");
		int x = scan1.nextInt();
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter Y");
		int y = scan2.nextInt();
		System.out.println("Result is " + x * y);
		System.out.println(newclass (10.33, 5.33));
		}
		public static int newclass (int x, int y) {
		return (x * y);
		}
		public static String newclass (String x, String y) {
		return (x + y);
		}
		public static double newclass (double x, double y) {
		return (x / y);
		*/
		
		/*
		int result = anexample (4, 6);
		System.out.println(result);
		onemore ("Tom");
		onemore ("Timmy");
		int yupp = mthodexmpl (54, 45);
		System.out.println(yupp);
		double res = justone (55, 54);
		System.out.println(res);
		addition (4, 20);
		Scanner no1 = new Scanner (System.in);
		System.out.println("A");
		int no = no1.nextInt();
		Scanner no2 = new Scanner (System.in);
		System.out.println("B");
		int nno = no2.nextInt();
		System.out.println("Result is " + no / nno);
		
		ObjectifyingAClass classhere = new ObjectifyingAClass ();
		classhere.setAge(10);
		classhere.setEmpID(1);
		classhere.setEmpName("Ram");
		System.out.println("At Age " + classhere.getAge() + " with Emp ID " + classhere.getEmpID() + " is " + classhere.getEmpName());
		
		ObjectifyingAClass oncemore = new ObjectifyingAClass();
		oncemore.Age = 11;
		oncemore.EmpID = 2;
		oncemore.EmpName = "Xyz";
		System.out.println("At age " + oncemore.getAge() + " with Emp ID " + oncemore.getEmpID() + " is " + oncemore.getEmpName());
		
		ForCube cubexx = new ForCube ();
		System.out.println(cubexx.cubevol());
		
		Scanner height = new Scanner (System.in);
		System.out.println("Height plz");
		int h = height.nextInt();
		Scanner length = new Scanner (System.in);
		System.out.println("Length plz");
		int l = length.nextInt();
		Scanner bredth = new Scanner (System.in);
		System.out.println("Bredth plz");
		int b = bredth.nextInt();
		System.out.println("The volume of Cube is " + h* l* b);
		
		ForCube cubexy = new ForCube (4, 6, 8);
		System.out.println(cubexy.cubevol());
	}	
	public static int anexample (int a, int b) {
		return (a * b);
	}
	public static void addition (int a , int b) {
		System.out.println(a*b);
	}
	public static void onemore (String guests) {
		System.out.println("Thanks " + guests);
	}
	public static int mthodexmpl (int x, int y) {
		return (x * y);
	}
	public static int justone (int x, int y) {
		return (x/y);
	}
		/*
		Scanner calc = new Scanner (System.in);
		System.out.println("Enter a");
		int no = calc.nextInt();
		System.out.println(no);
		*/
		//Switch - Case - Default
		/*
		Scanner ascan = new Scanner (System.in);
		System.out.println("Enter a number");
		int anint = ascan.nextInt();
		switch (anint) {
		case 50 :
			System.out.println("Right");
			break;
		default :
			System.out.println("Any number");
		}*/
		//int [] arrayname = {45,667,98,865,77};
		/*int indx = 0;
		while (indx < 5) {
		System.out.println(arrayname[indx]);
		indx++;
		}*/
		/*
		for (int index = 0; index <5; index++)
		System.out.println(arrayname[index]);
		*/
		/*
		try {
		String [] notherarray = {"ram rahim robert riverio"};
		for (int indxx = 0; indxx < 3; indxx++)
		System.out.println(notherarray[indxx]);
		} catch (java.lang.ArrayIndexOutOfBoundsException E) {
			
		}
		String [] notherarrays = {"noun pronoun adjective adverb prepostion conjunction"};
		for (String String : notherarrays)
		{
			System.out.println(String);
		}
		
		String [] repeat = {"one two three four five"};
		for (String letsc : repeat) {
		System.out.println(letsc);
		}
		
		String [] repeated = {"to for yes no maybe right wrong"};
		for (String anyting : repeated) {
			System.out.println(anyting);
		}
		String stringex = "just to understand";
		System.out.println(stringex);
		*/
	}
	
}
	