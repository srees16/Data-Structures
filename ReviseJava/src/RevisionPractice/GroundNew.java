package RevisionPractice;

import java.io.Console;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class GroundNew {
	
	public static void main(String[] args) {
		
		String b="ram";
		String g = new String ("ram");
		int w = b.hashCode();
		System.out.println(b==g);
		
		if (b.equals(g)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
		mother m = new mother();
		mother s = new son();
		mother d = new daughter();
		m.characteristics();
		s.characteristics();
		d.characteristics();
		m.familytree();
		char [] ch = {'s','r','e','e','s'};
		String cs = new String(ch);
		System.out.println(cs);
		char cr [] = {'s','s'};
		String sg = new String(cr);
		System.out.println(sg);
		String st = "Sachin ";
		String td = "Tendulkar";
		//String srt = st+td;
		String srt = st.concat(td);
		System.out.println(srt);
		
//Write program to find the biggest in the given set of nos using for loop
		
		int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
		int f [][] = {{7,8,9},{4,5,6},{1,2,3}};
		int c [][] = new int [2][3];
		
		for (int i=0; i<2;i++) {
			for (int j=0; j<3;j++) {
				c[i][j] = a[i][j]+f[i][j];
				System.out.print(c[i][j]+" ");
			} System.out.println();
		}
		
		int x = 20;
		Integer i = new Integer(x);
		Integer j = x;
		System.out.println(x+" "+i+" "+j);
		
		Integer y = 40;
		int p = y.intValue();
		int q=y;
		System.out.println(y+" "+p+" "+q);
		
		ops2 o = new ops2();
		System.out.println("before "+o.data);
		o.change(10);
		System.out.println("after "+o.data);
		
		operation oo = new operation ();
		System.out.println("before "+oo.date);
		o.change(150);
		System.out.println("after "+oo.date);
	}
}
class ops2 {
	int data = 50;
	
	void change (int data) {
		data = data+10;
	}
}
class operation {
	int date = 10;
	
	void change (operation o) {
		o.date=o.date+100;
	}
}