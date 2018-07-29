
public enum onemorenum {
	
	Raji ("22", "MBA" , "KKD"),
	Nani ("23" , "BSC" , "KKD"),
	Mammy ("24" , "Xth" , "MPalem"),
	Total ("3" , "Masters", "India");
	
	private final String age , stndard, birthplace;

	onemorenum (String yrsofage, String qualification, String bornat) {
		age = yrsofage;
		stndard = qualification;
		birthplace = bornat;
	}
	public String getage (){
		return age;
	}
	public String getqual () {
		return stndard;
	}
	public String getplace () {
		return birthplace;
	}
}