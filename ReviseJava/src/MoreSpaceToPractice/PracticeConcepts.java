//package MoreSpaceToPractice;

public class PracticeConcepts {

	public static void main(String[] args) {
		/*
		World theworld [] = new World [2];
		theworld [0] = new Asia ();
		theworld [1] = new Europe();
		
		for (int i=0; i < theworld.length; i++) {
			theworld[i].myworld();
		}
		*/
		worlds union = new worlds ();
		Andhra an = new Andhra ();
		
		union.SouthAsia(an);
		
		India acountry = new Andhra ();
		India mycountry [] = new India [5];
		mycountry [0] = new Andhra ();
		mycountry [1] = new Jammu ();
		mycountry [2] = new Assam ();
		mycountry [3] = new India ();
		mycountry [4] = new Gujarat ();

		for (int s=0; s < mycountry.length; s++) {
			mycountry[s].states();
			
		}
	}
}