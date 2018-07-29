package DataStructuresRecollect;

public class Stack {

	private int size;
	private int top;
	private int stack[];
	
	public Stack() {
		size=1;
		top=-1;
		stack=new int[size];
	}
	
	public Stack(int size) {
		this.size=size;
		top=-1;
		stack=new int[this.size];
	}
	
	public void reSize() {
		if(isFull()) {
			int temp[]=stack;
			size*=2;
			stack=new int[size];
			for(int i=0;i<=top;i++) {
				stack[i]=temp[i];
			}
		}
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
	
	public int push(int item) {
		if(!isFull()) {
			top++;
			stack[top]=item;
			return item;
		} else {
			reSize();
			top++;
			stack[top]=item;
			return item;
		}
	}
	
	public Integer pop() {
		if(!isEmpty()) {
			int item=stack[top];
			top--;
			return item;
		} else {
			return null;
		}
	}
	
	public void print() {
		int f=top;
		if(f!=-1) {
			for(int i=0;i<=top;i++) {
				System.out.print(stack[f]+" ");
				f-=1;
			}
		}
	}
}