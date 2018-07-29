//package RevisionPractice;
public class MultiDimentional {

	public static void main(String[] args) {
		int states [][] = {{434,243} , {65} , {34,65,76,44}};
		int statenos [][] = {{1,2,3} , {4,5,6,7} ,{8} ,{9,10}};
		String thenames [][] = {{"Ram Sita"},{"Krishna Gopikas Radha Rukmini"},{"Diana Husband1 Husband2"},{"Modi"}};
		//table(states);
		nametable(thenames);
		
	}/*
	public static void table (int s[][]){
		for (int row = 0 ; row < s.length ; row++) {
			for (int col = 0 ; col < s[row].length ; col++) {
				System.out.print(s[row][col]+ "\t");	
			}
			System.out.println();*/
	public static void nametable (String y[][]) {
		for (int myrow = 0 ; myrow < y.length ; myrow++){
			for (int mycol = 0 ; mycol < y[myrow].length ; mycol++){
				System.out.println(y[myrow][mycol] + "\t");
			}
			System.out.println();
		}
	}		
}