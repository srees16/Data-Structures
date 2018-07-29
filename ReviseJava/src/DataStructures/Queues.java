package DataStructures;

public class Queues {
	
	private int q[];
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public Queues() {
		size=100;
		total=0;
		front=0;
		rear=0;
		q=new int[size];
	}
	
	public Queues(int size) {
		this.size=size;
		total=0;
		front=0;
		rear=0;
		q=new int[this.size];
	}
	
	public boolean enq(int item) {
		if(isFull()) {
			return false;
		} else {
			total++;
			q[rear]=item;
			rear=(rear+1)%size;
			return true;
		}
	}
	
	public int deQ() {
		int item=q[front];
		total--;
		front=(front+1)%size;
		return item;
	}
	
	public boolean isFull() {
		if(size==total) {
			return true;
		} else {
			return false;
		}
	}
	
	public void showAll() {
		int f=front;
		if(total!=0) {
			for(int i=0;i<total;i++) {
				System.out.print(q[f]+" ");
				f=(f+1)%size;
			}
		}
	}
	
	/*private class Node {
		private int data;
		private Node next;
		private Node(int data) {
			this.data=data;
		}
	}
	
	private Node head;
	private Node tail;
	
	public boolean isEmpty() {
		return head==null;
	}
	public int peek() {
		return head.data;
	}
	
	public void push(int data) {
		Node node=new Node(data);
		if(tail!=null) {
			tail.next=node;
		}
		tail=node;
		if(head==null) {
			head=node;
		}
	}
	
	public int pop() {
		head=head.next;
		int data=head.data;
		if(head==null) {
			tail=null;
		}
		return data;
	}*/
	
	/*int queue[];
	int front;
	int rear;
	int Qsize;
	
	public Queues() {
		Qsize=1;
		front=-1;
		rear=-1;
		queue=new int [Qsize];
	}
	
	public void push(int item) {
		if((front+1)>=Qsize)
			resize();
		queue[++front]=item;
	}
	private void resize() {
		int temp[]=queue;
		Qsize=Qsize*2;
		queue=new int [Qsize];
		for(int i=0;i<front;i++)
			queue[i]=temp[i];
	}

	public Integer pop() {
		if(front>rear) {
			return queue[++rear];
		}
		return null;
	}
	
	public boolean isEmpty() {
		return front<=rear;
	}*/
}