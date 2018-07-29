
public class FinalKeyword {
	private int product;
	private final int COUNTER; 
	
	public FinalKeyword (int C) {
		COUNTER = C;
	}
	public int multiply () {
		product += COUNTER;
		return product;
	}
	public String toString () {
		return String.format("Product is %d \n", product); 
	}
}
