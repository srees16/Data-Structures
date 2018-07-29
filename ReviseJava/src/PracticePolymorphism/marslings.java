//package PracticePolymorphism;

public class marslings {
	private mars thelist [] = new mars [5];
	private int i = 0;
	
	public void add (mars m) {
		if (i < thelist.length) {
			thelist[i]=m;
			//thelist is the mars array, and m is the mars object. If i = 0, then that line puts mars m at index 0 of mars[] thelist﻿
			System.out.println("Mars at place " + i);
			i++;
		}
	}
	
}
