package DataStructuresTwo;

import java.util.Arrays;

public class myMinHeap {

	private int capacity=10;
	private int size=1;
	private int items[]=new int[size];
	
	private int leftChildIndex(int parentIndex) {
		return 2*parentIndex+1;
	}
	
	private int rightChildIndex(int parentIndex) {
		return 2*parentIndex+2;
	}
	
	private int parentIndex(int childIndex) {
		return (childIndex-1)/2;
	}
	
	private boolean hasLeftChild(int index) {
		return leftChildIndex(index)<size;
	}
	
	private boolean hasRightChild(int index) {
		return rightChildIndex(index)<size;
	}
	
	private boolean hasParent(int index) {
		return parentIndex(index)>=0;
	}
	
	private int leftChild(int index) {
		return items[leftChildIndex(index)];
	}
	
	private int rightChild(int index) {
		return items[rightChildIndex(index)];
	}
	
	private int parent(int index) {
		return items[parentIndex(index)];
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
		if(size==capacity) {
			ensureXtraCapacity();
			items[size]=item;
			size++;
			heapUp();
		}
	}

	public int remove() {
		if(size==0) {
			throw new IllegalStateException();
		} else {
			int item=items[0];
			items[0]=items[size-1];
			size--;
			heapDown();
			return item;
		}
	}
	

	private void heapUp() {
		int index=size-1;
		while(hasParent(index) && parent(index)<items[index]) {
			swap(parentIndex(index),index);
			index=parentIndex(index);
		}
	}

	private void heapDown() {
		int index=0;
		while(hasLeftChild(index)) {
			int smallerChildIndex=leftChildIndex(index);
			if(hasRightChild(index) && rightChild(index)<leftChild(index)) {
				smallerChildIndex=rightChildIndex(index);
			}
			if(items[index]<items[smallerChildIndex]) {
				break;
			} else {
				swap(index,smallerChildIndex);
			}
			index=smallerChildIndex;
		}
	}
}






























