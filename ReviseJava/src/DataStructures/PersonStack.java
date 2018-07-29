package DataStructures;

public class PersonStack {//Work on the stack-increase-if-full condition and print function

	private Person stack[];
	private int top;
	private int size;
	
	public PersonStack() {
		top=-1;
		size=50;
		stack=new Person[size];
	}
	public PersonStack(int size) {
		top=-1;
		this.size=size;
		stack=new Person[this.size];
	}
	public void push(Person item) {
		if(!isFull()) {
			top++;
			stack[top]=item;
		} 
	}
	public Person pop() {
		if(!isEmpty()) {
			return stack[top--];
		}
		return null;
	}
	public boolean isFull() {
		return (top==stack.length-1);
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	public void print() {
		int x=top;
		if(!isEmpty()) {
			for(int i=0;i<=top;i++) {
				System.out.println(stack[x]);
				x=(x+1)%size;
			}
		}
	}
}