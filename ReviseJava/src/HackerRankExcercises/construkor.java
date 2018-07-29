package HackerRankExcercises;

import java.util.Date;

public class construkor {
	
	String fn;
	String ln;
	int age;
	int x;
	
	int y=11;
	int j;
	String breed="Rajasthani";
	String animal="Race horse";
	int howmany;
	static int count;
	
	//construkor () {
		//count++;
	//}
	public static int getcount () {
		return count;
	}
	
	construkor () {
		this (0,"","",0);
	}
	construkor (int x) {
		this (x,"","",0);
	}
	construkor (int x, String fn) {
		this (0,fn,"",0);
	}
	construkor (int x, String fn, String ln) {
		this (0,fn,ln,0);
	}
	construkor (int x, String fn, String ln, int age) {
		this.x=x;
		this.fn=fn;
		this.ln=ln;
		this.age=age;
	}
	/*
	construkor () {
		System.out.println("I love the animal "+animal+" of breed "+breed);
	}
	construkor (String a, String b) {
		animal=a; breed=b;
		System.out.println("I love the animal "+a+" of breed "+b);
	}
	construkor (int x, String a, String b) {
		if (x>1) {
			System.out.println("I want "+x+" "+a+"s"+" from breed "+b);
		} else System.out.println("I want "+x+" "+a+" from breed "+b);
	}
	*/
	/*
	construkor () {
		System.out.println(x*y);
	}
	public construkor (int v,int u) {
		System.out.println(u*v);
	} */
	
	public int volume () {
		return (x*y*j);
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int chassisno;
	String model;
	String brand;

	public int getChassisno() {
		return chassisno;
	}
	public void setChassisno(int chassisno) {
		this.chassisno = chassisno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	}