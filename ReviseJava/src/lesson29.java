
public class lesson29 {

	public static void main(String[] args) {
		
		int myarraylist[] = {11,12,13,14,15,16,17,18,19,20};
		int sum = 0;
		System.out.println("Index No\tArray Value");
		for (int indx = 0; indx < myarraylist.length; indx++)	{
		System.out.println(indx + "\t\t" + myarraylist[indx]);
		sum+=myarraylist[indx];
		}
		System.out.println("----------");
		System.out.println("Sum of the arraylist is " + sum);
		


//Heheee, i did this on my own combining the definition of Array n the table :D
	int myarraylist1[] = {11,12,13,14,15,16,17,18,19,20};
		int sum1=0;
		System.out.println("Index No\tArray Value");
		for (int indy=0 ; indy<myarraylist1.length ; indy++) {
		System.out.println(indy + "\t" + myarraylist1[indy]);
		sum1+=myarraylist1[indy];
		}
		System.out.println("----------");
		System.out.println("Sum of the arraylist is " + sum1);
	}
}