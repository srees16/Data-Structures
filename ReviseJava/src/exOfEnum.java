
public enum exOfEnum {
	sree ("guy","21"),
	rita ("gal" , "19"),
	rani ("woman" , "22");
	
	private final String desc , age;
	exOfEnum (String gender , String ageasnow) {
		desc = gender;
		age = ageasnow;
	
	}
	public String getgender () {
		return desc;
	}
	public String getage () {
		return age;
	}

}