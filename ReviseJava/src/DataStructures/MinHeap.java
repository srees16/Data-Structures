package DataStructures;

public class MinHeap {

	private int theHeap[];
	private int capacity;
	private int pos;
	
	public MinHeap() {
		pos=1;
		capacity=10;
		theHeap=new int [capacity];
	}
	
	public void insert(int val) {
		if(pos==capacity) {
			//increment the capacity
		} else {
			theHeap[pos++]=val;
			int child=pos-1;
			int parent=child/2;
			while(theHeap[parent]>theHeap[child] && parent >0) {
				int temp=theHeap[parent];
				theHeap[parent]=theHeap[child];
				theHeap[child]=temp;
				
				child=parent;
				parent=child/2;
			}
		}
	}
	
	public void print() {
		for(int i=1;i<pos;i++) {
			System.out.print(theHeap[i]+" ");
		}
	}
}