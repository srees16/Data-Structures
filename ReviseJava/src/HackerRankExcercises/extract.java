package HackerRankExcercises;
import java.util.Scanner;
import java.util.Random;

public class extract {

	public static void main(String[] args) {
//Write a program to correspond each letter of English alphabet to its index value
		
//Write a program called PhoneKeyPad, which prompts user for a String (case insensitive), and converts to a sequence of
//keypad digits. Use a nested-if (or switch-case) in this exercise.
		
		
		/*
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter ");
		String s = sc.nextLine();
		//String s = "ghi";
		int t = s.length();
		switch (s) {
		case "a": System.out.println(1); break;
		case "b": System.out.println(2); break;
		case "c": System.out.println(3); break;
		case "d": System.out.println(4); break;
		case "e": System.out.println(5); break;
		case "f": System.out.println(6); break;
		case "g": System.out.println(7); break;
		case "h": System.out.println(8); break;
		case "i": System.out.println(9); break;
		case "j": System.out.println(10); break;
		case "k": System.out.println(11); break;
		case "l": System.out.println(12); break;
		case "m": System.out.println(13); break;
		case "n": System.out.println(14); break;
		case "o": System.out.println(15); break;
		case "p": System.out.println(16); break;
		case "q": System.out.println(17); break;
		case "r": System.out.println(18); break;
		case "s": System.out.println(19); break;
		case "t": System.out.println(20); break;
		case "u": System.out.println(21); break;
		case "v": System.out.println(22); break;
		case "w": System.out.println(23); break;
		case "x": System.out.println(24); break;
		case "y": System.out.println(25); break;
		case "z": System.out.println(26); break;
		default: System.out.println("That's not in English Alphabet!");
		}
		*/
		/*
		Random r = new Random ();
		int rdm = r.nextInt(20);
		System.out.println(rdm);
		
		String n = "0987654321";
		int l= n.length();
		for (int i=0; i<l;i++) {
			char c=n.charAt(i);
			if (c=='0') {
				System.out.print("Zero ");
			} else if (c=='1') {
				System.out.print("One ");
			} else if (c=='2') {
				System.out.print("Two ");
			}else if (c=='3') {
				System.out.print("Three ");
			}else if (c=='4') {
				System.out.print("Four ");
			}else if (c=='5') {
				System.out.print("Five ");
			}else if (c=='6') {
				System.out.print("Six ");
			}else if (c=='7') {
				System.out.print("Seven ");
			}else if (c=='8') {
				System.out.print("Eight ");
			}else if (c=='9') {
				System.out.print("Nine ");
			}
		} */
		/*
		String reply;
		Scanner scs = new Scanner (System.in);
		Random rd = new Random ();
		int rdnum = rd.nextInt(100)+1;
		System.out.println("Today's Number is: " + rdnum +"\n");
		System.out.println("\t\tHeYa! U up for a game?\n");
		
		do {
		System.out.print("Wats the no: ");
		int input= scs.nextInt();
		while (input!=rdnum) {
				System.out.print("Sorry! Try again:  ");
				input= scs.nextInt();
			}	
		
		System.out.println("Bang On!\n");
		System.out.print("You wanna play more? YES/NO: ");
		reply = scs.next();
			rdnum=rd.nextInt(100)+1;
			System.out.println("Now the number is: "+ rdnum);
		} while (reply.equalsIgnoreCase("yes"));
		*/
	}//main method ends

}//class ends