package DataStructuresTwo;

public class qtwo {

	private int front;
	private int rear;
	private int size;
	private int q[];
	
	public qtwo() {
		front=0;
		rear=0;
		size=1;
		q=new int[size];
	}
	
	public qtwo(int size) {
		front=-1;
		rear=-1;
		this.size=size;
		q=new int[this.size];
	}
	
	public void enq(int item) {
		if(!isFull()) {
			q[rear]=item;
			rear=(rear+1)%size;
		} else {
			resize();
			q[rear]=item;
			rear=(rear+1)%size;
		}
	}
	
	public Integer deq() {
		if(!isEmpty()) {
			int item=q[front];
			front++;
			return item;
		}
		return null;
	}

	public boolean isEmpty() {
		return front==rear;
	}
	
	public boolean isFull() {
		return size==q.length;
	}
	
	private void resize() {
		int temp[]=q;
		size=size*2;
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