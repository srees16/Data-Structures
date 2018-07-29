package DataStructuresTwo;

public class Queue {//Good example

	private int front;
	private int rear;
	private int size;
	private int q[];
	
	public Queue() {
		front=0;
		rear=0;
		size=1;
		q=new int[size];
	}
	
	public Queue(int size) {
		front=0;
		rear=0;
		this.size=size;
		q=new int[this.size];
	}
	
	public void enq(int item) {
		if(isFull()) {
			resize();
			q[rear]=item;
			rear=(rear+1)%size;	
		} else {
			q[rear]=item;
			rear=(rear+1)%size;
		}
	}
	
	public Integer deq() {
		if(!isEmpty()) {
			int item=q[front];
			front=(front+1)%size;
			return item;
		} return null;
	}
	
	public boolean isFull() {
		return size==q.length;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	private void resize() {
		int temp[]=q;
		size*=2;
		q=new int[size];
		for(int i=0;i<=rear;i++) {
			q[i]=temp[i];
		}
	}

	public void print() {
		int f=front;
		if(rear!=-1) {
			for(int i=0;i<rear;i++) {
				System.out.print(q[f]+" ");
				f+=1;
			}
		}
	}
}