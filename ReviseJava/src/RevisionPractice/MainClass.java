//package RevisionPractice;

public class MainClass {

	public static void main(String[] args) {
		save s = new save ();
		s.i=10;
		save s1 = s;
		System.out.println(s1);
		
	}
}
class save {
	int i;
}