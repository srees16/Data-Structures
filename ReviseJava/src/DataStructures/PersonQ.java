package DataStructures;

public class PersonQ {

	private int front;
	private int rear;
	private int total;
	private int size;
	private Person PplQ[];
	
	public PersonQ() {
		front=0;
		rear=0;
		total=0;
		size=10;
		PplQ=new Person[size];
	}
	
	public PersonQ(int size) {
		front=0;
		rear=0;
		total=0;
		this.size=size;
		PplQ=new Person[this.size];
	}
	
	public Person enQ(Person person) {
		if(!isFull()) {
			PplQ[rear]=person;
			total++;
			rear=(rear+1)%size;
			return person;
		} else {
			return null;
		}
	}
	
	public Person deQ() {
		Person person=PplQ[front];
		front=(front+1)%size;
		total--;
		return person;
	}
	
	public boolean isFull() {
		if(total==size) {
			return true;
		} else {
			return false;
		}
	}
	
	public void show() {
		int a=front;
		if(total!=0) {
			for(int i=0;i<total;i++) {
				System.out.println(PplQ[a]);
				a=(a+1)%size;
			}	
		}
	}
}