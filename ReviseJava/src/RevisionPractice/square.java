//package RevisionPractice;

public class square extends polygon {
	
	
	square (double l, double br) {
		length=l;
		bredth=br;
		area=length*bredth;
	}
	void polygonarea () {
		System.out.println("Area of square " +area);
	}
}