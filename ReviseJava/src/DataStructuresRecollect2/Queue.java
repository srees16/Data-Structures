package DataStructuresRecollect2;

public class Queue { //Better example

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
		if(!isFull()) {
			q[rear]=item;
			rear=(rear+1)%size;
		} else {
			resize();
			q[rear]=item;
			rear=(rear+1)%size;
		}
	}
	
	public void deq() {
		if(!isEmpty()) {
			int item=q[front];
			front=(front+1)%size;
		} else {
			throw new IllegalStateException("You cant delete more man!");
		}
	}
	
	public void print() {
		int f=front;
		if(f!=-1) {
			for(int i=0;i<rear;++i) {
				System.out.print(q[f]+" ");
				f+=1;
			}
		}
	}

	public boolean search(int item) {
		int t=front;
		if(t!=-1) {
			for(int i=t;i<=rear;i++) {
				if(q[i]==item) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isFull() {
		return size==q.length;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public void resize() {
		int temp[]=q;
		size*=2;
		q=new int[size];
		for(int i=0;i<=rear;i++) {
			q[i]=temp[i];
		}
	}
}