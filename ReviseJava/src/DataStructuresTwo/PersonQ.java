package DataStructuresTwo;

public class PersonQ {//Good example

	private int front;
	private int rear;
	private int size;
	private Person q[];
	
	public PersonQ() {
		front=0;
		rear=0;
		size=1;
		q=new Person[size];
	}
	
	public PersonQ(int size) {
		front=0;
		rear=0;
		this.size=size;
		q=new Person[this.size];
	}
	
	public void enq(Person p) {
		if(isFull()) {
			resize();
			q[rear]=p;
			rear=(rear+1)%size;
		} else {
			q[rear]=p;
			rear=(rear+1)%size;
		}
	}
	
	public Person deq() {
		if(!isEmpty()) {
			Person p=q[front];
			front=(front+1)%size;
			return p;
		}
		return null;
	}
	
	public boolean isFull() {
		return size==q.length;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public void resize() {
		Person temp[]=q;
		size=size*2;
		q=new Person[size];
		for(int i=0;i<=rear;i++) {
			q[i]=temp[i];
		}
	}
	
	public void print() {
		int f=front;
		if(rear!=-1) {
			for(int i=0;i<rear;i++) {
				System.out.println(q[f].toString());
				f=(f+1)%size;
			}
		}
	}
}