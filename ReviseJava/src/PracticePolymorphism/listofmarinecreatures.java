//package PracticePolymorphism;

public class listofmarinecreatures {
	marinecreatures allvertebrae [] = new marinecreatures [5];
	private int indx = 0;
	
	public void add (marinecreatures mc) {
		if (indx < allvertebrae.length) {
			allvertebrae[indx]=mc;
			System.out.println("marine life at " + indx + " is added!");
			indx++;
		}
	}
	
}
