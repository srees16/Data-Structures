package DataStructuresRefresh;

	public class Knapsack { //recursive implementation of 0-1 Knapsack problem
	 
	     static int max(int a, int b) { // A utility function that returns maximum of two integers
	    	 return (a > b)? a : b;
	     }
	      
	     static int knapSack(int W, int wt[], int val[], int n) { // Returns the maximum value that can be put in a knapsack of capacity W
	    	 if (n == 0 || W == 0)// Base Case
	    		 return 0;
	    	 if (wt[n-1] > W) //if weight of the nth item is more than Knapsack capacity W, then this item cannot be included in the optimal sol'n
	    		 return knapSack(W, wt, val, n-1);
	    	 else return max( val[n-1] + knapSack(W-wt[n-1], wt, val, n-1),knapSack(W, wt, val, n-1)); //Return the maximum of two cases:nth item included or not included
	      }
	 
	   public static void main(String args[]) {
	        int val[] = new int[]{60, 100, 120};
	        int wt[] = new int[]{10, 20, 30};
	    int  W = 50;
	    int n = val.length;
	    System.out.println(knapSack(W, wt, val, n));
	    }
}