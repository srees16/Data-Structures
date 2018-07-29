package DataStructuresRecollect3;

import java.util.Arrays;

public class MinHeap {
	
	private int capacity;
	private int size;
	private int myHeap[];
	
	public MinHeap() {
		capacity=1;
		size=0;
		myHeap=new int[size];
	}
	
	private int getLeftChildIndex(int parentIndex) {
		return 2*parentIndex+1;
	}
	
	private int getRightChildIndex(int parentIndex) {
		return 2*parentIndex+2;
	}
	
	private int getParentIndex(int childIndex) {
		return (childIndex-1)/2;
	}
	
	private boolean hasLeftChild(int parentIndex) {
		return myHeap[getLeftChildIndex(parentIndex)]<0;
	}
	
	private boolean hasRightChild(int parentIndex) {
		return myHeap[getRightChildIndex(parentIndex)]<0;
	}
	
	private boolean hasParent(int childIndex) {
		return myHeap[getParentIndex(childIndex)]>=0;
	}
	
	private int getLeftChild(int parentIndex) {
		return myHeap[getLeftChildIndex(parentIndex)];
	}
	
	private int getRightChild(int parentIndex) {
		return myHeap[getRightChildIndex(parentIndex)];
	}
	
	private int getParent(int childIndex) {
		return myHeap[getParentIndex(childIndex)];
	}
	
	private void getXtraCapacity() {
		if(size==capacity) {
			myHeap=Arrays.copyOf(myHeap, capacity*2);
			capacity*=2;
		}
	}
	
	public int add(int item) {
		getXtraCapacity();
		myHeap[size]=item;
		size++;
		heapUp();
		return item;
	}
	
	public int remove() {
		int item=myHeap[0];
		myHeap[0]=myHeap[size-1];
		size--;
		heapDown();
		return item;
	}
	
	private void heapUp() {
		int index=size-1;
		while(hasParent(index) && getParent(index)<myHeap[index]) {
			swap(getParentIndex(index),index);
			index=getParentIndex(index);
		}
	}

	private void heapDown() {
		int index=0;
		while(hasLeftChild(index)) {
			int smallerChildIndex=getLeftChildIndex(index);
			if(hasRightChild(index) && getRightChild(index)<getLeftChild(index)) {
				smallerChildIndex=getRightChildIndex(index);
			}
			if(myHeap[index]<myHeap[smallerChildIndex]) {
				break;
			} else {
				swap(smallerChildIndex,index);
			}
			index=smallerChildIndex;
		}
	}
	
	private void swap(int indexOne, int indexTwo) {
		int temp=myHeap[indexOne];
		myHeap[indexOne]=myHeap[indexTwo];
		myHeap[indexTwo]=temp;
	}
	
	public int heapTop() {
		if(size!=0) {
			return myHeap[0];
		} else {
			throw new IllegalStateException();
		}
	}
		
	public static void main(String[] args) {
		
	}
}