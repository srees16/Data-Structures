package Algorithms;

public class Sort {

	/*Insertion sort
	Bubble sort
	Selection sort*/
	
	public static void main(String args[]) {
		int array[]={53,25,67,31};
		Sort s=new Sort();
		s.insertionSort(array);
		s.print(array);
		System.out.println();
		s.bubbleSort(array);
		s.print(array);
		System.out.println();
		s.selectionSort(array);
		s.print(array);
	}
	
	//Insertion sort
	public int[] insertionSort(int ilist[]) {
		for(int i=1;i<ilist.length;i++) {
			int key=ilist[i];
			int j=i-1;
			while(j>=0 && key<ilist[j]) {
				int temp=ilist[j];
				ilist[j]=ilist[j+1];
				ilist[j+1]=temp;
				j-=1;
			}
		}
		return ilist;
	}
	
	//Bubble sort
	public int[] bubbleSort(int blist[]) {
		for(int i=0;i<blist.length-1;i++) {
			for(int j=0;j<blist.length-1-i;j++) {
				if(blist[j]>blist[j+1]) {
					int temp=blist[j];
					blist[j]=blist[j+1];
					blist[j+1]=temp;
				}
			}
		}
		return blist;
	}
	
	//Selection sort
	public int[] selectionSort(int slist[]) {
		
		for(int i=0;i<slist.length;i++) {
			int minValue=slist[i];
			int minIndex=i;
			for(int j=i;j<slist.length;j++) {
				if(slist[j]<minValue) {
					minValue=slist[j];
					minIndex=j;
				}
			}
			if(minValue<slist[i]) {
				int temp=slist[i];
				slist[i]=slist[minIndex];
				slist[minIndex]=temp;
			}
		}
		return slist;
	}
	
	public void print(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}