
public class Tostringex {
private int month, year, day;

public Tostringex (int m, int y , int d) {
	month = m;
	year = y;
	day = d;
	
	System.out.printf("Example here is %s \n", this );
	}
	public String toString () {
		return String.format("%d/%d/%d", day, month, year);
	}

}