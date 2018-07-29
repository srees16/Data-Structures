package DataStructuresTwo;

public class PersonQ2 {
	
	private int front;
	private int rear;
	private int size;
	private Person q[];
	
	public PersonQ2() {
		front=0;
		rear=0;
		size=1;
		q=new Person[size];
	}
	
	public PersonQ2(int size) {
		front=0;
		rear=0;
		this.size=size;
		q=new Person[this.size];
	}
	
	public void enq(Person item) {
		if(isFull()) {
			resize();
			q[rear]=item;
			rear=(rear+1)%size;	
		} else {
			q[rear]=item;
			rear=(rear+1)%size;	
		}
	}
	
	public Person deq() {
		if(!isEmpty()) {
			Person item=q[front];
			front=(front+1)%size;
			return item;
		} return null;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public boolean isFull() {
		return size==q.length;
	}
	
	private void resize() {
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
				System.out.println(q[f]+" ");
				f+=1;
			}
		}
	}
}