package DataStructuresRecollect3;

public class Student {

	String name;
	int rollNo;
	
	/*public Student() {
		this.name=name;
		this.rollNo=rollNo;
	}*/
	
	public Student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student name= "+name+ ", rollNo= "+rollNo;
	}
}