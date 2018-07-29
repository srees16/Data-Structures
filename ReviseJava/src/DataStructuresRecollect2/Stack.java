package DataStructuresRecollect2;

public class Stack { //Better example

	private int top;
	private int size;
	private int mystack[];
	
	public Stack() {
		top=-1;
		size=1;
		mystack=new int[size];
	}
	
	public Stack(int size) {
		top=-1;
		this.size=size;
		mystack=new int[this.size];
	}

	public int stackTop() {
		return mystack[top]; 
	}
	
	public void resize() {
		int temp[]=mystack;
		size*=2;
		mystack=new int[size];
		for(int i=0;i<=top;i++) {
			mystack[i]=temp[i];
		}
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (top==mystack.length-1);
	}
	
	public void print() {
		int x=top;
		if(x!=-1) {
			for(int i=0;i<=top;i++) {
				System.out.print(mystack[x]+" ");
				x-=1;
			}
		}
	}
	
	public boolean search(int item) {
		int t=top;
		if(t!=-1) {
			for(int i=0;i<=top;i++) {
				if(mystack[i]==item) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int push(int item) {
		if(!isFull()) {
			top++;
			mystack[top]=item;
			return item;
		} else {
			resize();
			top++;
			mystack[top]=item;
			return item;
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			int item=mystack[top];
			top--;
		} else {
			throw new IllegalStateException("What u trying boss!");
		}
	}
}