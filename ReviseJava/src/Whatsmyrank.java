
public class Whatsmyrank {
	public static void main (String [] args) {
		int topranks [] = {1,2,3,4,5,6,7,8,9,10};
		try {
		String candidates[] = {"SS","Sree","Srees","Sreek","Sreeka","Sreekan","Sreekanth", "SP", "Raji"};
			for (String cands : candidates) {	
		System.out.println("Rank\tCandidate");
			for (int indx = 0 ; indx < 1+topranks.length ; indx++)
		System.out.println(topranks[indx]+"\t"+candidates[indx]);
				}
			}	catch (java.lang.ArrayIndexOutOfBoundsException f) {
		}

	}
	
}