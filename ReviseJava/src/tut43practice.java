
public class tut43practice {

	private String invaders;
	private tut42practice thatday;
	
	tut43practice (String whiteasses, tut42practice lastday) {
		invaders = whiteasses;
		thatday = lastday;
	}
	public String toString () {
		return String.format("So we finally got Independence on%s from the %s", thatday, invaders);
	}
}
