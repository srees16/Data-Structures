package DataStructuresRecollect;

public class Queue {

	private int front;
	private int rear;
	private int size;
	private int Que[];
	
	public Queue() {
		front=0;
		rear=0;
		size=1;
		Que=new int [size];
	}
	
	public Queue(int size) {
		front=0;
		rear=0;
		this.size=size;
		Que=new int [this.size];
	}
	
	public boolean isFull() {
		return size==Que.length; 
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public void resize() {
		int temp[]=Que;
		size=size*2;
		Que=new int[size];
		for(int i=0;i<=rear;i++) {
			Que[i]=temp[i];
		}
	}
	
	public void desize() {
		int temp[]=Que;
		size=size-1;
		Que=new int[size];
		for(int i=0;i<rear;i++) {
			Que[i]=temp[i];
		}
	}
	
	public void enque(int item) {
		if(isFull()) {
			resize();
			Que[rear]=item;
			rear=(rear+1)%size;
		} else {
			Que[rear]=item;
			rear=(rear+1)%size;
		}
	}
	
	public Integer deque() {
		if(!isEmpty()) {
			int item=Que[front];
			front=(front+1)%size;
			desize();
			return item;
		}
		return null;
	}
	
	public void print() {
		int f=front;
		if(rear!=-1) {
			for(int i=0;i<rear;i++) {
				System.out.print(Que[f]+" ");
				f=f+1;
			}
		}
	}
}