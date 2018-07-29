package DataStructuresTwo;

import java.util.Arrays;

public class MinHeap3 {

	private int capacity=1;
	private int size=1;
	private int items[]=new int [size];
	
	public int getLeftChildIndex(int parentIndex) {
		return 2*parentIndex+1;
	}
	
	public int getRightChildIndex(int parentIndex) {
		return 2*parentIndex+2;
	}
	
	public int getParentIndex(int childIndex) {
		return (childIndex-1)/2;
	}
	
	public boolean hasLeftChild(int index) {
		return getLeftChildIndex(index)<size;
	}
	
	public boolean hasRightChild(int index) {
		return getRightChildIndex(index)<size;
	}
	
	public boolean hasParent(int index) {
		return getParentIndex(index)>=size;
	}
	
	public int leftChild(int index) {
		return items[getLeftChildIndex(index)];
	}
	
	public int rightChild(int index) {
		return items[getRightChildIndex(index)];
	}

	public int parent(int index) {
		return items[getParentIndex(index)];
	}
	
	public void ensureXtraCapacity() {
		if(size==capacity) {
			items=Arrays.copyOf(items, capacity*2);
			capacity*=2;
		}
	}
	
	public void swap(int indexOne, int indexTwo) {
		
		int temp=items[indexOne];
		items[indexOne]=items[indexTwo];
		items[indexTwo]=temp;
	}
	
	public int heapTop() {
		if(size==0) {
			throw new IllegalStateException();
		} else {
			return items[0];
		}
	}
	
	public void add(int item) {
		ensureXtraCapacity();
		items[size]=item;
		size++;
		heapUp();
	}
	
	public int delete() {
		if(size==0) {
			throw new IllegalStateException();
		} else {
			int item=items[0];
			items[size-1]=items[0];
			heapDown();
			return item;
		}
	}

	private void heapUp() {
		int index=size-1;
		while(hasParent(index) && parent(index)<items[index]) {
			swap(getParentIndex(index),index);
			index=getParentIndex(index);
		}
	}

	private void heapDown() {
		int index=0;
		while(hasLeftChild(index)) {
			int smallerChildIndex=getLeftChildIndex(index);
			if(hasRightChild(index) && rightChild(index)<leftChild(index)) {
				smallerChildIndex=getRightChildIndex(index);
			}
			if(items[index]<items[smallerChildIndex]) {
				break;
			} else {
				swap(smallerChildIndex,index);
			}
			index=smallerChildIndex;
		}
	}
}