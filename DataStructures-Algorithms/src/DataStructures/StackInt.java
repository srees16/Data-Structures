package DataStructures;

public class StackInt {
	
	int stackItems[];
	int top;
	int stackSize;
	
	StackInt() {
		top=-1;
		stackSize=10;
		stackItems=new int[stackSize];
	}
	
	StackInt(int size) {
		top=-1;
		stackSize=size;
		stackItems=new int[stackSize];
	}
	
	public boolean push(int item) {
		if(!isFull()) {
			top++;
			stackItems[top]=item;
			return true;	
		} return false;
	}
	
	public boolean isFull() {
		return (top==stackSize-1);
	}
	
	public int pop() {
		return stackItems[top--];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}

}