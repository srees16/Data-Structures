package DataStructures;

public class QueueInt {

	private int Q[];
	private int front;
	private int rear;
	private int size;
	private int total;
	
	public QueueInt() {
		front=0;
		rear=0;
		size=20;
		total=0;
		Q=new int[size];
	}
	
	public QueueInt(int size) {
		front=0;
		rear=0;
		this.size=size;
		total=0;
		Q=new int[this.size];
	}
	
	public boolean enQ(int item) {
		if(isFull()) {
			return false;
		} else {
			total++;
			Q[rear]=item;
			rear=(rear+1)%size;
			return true;
		}
	}
	
	public int deQ() {
		int item=Q[front];
		total--;
		front=(front+1)%size;
		return item;
	}
	
	public boolean isFull() {
		if(total==size) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		int f=front;
		if(total!=0) {
			for(int i=0;i<total;i++) {
				System.out.println(Q[f]);
				f=(f+1)%size;
			}
		}
	}
}
