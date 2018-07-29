import java.util.Scanner;

public class variablelength {

	public static void main(String[] args) {
		//Scanner inputs = new Scanner (System.in);
		//System.out.println("Enter nos: ");
		//int [] thenos = new int (inputs[5]);
		//double nosarray [] = {23.45,21.65};
		System.out.println(multiplication(2,3,4,5));
		//System.out.println("The average is " + avg(nosarray));
	}
	/*static double avg (double...inputnos) {
		double tot = 0;
		for (double x: inputnos)
			tot += x;
		return tot/inputnos.length; */
	public static int multiplication (int...nos) {
		int multiply = 1;
		for (int a : nos)
		multiply *= a;
		return multiply;
	}
}