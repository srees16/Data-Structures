package BabyDSGyaan;

import java.util.*;

public class Stack {
	
	public static void main (String []args) {
		Stack s=new Stack();
		s.push(34);
		s.push(41);
		s.push(93);
		s.push(72);
		s.push(64);
		s.print();
		System.out.println("==");
		s.pop();
		s.print();
		System.out.println("==");
		System.out.println(s.stackTop());
		System.out.println("==");
		System.out.println(s.search(72));
	}

	/*Stack: Last In First Out -> LIFO 
	 *Queue: First In First Out -> FIFO
	 *LinkedList: Nodes n pointers
	 *Hash Table: Advantage: the search is fast,deletion, insertion
	 *Tree: 
	 *Heap
	 *Trie
	 *Graph
	 *
	 *int,float,double,long,char,boolean
	 *
	 *List, Set, Map::
	 *ArrayList
	 *LinkedList
	 *
	 *HashSet
	 *TreeSet
	 *LinkedHashSet
	 *
	 *HashMap
	 *TreeMap
	 *LinkedHashMap
	*/
	
	private int myStack[];
	private int size;
	private int top;
	
	private Stack() {
		size=1;
		top=-1;
		myStack=new int[size];
	}
	
	private Stack(int size) {
		this.size=size;
		top=-1;
		myStack=new int[this.size];
	}
	
	public int push(int item) {
		if(!isFull()) {
			top++;
			myStack[top]=item;
			return item;
		} else {
			reSize();
			top++;
			myStack[top]=item;
			return item;
		}
	}
	
	public void pop() {
		if(!isEmpty()) {
			int item=myStack[top];
			top--;
		} else {
			throw new IllegalStateException("What more is there to pop re?!");
		}
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return top==myStack.length-1;
	}
	
	public int stackTop() {
		return myStack[top];
	}
	
	public void reSize() {
		int temp[]=myStack;
		size*=2;
		myStack=new int[size];
		for(int i=0;i<=top;i++) {
			myStack[i]=temp[i];
		}
	}
	
	public void print() {
		int x=top;
		if(x!=-1) {
			for(int i=0;i<=top;i++) {
				System.out.println(myStack[x]+" ");
				x-=1;
			}
		}
	}
	
	public boolean search(int item) {
		int x=top;
		if(x!=-1) {
			for(int i=0;i<=top;i++) {
				if(myStack[i]==item) {
					return true;
				}
			}
		}
		return false;
	}
}