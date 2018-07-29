package HackerRankExcercises;

import java.util.Scanner;

public class Rufwork {

	public static void main(String[] args) {

		// Write a program called MagicSum, which prompts user for numbers, and
		// produce the sum of numbers containing the digit 8
		int sum = 0;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter a positive integer or -1 to exit: ");
			n = sc.nextInt();
			int digit = n % 10;
			if (digit == 8) {
				sum += n; // same as sum=sum+n
			}
		} while (n > 1);
		System.out.print("The magic sum is: " + sum);
		System.out.println();
	}

	// Boolean examples
	/*
	 * System.out.println(isOdd(34)); if (isTeenage(20)==true) {
	 * System.out.println("U in teens!"); } else {
	 * System.out.println("Not in teens"); }
	 */
	/*
	 * if (isPrime(7)) { System.out.println("Its Prime!!"); } else {
	 * System.out.println("Not Prime"); }
	 */
	// System.out.println(Math.sqrt(36));
	/*
	 * int ae=12345; while (ae>0) { int digit = ae%10;
	 * System.out.print(""+digit); ae=ae/10; digit=ae; }
	 */
	// System.out.println(hasEight(648453));
	// Put the } for Main method
	// Write a boolean method called hasEight(), which takes an int as input and
	// returns true if the number contains the digit
	// 8 (e.g., 18, 808)

	public static boolean hasEight (int e) {
		while (e > 0) {
			int digit = e % 10;
			if (digit == 8) {
				return true;
			}
			e = e / 10;
			digit = e;
		}
		return false;
	}

	/*
	 * public static boolean isTeenage (int t) { if (t>=13 && t<=19) return
	 * true; else return false; } public static boolean isOdd (int o) { if
	 * (o%2!=0) return true; else return false; }
	 */
	public static boolean isPrime(int p) {
		for (int i = 2; i <= (int) (Math.sqrt(p)); i++) {
			if (p % i == 0) {
				return false;
			}
		} return true;
	}
}