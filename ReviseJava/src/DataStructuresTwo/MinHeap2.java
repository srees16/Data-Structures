package DataStructuresTwo;

import java.util.Arrays;

public class MinHeap2 {
	private int size=0;
	private int capacity=1;
	
	private int items[]=new int[size];
	
	private int getLeftChildIndex(int parentIndex) {
		return 2*parentIndex+1;
	}
	
	private int getRightChildIndex(int parentIndex) {
		return 2*parentIndex+2;
	}
	
	private int getParentIndex(int childIndex) {
		return (childIndex-1)/2;
	}
	
	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index)<size;
	}
	
	private boolean hasRightChild(int index) {
		return getRightChildIndex(index)<size;
	}
	
	private boolean hasParent(int index) {
		return getParentIndex(index)>=0;
	}
	
	private int leftChild(int index) {
		return items[getLeftChildIndex(index)];
	}
	
	private int rightChild(int index) {
		return items[getRightChildIndex(index)];
	}
	
	private int parent(int index) {
		return items[getParentIndex(index)];
	}
	
	private void ensureXtraCapacity() {
		if(size==capacity) {
			items=Arrays.copyOf(items, capacity*2);
			capacity*=2;
		}
	}
	
	private void swap(int indexOne, int indexTwo) {
		int temp=items[indexOne];
		items[indexOne]=items[indexTwo];
		items[indexTwo]=temp;
	}
	
	private int heapTop() {
		if(size!=0) {
			return items[0];
		} else {
			throw new IllegalStateException();
		}
	}
	
	private void add(int item) {
		ensureXtraCapacity();
		items[size]=item;
		size++;
		heapUp();
	}
	
	private int deleteTop() {
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