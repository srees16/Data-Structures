package DataStructuresRecollect2;

public class QueueObject {

	private int front;
	private int rear;
	private int size;
	private Student sque[];
	
	public QueueObject() {
		front=0;
		rear=0;
		size=1;
		sque=new Student[size];
	}
	
	public QueueObject(int size) {
		front=0;
		rear=0;
		this.size=size;
		sque=new Student[this.size];
	}
	
	public Student enq(Student stu) {
		if(!isFull()) {
			sque[rear]=stu;
			rear=(rear+1)%size;
			return stu;
		} else {
			resize();
			sque[rear]=stu;
			rear=(rear+1)%size;
			return stu;
		}
	}
	
	public Student deq() {
		if(!isEmpty()) {
			Student stu=sque[front];
			front=(front+1)%size;
			return stu;
		} else {
			throw new IllegalStateException("Yo, none there man!");
		}
		
	}
	
	public void print() {
		int f=front;
		if(f!=-1) {
			for(int i=0;i<rear;i++) {
				System.out.println(sque[f].toString());
				f+=1;
			}
		}
	}
	
	public boolean isFull() {
		return size==sque.length;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public void resize() {
		Student temp[]=sque;
		size*=2;
		sque=new Student[size];
		for(int i=0;i<=rear;i++) {
			sque[i]=temp[i];
		}
	}
}