package DataStructuresRecollect3;

public class Queue {

	private int front;
	private int rear;
	private int size;
	private int myQ[];
	
	public Queue() {
		front=rear=0;
		size=1;
		myQ=new int[size];
	}
	
	public Queue(int size) {
		front=rear=-1;
		this.size=size;
		myQ=new int[this.size];
	}
	
	public int enQ(int item) {
		if(!isFull()) {
			myQ[rear]=item;
			rear=(rear+1)%size;
			return item;
		} else {
			reSize();
			myQ[rear]=item;
			rear=(rear+1)%size;
			return item;
		}
	}
	
	public int deQ() {
		if(!isEmpty()) {
			int item=myQ[front];
			front=(front+1)%size;
			return item;
		} else {
			throw new IllegalStateException("Yo, it aint there man!");
		}
	}
	
	public int qFront() {
		int item=myQ[front];
		return item;
	}
	
	private void reSize() {
		int temp[]=myQ;
		size*=2;
		myQ=new int[size];
		for(int i=0;i<=rear;i++) {
			myQ[i]=temp[i];
		}
	}
	
	public boolean isFull() {
		return rear==myQ.length-1;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public void print() {
		int x=front;
		if(x!=-1) {
			for(int i=x;i<rear;i++) {
				System.out.print(myQ[x]+" ");
				x+=1;
			}
		}
	}
	
	public boolean search(int item) {
		int x=front;
		if(x!=-1) {
			for(int i=x;i<=rear;i++) {
				if(myQ[i]==item) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQ(35);
		q.enQ(53);
		q.enQ(22);
		q.enQ(75);
		q.enQ(68);
		q.print();
		q.deQ();
		System.out.println("=======");
		q.print();
		System.out.println();
		System.out.println(q.search(21));
		System.out.println(q.search(53));
	}
}