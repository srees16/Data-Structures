//package RevisionPractice;

public class triangle extends polygon {
	
	void area () {
		
	}
	triangle (double h, double b) {
		height=h;
		base=b;
		area=(height*base)/2;
		//System.out.println("Area of triangle "+area);
	}
	void polygonarea () {
		System.out.println("Area of triangle " +area);
	}
}