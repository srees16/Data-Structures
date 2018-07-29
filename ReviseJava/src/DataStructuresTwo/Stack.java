package DataStructuresTwo;

public class Stack {//Good example

	private int top;
	private int size;
	private int stack[];
	
	public Stack() {
		top=-1;
		size=1;
		stack=new int [size];
	}
	
	public Stack(int size) {
		top=-1;
		this.size=size;
		stack=new int [this.size];
	}
	
	public void push(int item) {
		if(!isFull()) {
			top++;
			stack[top]=item;
		} else {
			reSize();
			top++;
			stack[top]=item;
		}
	}
	
	public Integer pop() {
		if(!isEmpty()) {
			int item=stack[top];
			top--;
			return item;
		}
		return null;
	}
	
	public int peek() {
		return stack[top];
	}
	
	public boolean isFull() {
		return (top==stack.length-1);
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public void reSize() {
		if(isFull()) {
			int temp[]=stack;
			size=size*2;
			stack=new int[size];
			for(int i=0;i<=top;i++) {
				stack[i]=temp[i];
			}
		}
	}
	
	public void print() {
		int f=top;
		if(top!=0) {
			for(int i=0;i<=top;i++) {
				System.out.print(stack[f]+" ");
				f-=1;
			}
		}
	}
	
	/*public void printAll() {
		int f=top;
		while(top!=0) {
		System.out.print(stack[f]+" ");// same as print method above but using while loop.But if prints output n gives ArrayIndexOutOfBound exception
		f-=1;
		}
	}*/
	
//Using custom Node class
	
	/*private class Node {
		private int data;
		private Node next;
		
		private Node(int data) {
			this.data=data;
		}
	}
	
	private Node tops;
	
	public boolean isEmpty() {
		return tops==null;
	}
	
	public int peek() {
		return tops.data;
	}
	
	public void push(int data) {
		Node n =new Node(data);
		n.next=tops;
		tops=n;
	}
	
	public int pop() {
		int data=tops.data;
		tops=tops.next;
		return data;
	}*/
}