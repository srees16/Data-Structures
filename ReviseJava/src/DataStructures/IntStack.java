package DataStructures;

public class IntStack { //Work on the stack-increase-if-full condition and print function

	private int stack[];
	private int top;
	private int size;
	
	public IntStack() {
		top=-1;
		size=3;
		stack=new int[size];
	}
	
	public IntStack(int size) {
		top=-1;
		this.size=size;
		stack=new int[this.size];
	}
	
	public void push(int item) {
		if(!isFull()) {
			top++;
			stack[top]=item;	
		} /*else {
			int temp[]=stack;
			size=size*2;
			stack=new int [size];
			for(int i=0;i<=top;i++)
			stack[i]=temp[i];
		}*/
	}
	
	public boolean isFull() {
		return (top==stack.length-1);
	}
	
	public int pop() {
		top--;
		return stack[top--];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public void print() {
		int x=top;
		if(size!=0) {
			for(int i=0;i<=top;i++) {
				System.out.print(stack[x]+" ");
				x=(x+1)%size;
			}
		}
	}
}