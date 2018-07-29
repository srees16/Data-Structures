package DataStructuresRecollect3;

public class Stack {

	private int size;
	private int top;
	private int myStack[];
	
	public Stack() {
		size=1;
		top=-1;
		myStack=new int[size];
	}
	
	public Stack(int size) {
		this.size=size;
		top=-1;
		myStack=new int[this.size];
	}
	
	public int push(int item) {
		if(!isFull()) {
			top++;
			myStack[top]=item;
			return item;
		} else {
			reSize();
			top++;
			myStack[top]=item;
			return item;
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int item=myStack[top];
			top--;
			return item;
		} else {
			throw new IllegalStateException("No element prensent in stack!");
		}
	}
	
	public int stackTop() {
		return myStack[top];
	}
	
	public void reSize() {
		int temp[]=myStack;
		size*=2;
		myStack=new int[size];
		for(int i=0;i<=top;i++) {
			myStack[i]=temp[i];
		}
	}
	
	private boolean isEmpty() {
		return top==-1;
	}
	
	private boolean isFull() {
		return top==myStack.length-1;
	}
	
	public void print() {
		int x=top;
		if(x!=-1) {
			for(int i=0;i<=top;i++) {
				System.out.print(myStack[x]+" ");
				x-=1;
			}
		}
	}
	
	public boolean search(int item) {
		int x=top;
		if(x!=-1) {
			for(int i=0;i<=top;i++) {
				if(myStack[i]==item) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(43);
		s.push(85);
		s.push(51);
		s.push(65);
		s.push(32);
		s.print();
		System.out.println("---");
		System.out.println(s.stackTop());
		s.pop();
		s.print();
		System.out.println();
		System.out.println(s.search(61));
		System.out.println(s.search(85));
	}
}