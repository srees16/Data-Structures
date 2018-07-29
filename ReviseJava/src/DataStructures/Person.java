package DataStructures;

public class Person {

	private String name;
	private String rollNo;
	
	Person(String name, String rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public String getName() {
		return this.name;
	}
	public String toString() {
		return "Name is "+this.name+" and roll No is  "+this.rollNo;
	}
}