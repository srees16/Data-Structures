
public class arrayinamethod {

	public static void main(String[] args) {
	
	String originalnames [] = {"hi" , "hello" , "hi there"};
	namechanges(originalnames);
	for (String a: originalnames)
		System.out.println(a);
	}
	public static void namechanges (String names[]) {
		for (int indx = 0 ; indx < names.length ; indx++)
			names[indx]+=" Batman";

	}
	
}