package HackerRankExcercises;

public class test {

	public static void main(String[] args) {
		String s = drome("daiad");
		String x= drome(s.substring(1))+s.charAt(0);
		if (s==x) {
			System.out.println("palindrome!!");
		} else {
			System.out.println("Not palindrome");
		}
	}
	public static String drome (String s) {
	if (s.length()<=1) {
		return s;
	} else {
		return drome (s.substring(1))+s.charAt(0);
		}
	}
}