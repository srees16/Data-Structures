import java.util.ArrayList;
import java.util.*;

public class AreyList {

	public static void main(String[] args) {
		int myarray [] = {1,2,3,4,5,6,7,8,9};
		arraychange(myarray);
		for (int y:myarray)
		System.out.println(y);
	}
	public static void arraychange (int x[]) {
		for (int indx = 0 ; indx < x.length ; indx++)
			x[indx]+=10;
	}

}
/*
ArrayList <Integer> areylist = new ArrayList <Integer> ();
areylist.add(1);
areylist.add(2);
areylist.add(3);
areylist.add(4);
areylist.add(5);
areylist.add(6);

for (Integer x: areylist)
System.out.println(x);
System.out.println("Size of list is " + areylist.size());
areylist.iterator(); //find out what this iterator does!
*/