package DataStructuresTwo;

public class Person {

	private String name;
	private int rollNo;
	private int age;
	
	/*public Person(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}*/
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name + "-> " + rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
}