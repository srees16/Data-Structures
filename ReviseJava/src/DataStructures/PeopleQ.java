package DataStructures;

public class PeopleQ {

	private Person q[];
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public PeopleQ() {
		size=100;
		total=0;
		front=0;
		rear=0;
		q=new Person[size];
	}
	
	public PeopleQ(int size) {
		this.size=size;
		total=0;
		front=0;
		rear=0;
		q=new Person[this.size];
	}
	
	public boolean enq(Person item) {
		if(isFull()) {
			return false;
		} else {
			total++;
			q[rear]=item;
			rear=(rear+1)%size;
			return true;
		}
	}
	
	public Person deQ() {
		Person item=q[front];
		total--;
		front=(front+1)%size;
		return item;
	}
	
	public boolean isFull() {
		if(size==total) {
			return true;
		} else {
			return false;
		}
	}
	
	public void showAll() {
		int f=front;
		if(total!=0) {
			for(int i=0;i<total;i++) {
				System.out.print(q[f]+" ");
				f=(f+1)%size;
			}
		}
	}
}