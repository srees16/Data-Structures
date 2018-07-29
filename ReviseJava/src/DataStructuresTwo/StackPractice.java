package DataStructuresTwo;

public class StackPractice {
	
	private int top;
	private int size;
	private int mystack[];
	
	public StackPractice() {
		top=-1;
		size=1;
		mystack=new int[size];
	}
	
	public StackPractice(int size) {
		top=-1;
		this.size=size;
		mystack=new int [this.size];
	}
	
	public boolean push(int item) {
		if(!isFull()) {
			top++;
			mystack[top]=item;
			return true;
		} else {
			resize();
			top++;
			mystack[top]=item;
			return true;
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int item=mystack[top--];
			return item;
		}
		return 0;
	}
	
	public int peek() {
		return mystack[top];
	}
	
	public void resize() {
		if(isFull()) {
			int temp[]=mystack;
			size=size*2;
			mystack=new int[size];
			for(int i=0;i<=top;i++) {
				mystack[i]=temp[i];
			}
		}
	}
	
	public boolean isFull() {
		return (top==mystack.length-1);
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void print() {
		int s=top;
		if(s!=0) {
			for(int i=0;i<=top;i++) {
				System.out.print(mystack[s]+" ");
				s-=1;
			}
		}
	}
}