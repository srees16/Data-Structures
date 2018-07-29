package DataStructuresRecollect3;

import java.util.Arrays;

public class MaxHeap {

	private int size;
	private int capacity;
	private int maxHeap[];
	
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
		return maxHeap[getLeftChildIndex(parentIndex)]<0;
	}
	
	private boolean hasRightChild(int parentIndex) {
		return maxHeap[getRightChildIndex(parentIndex)]<0;
	}

	private boolean hasParent(int childIndex) {
		return maxHeap[getParentIndex(childIndex)]>=0;
	}
	
	private int getLeftChild(int parentIndex) {
		return maxHeap[getLeftChildIndex(parentIndex)];
	}

	private int getRightChild(int parentIndex) {
		return maxHeap[getRightChildIndex(parentIndex)];
	}

	private int getParent(int childIndex) {
		return maxHeap[getParentIndex(childIndex)];
	}
	
	private void getXtraCapacity() {
		int temp[]=maxHeap;
		maxHeap=Arrays.copyOf(maxHeap, capacity*2);
		capacity*=2;
	}
	
	public int add() {
		getXtraCapacity();
		int index=maxHeap[size];
		heapUp();
		size++;
		return index;
	}
	
	public int delete() {
		int index=maxHeap[0];
		maxHeap[0]=maxHeap[size-1];
		size--;
		heapDown();
		return index;
	}
	
	public void swap(int indexOne,int indexTwo) {
		int temp=maxHeap[indexOne];
		maxHeap[indexOne]=maxHeap[indexTwo];
		maxHeap[indexTwo]=temp;
	}

	private void heapUp() {
		int index=size-1;
		while(hasParent(index) && getParent(index)<maxHeap[index]) {
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
			if(maxHeap[index]<maxHeap[smallerChildIndex]) {
				break;
			} else {
				swap(smallerChildIndex,index);
			}
			index=smallerChildIndex;
		}
	}
	
	public int heapTop() {
		if(size!=0) {
			return maxHeap[0];
		} else {
			throw new IllegalStateException();
		}
	}

	public static void main(String[] args) {
		
	}
}