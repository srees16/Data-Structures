//package RevisionPractice;

public class forRhombus implements InterfaceMain {
	
	//double area;
	double l;
	double b;
	
	public void mMain () {
		System.out.println("From Rhombus m called here");
	}

	public void circlearea() {
		}
	
	public void rhombusarea () {
		}
	
	public static void rhombusarea (double l, double b) {
		double area = 2*l*b;
		System.out.println("Area of rhombus is " +area);
	}
	public static void rhombusarea (int l, int b) {
		int area = 2*l*b;
		System.out.println("Area of rhombus is " +area);
	}
}
