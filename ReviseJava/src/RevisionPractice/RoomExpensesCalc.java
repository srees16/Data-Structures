//package RevisionPractice;

import java.util.Scanner;

public class RoomExpensesCalc {
	static int toBePaidPerHead;
	static int totalExpense;
	static int rent=4600;
	static int g=4;
	public static void main(String[] args) {
		
		int perheadExpense;
		int expensePaidAlready=0;
		int outstandingToBePaid;
		int expenseYouPaidAlready;

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Total Expense: ");
		totalExpense=sc.nextInt();
		toBePaidPerHead=totalExpense/g;
		System.out.println("Amount to Be Paid Per Head: "+toBePaidPerHead);
		System.out.print("Enter amount you already paid ");
		expenseYouPaidAlready=sc.nextInt();
		while (expenseYouPaidAlready>totalExpense) {
			System.out.println("Arn't you nut? Why would any sane person pay MORE than the total expenses of "+g+" people?!");
			System.out.print("Dont be over-smart n try again! ");
			expenseYouPaidAlready=sc.nextInt();
		}
		outstandingToBePaid = expenseYouPaidAlready - toBePaidPerHead;
			if (outstandingToBePaid<0) {
				System.out.println("I have to pay: "+outstandingToBePaid+" + Rent "+rent);
			} else {
				System.out.println("I have to get: "+outstandingToBePaid+" Rent "+rent);
			}
			for (int i=1;i<=g-1;i++) {
				System.out.print("Enter guy "+i+" expense ");
				expensePaidAlready=sc.nextInt();
				while (expensePaidAlready>totalExpense) {
					System.out.println("Arn't you nut? Why would any sane person pay MORE than total expenses of "+g+" people?!");
					System.out.print("Try again! ");
					expensePaidAlready=sc.nextInt();
				}
				if (expensePaidAlready>toBePaidPerHead) {
					System.out.println("You have to get "+(expensePaidAlready-toBePaidPerHead)+" + Rent "+rent);
				}else {
					System.out.println("You have to pay "+(toBePaidPerHead-expensePaidAlready)+" + Rent "+rent);
				}
			}	
		}
	}
/*
1. Calculate total expense for the trip: t
2. Enter no of guys: g
3. Divide the total expense by no of guys 
4. U will get individual expense to be paid by each person: toBePaidPerHead
5. Calculate individual expense already paid per head: expensePaidAlready
6. Subtract the individual expense already paid by to be paid per head: expensePaidAlready - toBePaidPerHead
*/