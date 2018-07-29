package HackerRankExcercises;

public class HashTable {

	int items[];
	
	public int toHashCode(String rollNo) {
		int hash=0;
		int index=0;
		for(int i=0;i<items.length;i++) {
			hash=hash+(int)rollNo.charAt(i);
		}
		index=hash%items.length;
		return index;
	}
	
	
}