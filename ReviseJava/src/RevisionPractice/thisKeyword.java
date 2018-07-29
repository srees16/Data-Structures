//package RevisionPractice;

public class thisKeyword {

		int a=11;
		int b=22;
		String fn;
		String ln;
		int age;
		int x;
		
	void set () {
		int a=33;
		System.out.print("Method with VOID called! ");
		System.out.println(this.a);
	}
	void setting (int a, int b) {
		//this.a=a;
		//b=234;
		this.b=b;
		System.out.print("Method with local variables called! ");
		System.out.println(this.a);
	}
	String getting (String s) {
		System.out.print("method without void called ");
		System.out.println(this.a);
		return s;
	}
	/*
	thisKeyword () {
		System.out.print("constructor called! ");
		System.out.println(this.a);
	}*/
	thisKeyword () {
		this (0,"","",0);
	}
	thisKeyword (int x) {
		this (x,"","",0);
	}
	thisKeyword (int x, String fn) {
		this (0,fn,"",0);
	}
	thisKeyword (int x, String fn, String ln) {
		this (0,fn,ln,0);
	}
	thisKeyword (int x, String fn, String ln, int age) {
		this.x=x;
		this.fn=fn;
		this.ln=ln;
		this.age=age;
	}
}