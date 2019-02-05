package DataStructures;

public class StackObject {
	
	private Person stackItems[];
	private int top;
	private int stackSize;
	
	public StackObject() {
		top=-1;
		stackSize=10;
		stackItems=new Person[stackSize];
	}
	
	public StackObject(int size) {
		top=-1;
		stackSize=size;
		stackItems=new Person[stackSize];
	}
	
	public boolean push(Person item) {
		if(!isFull()) {
			top++;
			stackItems[top]=item;
			return true;	
		} return false;
	}
	
	public boolean isFull() {
		return (top==stackSize-1);
	}
	
	public Person pop() {
		return stackItems[top--];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}

}
