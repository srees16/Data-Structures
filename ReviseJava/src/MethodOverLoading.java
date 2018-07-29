import java.util.Scanner;


public class MethodOverLoading {

	public static void main(String[] args) {
		
	//System.out.println(newclass (55.8, 50));	
	
	Scanner acalc = new Scanner (System.in);
	System.out.println("Enter X");
	int x = acalc.nextInt();
	Scanner acalc1 = new Scanner (System.in);
	System.out.println("Enter Y");
	int y = acalc.nextInt();
	//MethodOverLoading newclaz = new MethodOverLoading ();
	//System.out.println(newclaz.newclass(x, y));
	System.out.println("The result is " + newclass (x , y));
	}
	public static int newclass (int x, int y) {
		return (x * y);
	}
	public static String newclass (int x, int y, String b, char c) {
		return (x * y)+b;
	}
	public static String newclass (String x, String y) {
		return (x + y);
	}
	public static double newclass (double x, double y) {
		return (x / y);
	}

}