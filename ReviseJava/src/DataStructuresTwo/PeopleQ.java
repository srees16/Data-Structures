package DataStructuresTwo;

public class PeopleQ {

	private int front;
	private int rear;
	private int size;
	private Person personq[];
	
	public PeopleQ() {
		front=0;
		rear=0;
		size=1;
		personq=new Person[size];
	}
	
	public PeopleQ(int size) {
		front=0;
		rear=0;
		this.size=size;
		personq=new Person[this.size];
	}
	
	public void enq(Person p) {
		if(!isFull()) {
			personq[rear]=p;
			rear=(rear+1)%size;
		} else {
			resize();
			personq[rear]=p;
			rear=(rear+1)%size;
		}
	}
	
	public Person deq() {
		if(!isEmpty()) {
			Person p=personq[front];
			front=(front+1)%size;
			return p;	
		} return null;
	}
	
	public boolean isFull() {
		return size==personq.length;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public void resize() {
		Person temp[]=personq;
		size=size*2;
		personq=new Person[size];
		for(int i=0;i<=rear;i++) {
			personq[i]=temp[i];
		}
	}
	
	public void print() {
		int f=front;
		if(rear!=-1) {
			for(int i=0;i<rear;i++) {
				System.out.println(personq[f].toString());
				f=(f+1)%size;
			}
		}
	}
}