package DataStructuresTwo;

public class QueueTwo {

	private int front;
	private int rear;
	private int size;
	private int myq[];
	
	public QueueTwo() {
		front=0;
		rear=0;
		size=1;
		myq=new int[size];
	}
	
	public QueueTwo(int size) {
		front=0;
		rear=0;
		this.size=size;
		myq=new int[this.size];
	}
	
	public void enq(int item) {
		if(isFull()) {
			resize();
			myq[rear]=item;
			rear=(rear+1)%size;
		} else {
			myq[rear]=item;
			rear=(rear+1)%size;
		}
	}
	
	public Integer deq() {
		if(!isEmpty()) {
			int item=myq[front];
			front=(front+1)%size;
			return item;
		} return null;
	}
	
	public boolean isFull() {
		return size==myq.length;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public void resize() {
		int temp[]=myq;
		size=size*2;
		myq=new int[size];
		for(int i=0;i<=rear;i++) {
			myq[i]=temp[i];
		}
	}
	
	public void print() {
		int f=front;
		if(rear!=-1) {
			for(int i=0;i<rear;i++) {
				System.out.print(myq[f]+" ");
				f=(f+1)%size;
			}
		}
	}
}