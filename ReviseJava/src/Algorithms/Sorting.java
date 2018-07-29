package Algorithms;

public class Sorting {

	public static void main(String[] args) {
		Sorting s=new Sorting();
		
		int list[]={48,77,36,21,65};
		s.insertionSort(list);
		s.print(list);
		System.out.println();
		int blist[]={48,77,36,21,65};
		s.bubbleSort(blist);
		s.print(blist);
		System.out.println();
		int slist[]={48,77,36,21,65};
		s.selectionSort(slist);
		s.print(slist);
	}
	//Insertion Sort
	public int[] insertionSort(int ilist[]) {
		for(int i=1;i<ilist.length;++i) {
			int key=ilist[i];
			int j=i-1;
			while(j>=0 && key<ilist[j]) {
				ilist[j+1]=ilist[j];
				j--;
			}
			ilist[j+1]=key;
		}
		return ilist;
	}
	
	private void print(int list[]) {
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
	}
	
	//Bubble Sort
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
	
	//Selection Sort
	public int[] selectionSort(int slist[]) {
		for(int i=0;i<slist.length;i++) {
			int minVal=slist[i];
			int minIndex=i;
			for(int j=i;j<slist.length;j++) {
				if(slist[j]<minVal) {
					minVal=slist[j];
					minIndex=j;
				}
			}
			if(minVal<slist[i]) {
				int temp=slist[i];
				slist[i]=slist[minIndex];
				slist[minIndex]=temp;
			}
		}
		
		return slist;
	}
	
	//Merge Sort
	int array[];
	int tempArray[];
	private void mergeSort(int low, int mid, int high) {
		for(int i=low;i<=high;i++) {
			tempArray[i]=array[i];
		}
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid && j<=high) {
			if(tempArray[i]<=tempArray[j]) {
				array[k]=tempArray[i];
				i++;
			} else {
				array[k]=tempArray[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			array[k]=tempArray[i];
			i++;
			k++;
		}
	}
	
	public void sort(int arrayToSort[]) {
		this.array=arrayToSort;
		this.tempArray=new int[arrayToSort.length];
		mergeSort(0,arrayToSort.length-1);
	}
}