//package RevisionPractice;

public class forCircle implements InterfaceMain {
	int r;
	static double PI=3.142;
	static double circumference;
	public void mMain () {
		System.out.println("From circle m called here");
	}
	public void circlearea() {
	
	}
	public static void circlearea (int r) {
		double c = 2*PI*r;
		circumference = c;
		System.out.println("Circumference of circle is " +c);
	}
	forCircle (int r) {
		double c = 2*PI*r;
		circumference = c;
		System.out.println("Circumference of circle from constructor is " +c);
	}
	public void rhombusarea() {
		
	}
}
