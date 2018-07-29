
public class innertostring {
	private int day;
	private int month;
	private int year;
	
	public innertostring (int d, int m, int y) {
		day = d;
		month = m;
		year = y;
		System.out.printf("The event is planned on %s \n", this);
	}
	public String toString () {
		return String.format("%dst of %d month %d", day, month, year);
	}
}
