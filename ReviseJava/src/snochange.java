
public class snochange {

	public static void main(String[] args) {
		int numarray [] = {2,3,9};
		snochange(numarray);
		for (int x = 0 ; x < numarray.length ; x++)
		System.out.println(x);
	}
	public static void snochange (int abc []) {
		for (int y=0 ; y < abc.length ; y++)
			abc[y] +=2;
		
	}
}