//package RevisionPractice;

public class rectangle extends polygon {
	
	rectangle (double l, double br) {
		length=l;
		bredth=br;
		area = 2*(length*bredth);
		System.out.println("Area of rectangle "+area);
	}
	/*void polygonarea () {
		area = 2*(length*bredth);
		System.out.println("Area of rectangle " +area);
	}*/
}