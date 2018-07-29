//package RevisionPractice;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		try {
		int i [] = {6,1,7,4,8,7,9,2};
		System.out.println("Element at the selected index is "+i[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Specify index within the available range");
		}
		EmployeeTest t = new EmployeeTest();
		try {
			t.getEmpID(-3);
		} catch (OwnException e) {
			//e.printStackTrace();
		}
		*/
		int a = 34;
		int b = 0;
		int c=a/b;
		if (b==0) {
		throw new ArithmeticException ("Give another denominator");
		}
		kidsage k = new kidsage();
		try {
			k.getage(0);
		} catch (myexception e) {
			//e.printStackTrace();
		}
	}
}
class OwnException extends Exception {
	OwnException (String msg) {
		System.out.println(msg);
	}
}
class EmployeeTest {
	static void getEmpID (int id) throws OwnException {
		if (id<0) {
			throw new OwnException("Enter valid ID ");
		} else {
			System.out.println("Continue processing with your ID: "+id);
		}
	}
}
class myexception extends Exception {
	myexception (String s) {
		super (s);
		System.out.println(s);
		
	}
}
class kidsage {
	static void getage (int a) throws myexception {
		if (a<=0) {
			throw new myexception ("Enter right age");
		} else {
			System.out.println("Right age for admission");
		}
	}
}