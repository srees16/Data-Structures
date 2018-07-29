
public class tut43 {

	private String candidate;
	private Tostringex proposeday;
	
	tut43 (String name, Tostringex thatday) {
		candidate = name;
		proposeday = thatday;
	}
	public String toString () {
		return String.format("I was proposed by %s on %s", candidate, proposeday);
	}
}
