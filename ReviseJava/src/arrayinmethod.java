import java.util.Scanner;

public class arrayinmethod { //use this input strings into the string array

	public static void main(String[] args) {
		try {
			int numarray [] = {10,20,30,40,50,60,70,80,90,100};
			System.out.println("S No.\t Name");
			String namearray [] = {"Sree", "SS", "SreeS", "SP", "Prati", "SPBha", "Pratibha", "S Pratibha"};
				for (String names : namearray) {
					for (int indx=0 ; indx<numarray.length ; indx++) {
			System.out.println(numarray[indx] + "\t" + namearray[indx]);
				}
			}	
			
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			
		}
	}

}
