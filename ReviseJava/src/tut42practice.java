
public class tut42practice {
	private int day;
	private int month;
	private int year;
	
	tut42practice (int i, int j, int k) {
		day = i;
		month= j;
		year = k;
		System.out.printf("We got Independence on%s \n" , this);
	}
	public String toString () {
		return String.format("% d/%d/%d", day, month, year);
	}
}
