package DataStructuresTwo;

public class PersonStack {

	private int top;
	private int size;
	private Person[] persons;
	
	public PersonStack() {
		top=-1;
		size=1;
		persons=new Person[size];
	}
	
	public PersonStack(int size) {
		top=-1;
		this.size=size;
		persons=new Person[this.size];
	}
	
	public void push(Person p) {
		if(!isFull()) {
			top++;
			persons[top]=p;
		} else {
			resize();
			top++;
			persons[top]=p;
		}
	}
	
	public Person pop() {
		if(!isEmpty()) {
			return persons[top--];
		}
		return null; 
	}
	
	public Person peek() {
		return persons[top];
	}
	
	public boolean isFull() {
		return top==persons.length-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void resize() {
		if(isFull()) {
			Person temp[]=persons;
			size=size*2;
			persons=new Person[size];
			for(int i=0;i<=top;i++) {
				persons[i]=temp[i];
			}
		}
	}
	
	public void print() {
		int s=top;
		if(s!=0) {
			for(int i=0;i<=top;i++) {
				System.out.println(persons[s]+" ");
				s-=1;
			}
		}
	}
}