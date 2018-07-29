
public class outertostring {
	private String name;
	private innertostring event;
	
	public outertostring (String n, innertostring e) {
		name = n;
		event = e;
		
	}
	public String toString () {
		return String.format("Please be advised the event will be held on %s for farewell of %s", event, name);
	}
}
