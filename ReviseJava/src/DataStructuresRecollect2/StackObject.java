package DataStructuresRecollect2;

public class StackObject {
	
	private int top;
	private int size;
	private Student mystack[];
	
	public StackObject() {
		top=-1;
		size=1;
		mystack=new Student[size];
	}
	
	public StackObject(int size) {
		top=-1;
		this.size=size;
		mystack=new Student[this.size];
	}
	
	public Student push(Student stud) {
		if(isFull()) {
			top++;
			mystack[top]=stud;
			return stud;
		} else {
			resize();
			top++;
			mystack[top]=stud;
			return stud;
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			Student stud=mystack[top];
			top--;
		} else {
			throw new IllegalStateException("Yo watcha doin my man?!");
		}
	}
	
	public void resize() {
		Student temp[]=mystack;
		size*=2;
		mystack=new Student[size];
		for(int i=0;i<=top;i++) {
			mystack[i]=temp[i];
		}
	}
	
	public Student stackTop() {
		return mystack[top];
	}
	
	public void print() {
		int x=top;
		if(x!=-1) {
			for(int i=0;i<=top;i++) {
				System.out.println(mystack[x].toString());
				x-=1;
			}
		}
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==mystack.length-1;
	}
}